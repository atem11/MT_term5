package parser;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static guru.nidi.graphviz.model.Factory.*;

public class Tree {
    private String  node;
    private List<Tree> children = new ArrayList<>();
    private boolean term = false;

    private static Random random = new Random();
    private static Set<Integer> used = new HashSet<>();

    private static int anyRand() {
        int ans = random.nextInt(Integer.MAX_VALUE);
        while (used.contains(ans)) {
            ans = random.nextInt(Integer.MAX_VALUE);
        }
        used.add(ans);
        return ans;
    }

    public Tree(String node) {
        this.node = node;
    }

    public Tree(String node, boolean term) {
        this.node = node;
        this.term = term;
    }

    public void addChildren(Tree son) {
        children.add(son);
    }

    private String toString(int tab) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < tab; i++) {
            ans.append("\t╚");
        }
        if (children.size() == 0) {
            return ans.append(node).append("\n").toString();
        } else {
            ans.append(node).append("\n");
            for (Tree t : children) {
                ans.append(t.toString(tab + 1));
            }
            return ans.toString();
        }
    }

    @Override
    public String toString() {
        if (children.size() == 0) {
            return node + "\n";
        } else {
            StringBuilder ans = new StringBuilder();
            ans.append(node).append("\n");
            for (Tree t : children) {
                ans.append(t.toString(1));
            }
            return ans.toString();
        }
    }

    public boolean equals(Tree other) {
        if (!this.node.equals(other.node)) {
            return false;
        } else {
            if (children.size() != other.children.size()) {
                return false;
            } else {
                for (int i = 0; i < children.size(); i++) {
                    if (!children.get(i).equals(other.children.get(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private MutableNode node() {
        MutableNode root = mutNode(String.valueOf(anyRand()));
        root.add("label", node);
        if (term) {
            root.add(Color.BLUEVIOLET);
        } else {
            root.add(Color.GREENYELLOW);
        }
        for (Tree s : children) {
            root.addLink(s.node());
        }
        return root;
    }

    public void printGraph(String filename) throws IOException {
        MutableGraph root = mutGraph("Tree").setDirected(true).add(this.node());
        Graphviz.fromGraph(root).width(1280).render(Format.PNG).toFile(new File(filename));
    }
}
