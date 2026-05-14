package pekan6_2511533010;

public class PenelusuranDLL_2511533010 {
	static void forwardTraversal_3010(NodeDLL_2511533010 head_3010) {
		NodeDLL_2511533010 curr = head_3010;
		
		while (curr != null) {
			System.out.print(curr.data_3010 + " <-> ") ;
			
			curr = curr.next_3010;
		}
		System.out.println();
	}
	static void backwardTraversal_3010(NodeDLL_2511533010 tail_3010) {
		NodeDLL_2511533010 curr = tail_3010;
		
		while ( curr != null) {
			System.out.print (curr.data_3010 + " <-> ");
			
			curr = curr.prev_3010;
		} System.out.println();
	}
	
	public static void main(String [] args) {
		NodeDLL_2511533010 head_3010 = new NodeDLL_2511533010(1);
		NodeDLL_2511533010 second_3010 = new NodeDLL_2511533010(2);
		NodeDLL_2511533010 third_3010 = new NodeDLL_2511533010(3);
		
		head_3010.next_3010 = second_3010;
		second_3010.prev_3010 = head_3010;
		second_3010.next_3010 = third_3010;
		third_3010.prev_3010 = second_3010;
		
		System.out.println ("penelusuran maju:");
		forwardTraversal_3010(head_3010);
		
		System.out.println ("penelusuran mundur:");
		backwardTraversal_3010(third_3010);
	}
}
