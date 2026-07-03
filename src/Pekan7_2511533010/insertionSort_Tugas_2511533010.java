package Pekan7_2511533010;

public class insertionSort_Tugas_2511533010 {
	/**
	 * Kelas terpisah untuk algoritma Insertion Sort.
	 * Method wajib: insertionSort_Tugas_2511533010
	 * Semua variabel lokal dalam method wajib suffix _3010.
	 */
	public class InsertionSort_2511533010 {
	    public void insertionSort_Tugas_2511533010(Mahasiswa_2511533010[] arr_3010) {
	        System.out.println("=== INSERTION SORT (Console) ===");
	        int n_3010 = arr_3010.length;
	        for (int i_3010 = 1; i_3010 < n_3010; i_3010++) {
	            Mahasiswa_2511533010 key_3010 = arr_3010[i_3010];
	            int j_3010 = i_3010 - 1;
	            while (j_3010 >= 0 && arr_3010[j_3010].getNama().compareToIgnoreCase(key_3010.getNama()) > 0) {
	                arr_3010[j_3010 + 1] = arr_3010[j_3010];
	                j_3010--;
	            }
	            arr_3010[j_3010 + 1] = key_3010;
	            // Cetak langkah ke console
	            printArray_3010(arr_3010, i_3010);
	        }
	        System.out.println("Hasil akhir Insertion Sort:");
	        for (Mahasiswa_2511533010 m_3010 : arr_3010) {
	            System.out.println("  " + m_3010);
	        }
	    }

	    // Method bantu dengan suffix _3010 (semua variabel juga suffix _3010)
	    private void printArray_3010(Mahasiswa_2511533010[] arr_3010, int langkah_3010) {
	        System.out.print("Langkah " + langkah_3010 + ": [");
	        for (int i_3010 = 0; i_3010 < arr_3010.length; i_3010++) {
	            System.out.print(arr_3010[i_3010].getNama());
	            if (i_3010 < arr_3010.length - 1) System.out.print(", ");
	        }
	        System.out.println("]");
	    }
	}

}
