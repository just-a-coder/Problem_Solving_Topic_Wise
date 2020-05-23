package com.problemsolving.binaryTree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryTreeOperation {
    int maxDepth(TreeNode root) {
        // Root being null means tree doesn't exist.
        if (root == null)
            return 0;

        // Get the depth of the left and right subtree
        // using recursion.
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Choose the larger one and add the root to it.
        if (leftDepth > rightDepth)
            return (leftDepth + 1);
        else
            return (rightDepth + 1);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        int leftarr[] = findDepthOfKey(root,x,0,root.val);
        int rightarr[] = findDepthOfKey(root,y,0,root.val);

        if (leftarr[0] == rightarr[0] && leftarr[1] != rightarr[1]) {
            return true;
        } else {
            return false;
        }
    }

    private int[] findDepthOfKey(TreeNode root, int key, int level, int parent) {
        if(root == null){
            int resultarr[] = new int[]{-1,-1};
            return resultarr;
        }

        if(root.val == key){
           int resultarr[] = new int[]{level,parent};
           return resultarr;
        }else{
            int leftarr[] = findDepthOfKey(root.left,key,level+1,root.val);
            int rightarr[] = findDepthOfKey(root.right,key,level+1,root.val);
            if (leftarr[0] != -1) {
                return leftarr;
            } else {
                return rightarr;
            }
        }
    }

    int[] getLevel(TreeNode root, int x, int level, int parent)
    {
        if(root==null)
        {
            int[] result = {-1,-1};
            return result;
        }
        if(x==root.val)
        {
            int[] result= {level,parent};
            return result;
        }
        else
        {
            int[] i = getLevel(root.left,x,level+1, root.val);
            int[] j = getLevel(root.right,x,level+1, root.val);
            if(i[0]!=-1)
                return i;
            else
                return j;
        }
    }

    /**
     * Traverse Level Order and Print all the Element
     */
    public void levelOrderTraversal(TreeNode root) {
        if(root == null) return;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val);
            if (node.left != null) {
                queue.addLast(node.left);
            }
            if (node.right != null) {
                queue.addLast(node.right);
            }
        }
    }
}
