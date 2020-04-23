package com.example.demo.sort;

import java.util.Arrays;
import java.util.Stack;

public class TreeNodeSort {

    public TreeNode treedNode(){
        return null;
    }

    /**
     * 前序遍历树🌲
     *一、前序遍历：访问顺序：先根节点，再左子树，最后右子树；上图的访问结果为：GDAFEMHZ。
     *二、中序遍历：访问顺序：先左子树，再根节点，最后右子树；上图的访问结果为：ADEFGHMZ。
     *三、后序遍历：访问顺序：先左子树，再右子树，最后根节点，上图的访问结果为：AEFDHZMG。
     * @param root
     */
    public void preOrderTraverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            if (node != null) {
                System.out.print(node.getValue() + "->");
                stack.push(node);
                node = node.getTreeNode_left();
            } else {
                TreeNode tem = stack.pop();
                node = tem.getTreeNode_right();
            }
        }
    }

    public static void main(String[] args) {
        TreeNodeSort sort = new TreeNodeSort();
        TreeNode node1 = new TreeNode();node1.setValue("G");
        TreeNode node2 = new TreeNode();node2.setValue("D");
        TreeNode node3 = new TreeNode();node3.setValue("A");
        TreeNode node4 = new TreeNode();node4.setValue("F");
        TreeNode node5 = new TreeNode();node5.setValue("E");
        TreeNode node6 = new TreeNode();node6.setValue("M");
        TreeNode node7 = new TreeNode();node7.setValue("H");
        TreeNode node8 = new TreeNode();node8.setValue("Z");
        node1.setTreeNode_left(node2);node1.setTreeNode_right(node6);
        node2.setTreeNode_left(node3);node2.setTreeNode_right(node4);
        node4.setTreeNode_left(node5);node6.setTreeNode_left(node7);
        node6.setTreeNode_right(node8);
        sort.preOrderTraverse(node1);

    }
}
