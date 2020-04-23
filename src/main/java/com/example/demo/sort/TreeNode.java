package com.example.demo.sort;

import lombok.Data;

@Data
public class TreeNode {

    private String value;
    private TreeNode treeNode_left;
    private TreeNode treeNode_right;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNode getTreeNode_left() {
        return treeNode_left;
    }

    public void setTreeNode_left(TreeNode treeNode_left) {
        this.treeNode_left = treeNode_left;
    }

    public TreeNode getTreeNode_right() {
        return treeNode_right;
    }

    public void setTreeNode_right(TreeNode treeNode_right) {
        this.treeNode_right = treeNode_right;
    }
}
