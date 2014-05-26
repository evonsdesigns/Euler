package test.datastructures;

import common.TreeNode;
import datastructures.bst;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by josep_000 on 5/21/2014.
 */
public class bstTest {


    @Test
    public void testInsert() {
        bst tree = new bst();
        tree.insert("omega");
        tree.insert("alpha");
        tree.insert("beta");
        tree.insert("zeta");
        TreeNode root = tree.getRoot();
        Assert.assertEquals(4, tree.size());
        Assert.assertEquals("omega", root.getValue());
        Assert.assertEquals("alpha", root.getLeft().getValue());
        Assert.assertEquals("beta", root.getLeft().getRight().getValue());
        Assert.assertEquals("zeta", root.getRight().getValue());

    }

    @Test
    public void testInsertDuplicates() {
        bst tree = new bst();
        tree.insert("omega");
        tree.insert("alpha");
        tree.insert("beta");
        tree.insert("zeta");
        tree.insert("alpha");
        TreeNode root = tree.getRoot();
        Assert.assertEquals(4, tree.size());
        Assert.assertEquals("omega", root.getValue());
        Assert.assertEquals("alpha", root.getLeft().getValue());
        Assert.assertEquals("beta", root.getLeft().getRight().getValue());
        Assert.assertEquals("zeta", root.getRight().getValue());
    }
}
