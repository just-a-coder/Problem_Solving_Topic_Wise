package com.problemsolving.contest;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

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

public class ContestTree {
    int count;
    StringBuilder sb;
    public int pseudoPalindromicPaths(TreeNode root) {
        count = 0;
        sb = new StringBuilder();
        dfs(root, sb);
        return count;
    }

    private void dfs(TreeNode root, StringBuilder sb) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                sb.append(root.val);
                if (isPalindrome(sb.toString())) {
                    count++;
                }
            } else {
                sb.append(root.val);
                dfs(root.left, sb);
                dfs(root.right, sb);
            }
        }
    }

    static boolean isPalindrome(String str) {
        List<Character> alist = new ArrayList<>();
        for (char ch: str.toCharArray()){
            if (alist.contains(ch)) {
                alist.remove(ch);
            } else {
                alist.add(ch);
            }
        }

        if ((alist.size() % 2 == 0 && alist.size() == 0) || (alist.size() % 2 == 1 && alist.size() <= 1)) {
            return true;
        } else {
            return false;
        }
    }
}
