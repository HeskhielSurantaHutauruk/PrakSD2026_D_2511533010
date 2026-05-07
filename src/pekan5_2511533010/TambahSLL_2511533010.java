package pekan5_2511533010;

public class TambahSLL_2511533010 {
	public static NodeSLL_2511533010 insertAtFront_3010 (NodeSLL_2511533010 head_3010, int value_3010) {
		NodeSLL_2511533010 new_node_3010 = new NodeSLL_2511533010(value_3010);
		new_node_3010.next_3010 = head_3010;
		return new_node_3010;
	}
	//fungsi menambahkan node di akhir SLL 
	public static NodeSLL_2511533010 insertAtEnd_3010 (NodeSLL_2511533010 head_3010, int value_3010) {
		// buatlah sebuah node dengan sebuah nilai
		NodeSLL_2511533010 new_Node_3010 = new NodeSLL_2511533010(value_3010);
		//jika list kosong maka node jadi head
		if (head_3010 == null) {
		return new_Node_3010;
		}
		// simpan head ke variable sementara
		NodeSLL_2511533010 last = head_3010;
		// telusuri ke node akhir 
		while (last.next_3010 != null) {
			last = last.next_3010;
		}
		// ubah pointer
		last.next_3010 = new_Node_3010;
		return head_3010;
	}
	static NodeSLL_2511533010 GetNode_3010(int data_3010) {
		return new NodeSLL_2511533010(data_3010);
	}
	static NodeSLL_2511533010 insertPos_3010 (NodeSLL_2511533010 headNode_3010, int position_3010, int value_3010) {
		NodeSLL_2511533010 head_3010 = headNode_3010;
		if (position_3010 < 1)
			System.out.print ("invalid Position!");
		if (position_3010 == 1) {
			NodeSLL_2511533010 new_node_3010 = new NodeSLL_2511533010(value_3010);
		new_node_3010.next_3010 = head_3010;
		return new_node_3010;
		} else {
			while  (position_3010-- != 0) {
				if (position_3010 == 1) {
					NodeSLL_2511533010 new_node_3010 = GetNode_3010(value_3010);
					new_node_3010.next_3010 = headNode_3010.next_3010;
					headNode_3010.next_3010 = new_node_3010;
					break;
				}
				headNode_3010 = headNode_3010.next_3010;
			}
			if (position_3010 != 1)
				System.out.print ("Posisi di luar jangkauan!"); }
			return head_3010; 	}
		public static void printList_3010 (NodeSLL_2511533010 head_3010) {
			NodeSLL_2511533010 curr_3010 = head_3010;
			while (curr_3010.next_3010 != null) {
				System.out.print (curr_3010.data_3010+"-->");
				curr_3010 = curr_3010.next_3010;
			}
			if (curr_3010.next_3010 == null) {
				System.out.print(curr_3010.data_3010); 
				}
			System.out.println ();
		}
		public static void main(String[] args) {
			// buat linked list 2->3->5_>6
			NodeSLL_2511533010 head_3010 = new NodeSLL_2511533010(2);
			head_3010.next_3010 = new NodeSLL_2511533010 (3);
			head_3010.next_3010.next_3010 = new NodeSLL_2511533010 (5);
			head_3010.next_3010.next_3010.next_3010 = new NodeSLL_2511533010 (6);
			// cetak list asli
			System.out.print("Senarai berantai awal: ");
			printList_3010(head_3010);
			//tambahkan node baru di depan
			System.out.print("tambah 1 simpul didepan: ");
			int data_3010 = 1;
			head_3010 = insertAtFront_3010 (head_3010, data_3010);
			// cetak update list
			printList_3010(head_3010);
			// tambahkan node baru dari belakang
			System.out.print("tambah 1 simpul dibelakang: ");
			int data2 = 7;
			head_3010 = insertAtEnd_3010 (head_3010, data2);
			//cetak update ls=ist
			printList_3010 (head_3010);
			System.out.print ("tambah 1 simpul ke data 4: ");
			int data3 = 4;
			int pos_3010 = 4;
			head_3010 = insertPos_3010 (head_3010, pos_3010, data3);
			// cetak update list
			printList_3010 (head_3010);
		}
}
