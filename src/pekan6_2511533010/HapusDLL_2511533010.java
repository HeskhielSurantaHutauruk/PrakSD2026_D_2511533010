package pekan6_2511533010;

public class HapusDLL_2511533010 {
	public static NodeDLL_2511533010 delHead_3010(NodeDLL_2511533010 head_3010) {
		if (head_3010 == null) {
			return null;}
		NodeDLL_2511533010  temp = head_3010;
		head_3010 = head_3010.next_3010;
		if (head_3010 != null) { head_3010.prev_3010 = null; }
		return head_3010;
		}
	
	public static NodeDLL_2511533010 delLast_3010(NodeDLL_2511533010 head_3010) {
		if (head_3010 == null) {
			return null;}
		if (head_3010.next_3010 == null) {
			return null;}
		NodeDLL_2511533010 curr = head_3010;
		while (curr.next_3010 != null) { curr = curr.next_3010;}
		
		if (curr.prev_3010 != null) {
			curr.prev_3010.next_3010 = null; }
	return head_3010; }
	
	public static NodeDLL_2511533010 delPos_3010 (NodeDLL_2511533010 head_3010, int pos_3010) {
		if (head_3010 == null) {return head_3010;}
		NodeDLL_2511533010 curr = head_3010;
		for (int i = 1; curr != null && i < pos_3010; ++i) {
			curr = curr.next_3010;
		}
		if (curr == null) { return head_3010;}
		if (curr.prev_3010 != null) {curr.prev_3010.next_3010 = curr.next_3010;}
		if (curr.next_3010 != null) {curr.next_3010.prev_3010 = curr.prev_3010;}
		if (head_3010 == curr) { head_3010 = curr.next_3010; } return head_3010;
		}
	public static void printList (NodeDLL_2511533010 head_3010) {
		NodeDLL_2511533010 curr = head_3010;
		while (curr != null) { System.out.print(curr.data_3010 + " ");
		curr = curr.next_3010;
		} System.out.println();
	}
	public static void main (String [] args) {
		NodeDLL_2511533010 head_3010 = new NodeDLL_2511533010 (1);
		head_3010.next_3010 = new NodeDLL_2511533010(2);
		head_3010.next_3010.prev_3010 = head_3010;
		head_3010.next_3010.next_3010 = new NodeDLL_2511533010(3);
		head_3010.next_3010.next_3010.prev_3010 = head_3010.next_3010;
		head_3010.next_3010.next_3010.next_3010 = new NodeDLL_2511533010 (4);
		head_3010.next_3010.next_3010.next_3010.prev_3010 = head_3010.next_3010.next_3010;
		head_3010.next_3010.next_3010.next_3010.next_3010 = new NodeDLL_2511533010(5);
		head_3010.next_3010.next_3010.next_3010.next_3010.prev_3010 = head_3010.next_3010.next_3010.next_3010;
		
		System.out.print("DLL Awal: ");
		printList(head_3010);
		
		System.out.print("setelah head dihapus: ");
		head_3010 = delHead_3010(head_3010);
		printList(head_3010);
		
		System.out.print("setelah node terakhir dihapus: ");
		head_3010 = delLast_3010(head_3010);
		printList(head_3010);
		
		System.out.print("menghapus node ke 2: ");
		head_3010 = delPos_3010(head_3010, 2);
		printList(head_3010);
	}
}
