grammar Grammarv2;

options {
    language = Java;
}

@header {
package Lab4.grammar.parser.output;
import Lab4.grammar.Grammar;
import Lab4.grammar.rules.*;
import Lab4.grammar.term.*;
}

start returns [Grammar g]
    : 'grammar' NONTERM_NAME    { $g = new Grammar($NONTERM_NAME.text); }
        (rules[$g] ';')+        {  }
    ;

rules [Grammar g]
    : TERM_NAME ':' STRING  { $g.addTerm(new Term($TERM_NAME.text, $STRING.text)); }
    | 'WS' '->' STRING      { $g.addWS($STRING.text); }
    | nonterm_rule          { $g.addNonTerm($nonterm_rule.t); }
    ;

nonterm_rule returns [NonTerm t]
    : NONTERM_NAME          { $t = new NonTerm($NONTERM_NAME.text); }
        args?               { $t.addArgs($args.a); }
        ret_arg? ':'        { $t.addRetArgs($ret_arg.a); }
        pattern             { $t.addRule($pattern.r); }
        ( '|' pattern       { $t.addRule($pattern.r); } )*
    ;

pattern returns [Rule r]
    :   { $r = new Rule(); }
        (one_pat { $r.addTerm($one_pat.t); } )+
    | 'Eps' { $r = null; }
    ;

one_pat returns [ObjTerm t]
    : TERM_NAME         { $t = new Term($TERM_NAME.text); }
    | NONTERM_NAME      { NonTerm nt = new NonTerm($NONTERM_NAME.text); }
        ( '(' param     { nt.addParameter($param.s); }
        (',' param      { nt.addParameter($param.s); } )*
        ')' )?          { $t = nt; }
    | CODE              { $t = new Code($CODE.text); }
    ;

param returns [String s]
    : NONTERM_NAME  { $s = $NONTERM_NAME.text; }
    | TERM_NAME     { $s = $TERM_NAME.text; }
    | CODE          { $s = $CODE.text; }
    ;

args returns [List<Argument> a]
    : '(' arg       { $a = new ArrayList<>(); $a.add($arg.a); }
        ( ',' arg   { $a.add($arg.a); })*
       ')'
    |               { $a = null; }
    ;

arg returns [Argument a]
    : NONTERM_NAME ':' type { $a = new Argument($NONTERM_NAME.text, $type.t); }
    ;

type returns [String t]
    : NONTERM_NAME  { $t = $NONTERM_NAME.text; }
    | TERM_NAME     { $t = $TERM_NAME.text;}
    ;

ret_arg returns [List<Argument> a]
    : 'returns' '[' arg { $a = new ArrayList<>(); $a.add($arg.a); }
        (',' arg        { $a.add($arg.a); })*
        ']'
    |                   { $a = null; }
    ;

TERM_NAME
    : ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

NONTERM_NAME
    : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

STRING
    : '"' (~('"'))* '"'
    ;

CODE
    : '{' (~('{'|'}')+ CODE?)* '}'
    ;

WS  : [ \t\r\n] -> skip;