package pekan9_2511533010;

import pekan8_2511533010.Utils.Utils;

public class BinaryThreeDriver_2511533010 {
    public static void main(String[] args) {
        //-- membuat pohon
        BinaryThree_2511533010 tree_3010 = new BinaryThree_2511533010();
        Utils.printLineStatement("Jumlah simpul awal pohon: ");
        Utils.printLineStatement(tree_3010.countNodes_2511533010());

        //-- menjadikan simpul 1 sebagai root
        Node_2511533010 root_3010 = new Node_2511533010(1);
        tree_3010.setRoot_2511533010(root_3010);
        Utils.printLineStatement("Jumlah simpul jika hanya ada root: ");
        Utils.printLineStatement(tree_3010.countNodes_2511533010());

        //-- tambah nodes baru
        Node_2511533010 node2_3010 = new Node_2511533010(2);
        Node_2511533010 node3_3010 = new Node_2511533010(3);
        Node_2511533010 node4_3010 = new Node_2511533010(4);
        Node_2511533010 node5_3010 = new Node_2511533010(5);
        Node_2511533010 node6_3010 = new Node_2511533010(6);
        Node_2511533010 node7_3010 = new Node_2511533010(7);
        Node_2511533010 node8_3010 = new Node_2511533010(8);
        Node_2511533010 node9_3010 = new Node_2511533010(9);

        root_3010.setLeft_2511533010(node2_3010);
        node2_3010.setLeft_2511533010(node4_3010);
        node2_3010.setRight_2511533010(node5_3010);
        node4_3010.setRight_2511533010(node8_3010);

        root_3010.setRight_2511533010(node3_3010);
        node3_3010.setLeft_2511533010(node6_3010);
        node3_3010.setRight_2511533010(node7_3010);
        node6_3010.setLeft_2511533010(node9_3010);

        //-- set root
        tree_3010.setCurrent_2511533010(tree_3010.getRoot_2511533010());
        Utils.printLineStatement("Menampilkan simpul terakhir: ");
        Utils.printLineStatement(tree_3010.getCurrent_2511533010().getData_2511533010());

        Utils.printLineStatement("Jumlah simpul; setelah simpul 7 ditambahkan: ");
        Utils.printLineStatement(tree_3010.countNodes_2511533010());

        Utils.printLineStatement("In Order: ");
        tree_3010.printInOrder_2511533010();

        Utils.printLineStatement("\nPre Order: ");
        tree_3010.printPreOrder_2511533010();

        Utils.printLineStatement("\nPost Order: ");
        tree_3010.printPostOrder_2511533010();

        Utils.printLineStatement("\nMenampilkan simpul dalam bentuk pohon: ");
        tree_3010.print_2511533010();
    }
}