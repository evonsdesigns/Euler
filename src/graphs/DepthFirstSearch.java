package graphs;

import common.GraphNode;

import java.util.Stack;

public class DepthFirstSearch {


    public static void main(String[] args) {
        GraphNode root = new GraphNode(3);
        GraphNode left1 = new GraphNode(5);
        GraphNode right1 = new GraphNode(7);
        root.setLeft(left1);
        root.setRight(right1);

        GraphNode left2 = new GraphNode(6);
        GraphNode right2 = new GraphNode(19);

        GraphNode left3 = new GraphNode(35);
        GraphNode right3 = new GraphNode(96);
        left1.setLeft(left2);
        left1.setRight(right2);

        right1.setLeft(left3);
        right1.setRight(right3);

        GraphNode left4 = new GraphNode(44);
        left2.setLeft(left4);

        DepthFirstSearch search = new DepthFirstSearch();

        System.out.println(search.find(19, root));

        System.out.println(search.find(133, root));
    }


    private GraphNode find(int key, GraphNode root) {
        Stack<GraphNode> graphNodes = new Stack<GraphNode>();
        graphNodes.push(root);

        while(!graphNodes.isEmpty()) {

            GraphNode n = graphNodes.peek();
            System.out.println("Looking at " + n);
            if(n.getLeft() != null && !n.getLeft().isVisited()) {
                System.out.println("Pushing left " + n.getLeft());
                graphNodes.push(n.getLeft());
                continue;
            }
            if(n.getRight() != null && !n.getRight().isVisited()) {
                System.out.println("Pushing right " + n.getRight());
                graphNodes.push(n.getRight());
                continue;
            }

            if(n.getKey()==key) {
                return n;
            } else {
                n.setVisited(true);
                graphNodes.pop();
            }
        }
        return null;
    }
}
