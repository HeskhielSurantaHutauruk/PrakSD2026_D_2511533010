package pekan8_2511533010;

import pekan8_2511533010.Constants.Angka;
import pekan8_2511533010.Constants.Pesan;
import pekan8_2511533010.Utils.Utils;

public class MergeSort_2511533010 {
    private static void merge_2511533010(int[] arr_3010, int l_3010, int m_3010, int r_3010) {
        int n1_3010 = m_3010 - l_3010 + Angka.SATU;
        int n2_3010 = r_3010 - m_3010;

        int[] L_3010 = new int[n1_3010];
        int[] R_3010 = new int[n2_3010];

        for (int i_3010 = Angka.NOL; i_3010 < n1_3010; ++i_3010) {
            L_3010[i_3010] = arr_3010[l_3010 + i_3010];
        }

        for (int j_3010 = Angka.NOL; j_3010 < n2_3010; ++j_3010) {
            R_3010[j_3010] = arr_3010[m_3010 + Angka.SATU + j_3010];
        }

        int i_3010 = Angka.NOL;
        int j_3010 = Angka.NOL;
        int k_3010 = l_3010;

        while (i_3010 < n1_3010 && j_3010 < n2_3010) {
            if (L_3010[i_3010] <= R_3010[j_3010]) {
                arr_3010[k_3010] = L_3010[i_3010];
                i_3010++;
            } else {
                arr_3010[k_3010] = R_3010[j_3010];
                j_3010++;
            }
            k_3010++;
        }

        while (i_3010 < n1_3010) {
            arr_3010[k_3010] = L_3010[i_3010];
            i_3010++;
            k_3010++;
        }

        while (j_3010 < n2_3010) {
            arr_3010[k_3010] = R_3010[j_3010];
            j_3010++;
            k_3010++;
        }
    }

    private static void sort_2511533010(int[] arr_3010, int l_3010, int r_3010) {
        if (l_3010 < r_3010) {
            int m_3010 = (l_3010 + r_3010) / Angka.DUA;

            sort_2511533010(arr_3010, l_3010, m_3010);
            sort_2511533010(arr_3010, m_3010 + Angka.SATU, r_3010);

            merge_2511533010(arr_3010, l_3010, m_3010, r_3010);
        }
    }

    public static void main(String[] args) {
        int[] arr_3010 = { 12, 11, 13, 5, 6, 7 };

        Utils.printLineStatement(Pesan.SEBELUM_TERURUT);
        Utils.printArray(arr_3010);

        sort_2511533010(arr_3010, Angka.NOL, arr_3010.length - Angka.SATU);
        Utils.printLineStatement(Pesan.SESUDAH_TERURUT);
        Utils.printArray(arr_3010);
    }
}