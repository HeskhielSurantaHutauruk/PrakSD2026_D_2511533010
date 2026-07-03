package pekan9_2511533010;

public class BinaryThree_2511533010 {
    private Node_2511533010 root_3010;
    private Node_2511533010 currentNode_3010;

    public BinaryThree_2511533010() {
        this.root_3010 = null;
    }

    public boolean search_2511533010(int data_3010) {
        assert this.root_3010 != null : "Root NULL.";
        return search_2511533010(root_3010, data_3010);
    }

    private boolean search_2511533010(Node_2511533010 node_3010, int data_3010) {
        if (node_3010.getData_2511533010() == data_3010) return true;

        if (node_3010.getLeft_2511533010() != null)
            return search_2511533010(node_3010.getLeft_2511533010(), data_3010);

        if (node_3010.getRight_2511533010() != null)
            return search_2511533010(node_3010.getRight_2511533010(), data_3010);

        return false;
    }

    public void printInOrder_2511533010() {
        assert this.root_3010 != null : "Root NULL.";
        this.root_3010.printInOrder_2511533010(root_3010);
    }

    public void printPreOrder_2511533010() {
        assert this.root_3010 != null : "Root NULL.";
        this.root_3010.printPreOrder_2511533010(root_3010);
    }

    public void printPostOrder_2511533010() {
        assert this.root_3010 != null : "Root NULL.";
        this.root_3010.printPostOrder_2511533010(root_3010);
    }

    public Node_2511533010 getRoot_2511533010() {
        return this.root_3010;
    }

    public boolean isEmpty_2511533010() {
        return this.root_3010 == null;
    }

    public int countNodes_2511533010() {
        return this.countNodes_2511533010(root_3010);
    }

    private int countNodes_2511533010(Node_2511533010 node_3010) {
        int count_3010 = 1;
        if (node_3010 == null) {
            return 0;
        } else {
            count_3010 += countNodes_2511533010(node_3010.getLeft_2511533010());
            count_3010 += countNodes_2511533010(node_3010.getRight_2511533010());
            return count_3010;
        }
    }

    public void print_2511533010() {
        assert this.root_3010 != null : "Root NULL.";
        this.root_3010.print_2511533010();
    }

    public Node_2511533010 getCurrent_2511533010() {
        return this.currentNode_3010;
    }

    public void setCurrent_2511533010(Node_2511533010 node_3010) {
        this.currentNode_3010 = node_3010;
    }

    public void setRoot_2511533010(Node_2511533010 root_3010) {
        this.root_3010 = root_3010;
    }
}