package Pekan7_2511533010;

public class InsertionSort_2511533010 {
    public static void insertionSort_3010(int[] arr_3010) {
        int n_3010 = arr_3010.length;
        for (int i_3010 = 1; i_3010 < n_3010; i_3010++) {
            int key_3010 = arr_3010[i_3010];
            int j_3010 = i_3010 - 1;
            while (j_3010 >= 0 && arr_3010[j_3010] > key_3010) {
                arr_3010[j_3010 + 1] = arr_3010[j_3010];
                j_3010--;
            }
            arr_3010[j_3010 + 1] = key_3010;
        }
    } 

    public static void main(String[] args_3010) {
        int arr_3010[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_3010 = arr_3010.length;
        System.out.printf("array yang belum terurut:\n");
        for (int i_3010 = 0; i_3010 < n_3010; i_3010++)
            System.out.print(arr_3010[i_3010] + " ");
        System.out.println("");
        insertionSort_3010(arr_3010);
        System.out.printf("array yang terurut:\n");
        for (int i_3010 = 0; i_3010 < n_3010; i_3010++)
            System.out.print(arr_3010[i_3010] + " ");
        System.out.println("");
    }
}