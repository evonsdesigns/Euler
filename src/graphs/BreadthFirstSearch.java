package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

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


        BreadthFirstSearch search = new BreadthFirstSearch();

        System.out.println(search.find(96, root));
        System.out.println(search.find(44, root));
    }


    private Node find(int key, Node root){
        Queue<Node> nodes = new LinkedList<>();
        nodes.offer(root);

        while(!nodes.isEmpty()) {
            Node n = nodes.peek();
            System.out.println("Looking at " + n.getKey());
            if(n.getKey() == key) {
                return n;
            }
            if(n.getLeft() != null) {
                System.out.println("Queueing " + n.getLeft().getKey());
                nodes.offer(n.getLeft());
            }
            if(n.getRight() != null) {
                System.out.println("Queueing " + n.getRight().getKey());
                nodes.offer(n.getRight());
            }
            nodes.poll();
        }

        return null;
    }

    private static class Node {
        private int key;
        private Node left;
        private Node right;

        public Node(int key) {
            this.key = key;
        }

        public int getKey() {
            return key;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node: " + key;
        }
    }
}
