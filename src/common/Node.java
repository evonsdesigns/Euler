package common;

public class Node {
        private int key;
        private Node left;
        private Node right;
        private boolean visited;

        public Node(int key) {
            this.key = key;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
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
