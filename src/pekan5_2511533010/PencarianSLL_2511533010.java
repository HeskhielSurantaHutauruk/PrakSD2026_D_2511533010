package pekan5_2511533010;

public class PencarianSLL_2511533010 {
	static boolean searchKey_3010 (NodeSLL_2511533010 head_3010, int key_3010) {
		NodeSLL_2511533010 curr_3010 = head_3010;
		while (curr_3010 != null) {
			if (curr_3010.data_3010 == key_3010)
				return true;
			curr_3010 = curr_3010.next_3010;}
		return false;
	} 
	public static void traversal_3010 (NodeSLL_2511533010 head_3010) {
		// mulai dari head
		NodeSLL_2511533010 curr_3010 = head_3010;
		//telusuri sampai pointer null
		while (curr_3010 != null) {
			System.out.print(" " + curr_3010.data_3010);
			curr_3010 = curr_3010.next_3010;
		}
		System.out.println ();
	}
	public static void main(String [] args) {
		NodeSLL_2511533010 head_3010 = new NodeSLL_2511533010(14);
		head_3010.next_3010 = new NodeSLL_2511533010(21);
		head_3010.next_3010.next_3010 = new NodeSLL_2511533010(13);
		head_3010.next_3010.next_3010.next_3010 = new NodeSLL_2511533010(30);
		head_3010.next_3010.next_3010.next_3010.next_3010 = new NodeSLL_2511533010(10);
		System.out.print("Penelusuran SLL: ");
		traversal_3010 (head_3010);
		// data yang akan di cari
		int key_3010 = 30;
		System.out.print("Cari data " +key_3010+ " = ");
		if (searchKey_3010(head_3010, key_3010))
			System.out.println("Ketemu");
		else
			System.out.println("tidak ada");
	}
}
