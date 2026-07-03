package pekan9_2511533010;

import pekan8_2511533010.Utils.Utils;
import pekan9_2511533010.helper.StringUtils;

public class Node_2511533010 {
    public int data_3010;
    public Node_2511533010 left_3010;
    public Node_2511533010 right_3010;

    public Node_2511533010(int data_3010) {
        this.data_3010 = data_3010;
        this.left_3010 = null;
        this.right_3010 = null;
    }

    public void setLeft_2511533010(Node_2511533010 node_3010) {
        if (this.left_3010 == null) this.left_3010 = node_3010;
    }

    public void setRight_2511533010(Node_2511533010 node_3010) {
        if (this.right_3010 ==  null) this.right_3010 = node_3010;
    }

    public Node_2511533010 getLeft_2511533010() {
        return this.left_3010;
    }

    public Node_2511533010 getRight_2511533010() {
        return this.right_3010;
    }

    public int getData_2511533010() {
        return this.data_3010;
    }

    public void setData_2511533010(int data_3010) {
        this.data_3010 = data_3010;
    }

    public void printPreOrder_2511533010(Node_2511533010 node_3010) {
        if (node_3010 == null) return;
        Utils.printStatement(node_3010.data_3010 + StringUtils.empty());
        printPreOrder_2511533010(node_3010.left_3010);
        printPreOrder_2511533010(node_3010.right_3010);
    }

    public void printPostOrder_2511533010(Node_2511533010 node_3010) {
        if (node_3010 == null) return;
        printPostOrder_2511533010(node_3010.left_3010);
        printPostOrder_2511533010(node_3010.right_3010);
        Utils.printStatement(node_3010.data_3010 + StringUtils.empty());
    }

    public void printInOrder_2511533010(Node_2511533010 node_3010) {
        if (node_3010 == null) return;
        printInOrder_2511533010(node_3010.left_3010);
        Utils.printStatement(node_3010.data_3010 + StringUtils.empty());
        printInOrder_2511533010(node_3010.right_3010);
    }

    public void print_2511533010() {
        this.print_2511533010("", true, "");
    }

    public void print_2511533010(String prefix_3010, boolean isTail_3010, String sb_3010) {
        if (this.right_3010 != null)
            this.right_3010.print_2511533010(prefix_3010 + (isTail_3010 ? "|   " : "   "), false, sb_3010);

        Utils.printLineStatement(prefix_3010 + (isTail_3010 ? "\\-- " : "/-- ") + this.data_3010);

        if (this.left_3010 != null)
            this.right_3010.print_2511533010(prefix_3010 + (isTail_3010 ? "   " : "|   "), true, sb_3010);

    }
}