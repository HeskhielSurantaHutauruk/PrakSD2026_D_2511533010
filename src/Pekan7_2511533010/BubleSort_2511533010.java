package Pekan7_2511533010;

public class BubleSort_2511533010 {
    public static void bubbleSort_3010(int[] arr_3010) {
        int n_3010 = arr_3010.length;
        for (int i_3010 = 0; i_3010 < n_3010; i_3010++) {
            for (int j_3010 = 0; j_3010 < n_3010 - i_3010 - 1; j_3010++) {
                if (arr_3010[j_3010] > arr_3010[j_3010 + 1]) {
                    int temp_3010 = arr_3010[j_3010];
                    arr_3010[j_3010] = arr_3010[j_3010 + 1];
                    arr_3010[j_3010 + 1] = temp_3010;
                }
            }
        }
    }

    public static void main(String[] args_3010) {
        int arr_3010[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_3010 = arr_3010.length;
        System.out.print("array yang belum terurut:");
        for (int i_3010 = 0; i_3010 < n_3010; i_3010++) {
            System.out.print(arr_3010[i_3010] + " ");
        }
        System.out.println("");
        bubbleSort_3010(arr_3010);
        System.out.print("array yang terurut menggunakan BubbleSort:");
        for (int i_3010 = 0; i_3010 < n_3010; i_3010++) {
            System.out.print(arr_3010[i_3010] + " ");
        }
        System.out.println("");
    }
}