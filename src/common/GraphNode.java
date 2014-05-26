package common;

public class GraphNode {
        private int key;
        private GraphNode left;
        private GraphNode right;
        private boolean visited;

        public GraphNode(int key) {
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

        public GraphNode getLeft() {
            return left;
        }

        public void setLeft(GraphNode left) {
            this.left = left;
        }

        public GraphNode getRight() {
            return right;
        }

        public void setRight(GraphNode right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "GraphNode: " + key;
        }
}
