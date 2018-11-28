grammar Calc;
options {
    language = Java;
}

@header {
package Lab3.garmmar.output;
import java.util.HashMap;
import java.util.Map;
}

@members {
Map<String, Integer> values = new HashMap<>();
}

ID
    : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;

INT
    :	'0'..'9'+
    ;

WS: [ \n\t\r]+ -> skip;


calc
    : statment+
	;
	
statment 
	: ID  '='  expr  ';' {
	    values.put($ID.text, $expr.value);
	    System.out.println($ID.text + " = " + $expr.value);
	}
	| expr ';' {
	    System.out.println("Result = " + $expr.value);
	}
	;

expr returns[int value]
	: resultFirst = multExpression {
	            $value = $resultFirst.value;
	        }
	  ('+' resultFollow = multExpression {
	            $value += $resultFollow.value;
	        }
	  |'-' resultFollow = multExpression {
	            $value -= $resultFollow.value;
	        }
	  )*
	;
	
multExpression returns[int value]
	: resultFirst = atom {
                $value = $resultFirst.value;
            }
	('*' resultFollow = atom {
                $value *= $resultFollow.value;
            }
	| '/' resultFollow = atom {
                $value /= $resultFollow.value;
            }
	)*
	;
	
atom returns[int value]
	: ID {
	    try {
	        $value = (int) values.get($ID.text);
        } catch (NullPointerException e) {
            System.err.println("Unresolved ID : " + $ID.text);
        }
	}
	| INT {
        $value = Integer.parseInt($INT.text);
	}
	| '(' expr ')' {
	    $value = $expr.value;
	}
	;


