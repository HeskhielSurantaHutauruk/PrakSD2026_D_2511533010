package pekan8_2511533010;

import pekan8_2511533010.Constants.Angka;
import pekan8_2511533010.Constants.Pesan;
import pekan8_2511533010.Utils.Utils;

public class QuickSort_2511533010 {
    // swap
    private static void swap_2511533010(int[] arr_3010, int i_3010, int j_3010) {
        int temp_3010 = arr_3010[i_3010];
        arr_3010[i_3010] = arr_3010[j_3010];
        arr_3010[j_3010] = temp_3010;
    }

    // median of three
    private static void medianofThree_2511533010(int[] arr_3010, int low_3010, int high_3010) {
        int mid_3010 = low_3010 + (high_3010 - low_3010) / Angka.DUA;

        if (arr_3010[low_3010] > arr_3010[mid_3010]) {
            swap_2511533010(arr_3010, low_3010, mid_3010);
        }

        if (arr_3010[low_3010] > arr_3010[high_3010]) {
            swap_2511533010(arr_3010, low_3010, high_3010);
        }

        if (arr_3010[mid_3010] > arr_3010[high_3010]) {
            swap_2511533010(arr_3010, mid_3010, high_3010);
        }

        swap_2511533010(arr_3010, mid_3010, high_3010);
    }

    // partition
    private static int partition_2511533010(int[] arr_3010, int low_3010, int high_3010) {
        medianofThree_2511533010(arr_3010, low_3010, high_3010);

        int pivot_3010 = arr_3010[high_3010];
        int i_3010 = (low_3010 - Angka.SATU);

        for (int j_3010 =  low_3010; j_3010 <= high_3010 - Angka.SATU; j_3010++) {
            if (arr_3010[j_3010] < pivot_3010) {
                i_3010++;
                swap_2511533010(arr_3010, i_3010, j_3010);
            }
        }

        swap_2511533010(arr_3010, i_3010 + Angka.SATU, high_3010);
        return (i_3010 + Angka.SATU);
    }

    // sort
    private static void quickSort_2511533010(int[] arr_3010, int l_3010, int h_3010) {
        if (l_3010 < h_3010) {
            int pi_3010 = partition_2511533010(arr_3010, l_3010, h_3010);
            quickSort_2511533010(arr_3010, l_3010, pi_3010 - Angka.SATU);
            quickSort_2511533010(arr_3010, pi_3010 + Angka.SATU, h_3010);
        }
    }

    // printer
    private static void printArray(int[] arr_3010) {
        for (int i_3010 = Angka.NOL; i_3010 < arr_3010.length; ++i_3010) {
            System.out.println(arr_3010[i_3010] + Pesan.ONE_SPACE);
        }
        Utils.printLineStatement();
    }

    public static void main(String[] args) {
        int[] arr_3010 = { 10, 7, 8, 9, 1, 5 };
        int n_3010 = Utils.hitungPanjangArray(arr_3010);

        Utils.printLineStatement(Pesan.SEBELUM_TERURUT);
        Utils.printArray(arr_3010);

        quickSort_2511533010(arr_3010, Angka.NOL, n_3010 - Angka.SATU);

        Utils.printLineStatement(Pesan.SESUDAH_TERURUT);
        Utils.printArray(arr_3010);
    }
}