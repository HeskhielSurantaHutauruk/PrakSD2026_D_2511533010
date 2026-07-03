package pekan8_2511533010;

import pekan8_2511533010.Constants.Angka;
import pekan8_2511533010.Constants.Pesan;
import pekan8_2511533010.Utils.Utils;

public class ShellSort_2511533010 {

    // shell sort
    private static void shellSort_2511533010(int[] a_3010) {
        int n_3010 = a_3010.length;
        int gap_3010 = n_3010 / Angka.DUA;

        while (gap_3010 > Angka.NOL) {
            for (int i_3010 = gap_3010; i_3010 < n_3010; i_3010++) {
                int temp_3010 = a_3010[i_3010];
                int j_3010 = i_3010;

                while (j_3010 >= gap_3010 && a_3010[j_3010 - gap_3010] > temp_3010) {
                    a_3010[j_3010] = a_3010[j_3010 - gap_3010];
                    j_3010 = j_3010 - gap_3010;
                }
                a_3010[j_3010] = temp_3010;
            }
            gap_3010 = gap_3010 / Angka.DUA;
        }
    }

    public static void main(String[] args) {
        int[] data_3010 = { 3, 10, 4, 6, 8, 9, 7, 2, 1, 5 };

        Utils.printLineStatement(Pesan.SEBELUM_TERURUT);
        Utils.printArray(data_3010);

        shellSort_2511533010(data_3010);

        Utils.printLineStatement(Pesan.SESUDAH_TERURUT);
        Utils.printArray((data_3010));
    }
}