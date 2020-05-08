package com.problemsolving.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTree {
    TreeNode root;

    public static void prettyPrintTree(TreeNode treeNode, String prefix, boolean isLeft) {
        if (treeNode == null) {
            System.out.println("Empty tree");
            return;
        }

        if (treeNode.right != null) {
            prettyPrintTree(treeNode.right, prefix + (isLeft ? "│   " : "    "), false);
        }

        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + treeNode.val);

        if (treeNode.left != null) {
            prettyPrintTree(treeNode.left, prefix + (isLeft ? "    " : "│   "), true);
        }
    }

    public static void prettyPrintTree(TreeNode treeNode) {
        prettyPrintTree(treeNode, "", true);
    }

    public static String treeNodeToString(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        String output = "";
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()) {
            TreeNode treeNode = treeNodeQueue.remove();

            if (treeNode == null) {
                output += "null, ";
                continue;
            }

            output += String.valueOf(treeNode.val) + ", ";
            treeNodeQueue.add(treeNode.left);
            treeNodeQueue.add(treeNode.right);
        }
        return "[" + output.substring(0, output.length() - 2) + "]";
    }

    // Driver code
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(2);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(4);

//        tree.root.right.left = new TreeNode(5);
//        tree.root.right.right = new TreeNode(6);
//        tree.root.right.right.left = new Node(8);
//        tree.root.right.left.right = new Node(7);
        BinaryTreeOperation treeOperation = new BinaryTreeOperation();
        //System.out.println(treeNodeToString(tree.root));
        prettyPrintTree(tree.root);
        System.out.println("Max Depth: " + treeOperation.maxDepth(tree.root));
        System.out.println(treeOperation.isCousins(tree.root, 3, 2));
    }
}