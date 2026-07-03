package Pekan7_2511533010;

public class SelectionSort_2511533010 {
    public static void selectionSort_3010(int[] arr_3010) {
        int n_3010 = arr_3010.length;
        for (int i_3010 = 0; i_3010 < n_3010; i_3010++) {
            int minIndex_3010 = i_3010;
            for (int j_3010 = i_3010 + 1; j_3010 < n_3010; j_3010++) {
                if (arr_3010[j_3010] < arr_3010[minIndex_3010]) {
                    minIndex_3010 = j_3010;
                }
            }
            int temp_3010 = arr_3010[i_3010];
            arr_3010[i_3010] = arr_3010[minIndex_3010];
            arr_3010[minIndex_3010] = temp_3010;
        }
    }

    public static void main(String[] args_3010) {
        int arr_3010[] = {23, 78, 45, 8, 32, 56, 1};
        int n_3010 = arr_3010.length;
        System.out.print("array yang belum terurut: ");
        for (int i_3010 = 0; i_3010 < n_3010; i_3010++) {
            System.out.print(arr_3010[i_3010] + " ");
        }
        System.out.println("");
        selectionSort_3010(arr_3010);
        System.out.print("array yang terurut: ");
        for (int i_3010 = 0; i_3010 < n_3010; i_3010++) {
            System.out.print(arr_3010[i_3010] + " ");
        }
        System.out.println("");
    }
}