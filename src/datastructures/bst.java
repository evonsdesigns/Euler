package datastructures;

import common.TreeNode;

/**
 * Created by josep_000 on 5/21/2014.
 * binary search tree
 */
public class bst {
    TreeNode root;
    int size;
    public bst() {
        size = 0;
        root = null;
    }

    public bst(TreeNode root) {
        this.root = root;
        size++;
    }

    public TreeNode insert(String data) {
        if(root == null) {
            size++;
            TreeNode n = new TreeNode(data);
            root = n;
            return root;
        }
        return insert(root, data);
    }

    private TreeNode delete(String data) {
        if(root == null) {
            return null;
        }
        return delete(root, null, data);
    }

    /**
     * Cases
     * - remove root, no children, X
     * - remove root, left only
     * - remove root, right only
     * - remove root, both children
     * - remove x node, no children X
     * - remove x node, left only
     * - remove x node, right only
     * - remove x node, both children
     */
    private TreeNode delete(TreeNode n, TreeNode parent, String data) {
        if(n != null) {
            if (n.getValue().compareTo(data) == 0) {
                if (n.getLeft() == null && n.getRight() == null) {
                    // no children
                    if (n == root) {
                        root = null;
                        return n;
                    }
                    if (parent.getLeft().equals(n)) {
                        parent.setLeft(null);
                    } else {
                        parent.setRight(null);
                    }
                    return n;

                } else if (n.getLeft() != null && n.getRight() == null) {
                    // left only
                    if(n == root) {
                        root = n.getLeft();
                        return n;
                    }
                    if(parent.getLeft().equals(n)) {
                        parent.setLeft(n.getLeft());
                    } else {
                        parent.setRight(n.getLeft());
                    }
                    return n;
                } else if (n.getLeft() == null && n.getRight() != null) {
                    // right only
                    if(n == root) {
                        root = n.getRight();
                        return n;
                    }
                    if(parent.getLeft().equals(n)) {
                        parent.setLeft(n.getRight());
                    } else {
                        parent.setRight(n.getRight());
                    }
                    return n;
                } else {
                    // both left and right (the hard case)


                    return n;
                }
            } else if (data.compareTo(n.getValue()) < 0) {
                return delete(n.getLeft(), n, data);
            } else {
                return delete(n.getRight(), n, data);
            }
        }
        return null;
    }

    private TreeNode insert(TreeNode n, String data) {
        if(data.compareTo(n.getValue()) < 0) {
            if(n.getLeft() == null) {
                TreeNode newNode = new TreeNode(data);
                size++;
                n.setLeft(newNode);
                return newNode;
            } else {
                return insert(n.getLeft(), data);
            }
        } else if(data.compareTo(n.getValue()) > 0) {
            if(n.getRight() == null) {
                TreeNode newNode = new TreeNode(data);
                size++;
                n.setRight(newNode);
                return newNode;
            } else {
                return insert(n.getRight(), data);
            }
        } else {
            return n;
        }
    }

    public int size() {
        return size;
    }

    public TreeNode getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return inOrderTraversal(root);
    }

    private String inOrderTraversal(TreeNode n) {
        String output = "";
        if(n.getLeft() != null) {
           output += inOrderTraversal(n.getLeft()) + " ";
        }
        output += n.getValue() + " ";
        if(n.getRight() != null) {
            output += inOrderTraversal(n.getRight()) + " ";
        }
        return output;
    }

}
