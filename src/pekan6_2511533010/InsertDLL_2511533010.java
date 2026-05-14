package pekan6_2511533010;

public class InsertDLL_2511533010 {
	// MENAMBAHKAN NODE DI AWAL DLL
	static NodeDLL_2511533010 insertBegin_3010 (NodeDLL_2511533010 head_3010, int data_3010) {
		NodeDLL_2511533010 new_node = new NodeDLL_2511533010(data_3010);
	// jadikan pointer nextnya head
	new_node.next_3010 = head_3010;
	if (head_3010 != null) {
		head_3010.prev_3010 = new_node;
	}
	return new_node;
	}

	public static  NodeDLL_2511533010 insertEnd_3010(NodeDLL_2511533010 head_3010, int newData_3010) {
		NodeDLL_2511533010 newNode_3010 = new NodeDLL_2511533010(newData_3010);
		if (head_3010 == null) {
			head_3010 = newNode_3010;
		} else {
			NodeDLL_2511533010 curr = head_3010;
			while (curr.next_3010 != null) {
				curr = curr.next_3010;
			}
			curr.next_3010 = newNode_3010;
			newNode_3010.prev_3010 = curr;
			}
		return head_3010;
		}
	
	public static NodeDLL_2511533010 insertAtPosition_3010(NodeDLL_2511533010 head_3010, int pos_3010, int new_data_3010) {
		NodeDLL_2511533010 new_node = new NodeDLL_2511533010(new_data_3010);
		if (pos_3010 == 1) {
			new_node.next_3010 = head_3010;
			if (head_3010 != null){
				head_3010.prev_3010 = new_node;}
			return head_3010;
			
		}
		NodeDLL_2511533010 curr = head_3010;
		for (int i = 1; i < pos_3010 - 1 && curr != null; ++ i ) {
			curr = curr.next_3010;
		} if (curr == null) {
			System.out.println ("posisi tidak ada" ); return head_3010;
		}
		new_node.prev_3010 = curr;
		new_node.next_3010 = curr.next_3010;
		curr.next_3010 = new_node;
		if (new_node.next_3010 != null) { new_node.next_3010.prev_3010 = new_node;} return head_3010;
		}
	public static void printList (NodeDLL_2511533010 head_3010) {
		NodeDLL_2511533010 curr = head_3010;
		while (curr != null) { System.out.print(curr.data_3010 + " <-> "); curr = curr.next_3010;}
		System.out.println();
	}
	public static void main (String[] args) { 
		NodeDLL_2511533010 head_3010 = new NodeDLL_2511533010(2);
		head_3010.next_3010 = new NodeDLL_2511533010(3);
		head_3010.next_3010.prev_3010 = head_3010;
		head_3010.next_3010.next_3010 = new NodeDLL_2511533010(5);
		head_3010.next_3010.next_3010.prev_3010 = head_3010.next_3010;
		
		System.out.print ("DLL awal: ");
		printList(head_3010);
		
		head_3010 = insertBegin_3010(head_3010, 1);
		System.out.print ( "simpul 1 ditambah di awal:");
		printList(head_3010);
		
		System.out.print ( "Simpul 6 ditambah di akhir:");
		int data_3010 = 6;
		head_3010 = insertEnd_3010 (head_3010, data_3010);
		printList(head_3010);
		
		System.out.print("tambah node 4 di posisi 4 : ");
		int data2 = 4;
		int pos_3010 = 4;
		head_3010 = insertAtPosition_3010(head_3010, pos_3010, data2);
		printList(head_3010);
	}
	}
