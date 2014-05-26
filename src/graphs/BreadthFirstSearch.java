package graphs;

import common.GraphNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Iterative approach to breadth first search
 * Worst case O(|V|)
 */
public class BreadthFirstSearch {

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


        BreadthFirstSearch search = new BreadthFirstSearch();

        System.out.println(search.find(96, root));
        System.out.println(search.find(44, root));
    }


    private GraphNode find(int key, GraphNode root){
        Queue<GraphNode> graphNodes = new LinkedList<>();
        graphNodes.offer(root);

        while(!graphNodes.isEmpty()) {
            GraphNode n = graphNodes.peek();
            System.out.println("Looking at " + n.getKey());
            if(n.getKey() == key) {
                return n;
            }
            if(n.getLeft() != null) {
                System.out.println("Queueing " + n.getLeft().getKey());
                graphNodes.offer(n.getLeft());
            }
            if(n.getRight() != null) {
                System.out.println("Queueing " + n.getRight().getKey());
                graphNodes.offer(n.getRight());
            }
            graphNodes.poll();
        }

        return null;
    }


}
