package graphs;

import common.Node;

import java.util.Stack;

public class DepthFirstSearch {


    public static void main(String[] args) {
        Node root = new Node(3);
        Node left1 = new Node(5);
        Node right1 = new Node(7);
        root.setLeft(left1);
        root.setRight(right1);

        Node left2 = new Node(6);
        Node right2 = new Node(19);

        Node left3 = new Node(35);
        Node right3 = new Node(96);
        left1.setLeft(left2);
        left1.setRight(right2);

        right1.setLeft(left3);
        right1.setRight(right3);

        Node left4 = new Node(44);
        left2.setLeft(left4);

        DepthFirstSearch search = new DepthFirstSearch();

        System.out.println(search.find(19, root));

        System.out.println(search.find(133, root));
    }


    private Node find(int key, Node root) {
        Stack<Node> nodes = new Stack<Node>();
        nodes.push(root);

        while(!nodes.isEmpty()) {

            Node n = nodes.peek();
            System.out.println("Looking at " + n);
            if(n.getLeft() != null && !n.getLeft().isVisited()) {
                System.out.println("Pushing left " + n.getLeft());
                nodes.push(n.getLeft());
                continue;
            }
            if(n.getRight() != null && !n.getRight().isVisited()) {
                System.out.println("Pushing right " + n.getRight());
                nodes.push(n.getRight());
                continue;
            }

            if(n.getKey()==key) {
                return n;
            } else {
                n.setVisited(true);
                nodes.pop();
            }
        }
        return null;
    }
}
