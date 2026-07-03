package Pekan7_2511533010;

public class BubbleSort_Tugas_2511533010 {

	    public void bubbleSort_Tugas_2511533010(Mahasiswa_2511533010[] arr_3010) {
	        System.out.println("=== BUBBLE SORT (Console) ===");
	        int n_3010 = arr_3010.length;
	        for (int i_3010 = 0; i_3010 < n_3010 - 1; i_3010++) {
	            for (int j_3010 = 0; j_3010 < n_3010 - 1 - i_3010; j_3010++) {
	                if (arr_3010[j_3010].getNama().compareToIgnoreCase(arr_3010[j_3010 + 1].getNama()) > 0) {
	                    Mahasiswa_2511533010 temp_3010 = arr_3010[j_3010];
	                    arr_3010[j_3010] = arr_3010[j_3010 + 1];
	                    arr_3010[j_3010 + 1] = temp_3010;
	                }
	            }
	            // Cetak pass ke console
	            printArray_3010(arr_3010, i_3010 + 1);
	        }
	        System.out.println("Hasil akhir Bubble Sort:");
	        for (Mahasiswa_2511533010 m_3010 : arr_3010) {
	            System.out.println("  " + m_3010);
	        }
	    }

	    private void printArray_3010(Mahasiswa_2511533010[] arr_3010, int pass_3010) {
	        System.out.print("Pass " + pass_3010 + ": [");
	        for (int i_3010 = 0; i_3010 < arr_3010.length; i_3010++) {
	            System.out.print(arr_3010[i_3010].getNama());
	            if (i_3010 < arr_3010.length - 1) System.out.print(", ");
	        }
	        System.out.println("]");
	    }
	}
