package pekan5_2511533010;

public class HapusSLL_2511533010 {
	//FUNGSI UNTUK MENGHAPUS HEAD
	public static NodeSLL_2511533010 deleteHead_3010(NodeSLL_2511533010 head_3010) {
		// jika SLL kosong
		if (head_3010 == null)
		return null;
		//pindahkan head ke node berikutnya
		head_3010 = head_3010.next_3010;
		// return head baru
		return head_3010;
	}
	// fungsi menghapus node SLL terakhir
	public static NodeSLL_2511533010 removeLastNode_3010 (NodeSLL_2511533010 head_3010) {
		// jjika list kosong, return null
		if (head_3010 == null) {
			return null;
		}
		// temukan node terakhir ke dua
		NodeSLL_2511533010 secondLast_3010 = head_3010;
		while (secondLast_3010.next_3010.next_3010 != null) {
			secondLast_3010 = secondLast_3010.next_3010;
		}
		// hapus node terakhir
		secondLast_3010.next_3010 = null;
		return head_3010;
	}
//fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511533010 deleteNode_3010 (NodeSLL_2511533010 head_3010, int position_3010) {
		NodeSLL_2511533010 temp_3010=head_3010;
		NodeSLL_2511533010 prev_3010 = null;
		// jika LL null
		if (temp_3010 == null) return head_3010;
		// kasus1 head dihapus
		if (position_3010 == 1) {
			head_3010 = temp_3010.next_3010;
			return head_3010; }
			//kasus 2: menghapus node di tengah
			// telusuri ke node yang di hapus
			for (int i = 1; temp_3010 != null && i < position_3010; i++) {
				prev_3010 = temp_3010;
				temp_3010 = temp_3010.next_3010; }
				// jika di temukan, hapus node 
				if (temp_3010 != null) {
					prev_3010.next_3010 = temp_3010.next_3010; 
				}
				else {
					System.out.println ("data tidak ada"); }
					return head_3010;
					} 
	
					//fungsi mencetak SLL
				public static void printList_3010(NodeSLL_2511533010 head_3010) {
					NodeSLL_2511533010 curr_3010 = head_3010;
					while (curr_3010.next_3010 != null) {
						System.out.print(curr_3010.data_3010+"-->");
						curr_3010 = curr_3010.next_3010; }
						if (curr_3010.next_3010 == null) {
							System.out.print(curr_3010.data_3010);
							System.out.println();
						}
				}
				// kelas main
				public static void main(String[] args) {
					//buat sll 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> null
					NodeSLL_2511533010 head_3010 = new NodeSLL_2511533010 (1);
					head_3010.next_3010 = new NodeSLL_2511533010 (2);
					head_3010.next_3010.next_3010 = new NodeSLL_2511533010 (3);
					head_3010.next_3010.next_3010.next_3010 = new NodeSLL_2511533010 (4);
					head_3010.next_3010.next_3010.next_3010.next_3010 = new NodeSLL_2511533010 (5);
					head_3010.next_3010.next_3010.next_3010.next_3010.next_3010 = new NodeSLL_2511533010 (6);
					// cetak list awal
					System.out.println ("List Awal: ");
					printList_3010 (head_3010);
					//hapus head
					head_3010 = deleteHead_3010(head_3010);
					System.out.println("List setelah head dihapus: ");
					printList_3010 (head_3010);
					// hapus node terakhir
					head_3010 = removeLastNode_3010 (head_3010);
					System.out.println ("list setelah posisi 2 dihapus: ");
					printList_3010(head_3010);
					
				}
}
