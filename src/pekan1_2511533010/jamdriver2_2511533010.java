package pekan1_2511533010;

import java.util.Scanner;

public class jamdriver2_2511533010 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Driver Objek Jam ===");

        // 1. Input jam pertama
        System.out.println("\n--- Input Jam 1 ---");
        jam_2511533010 j1 = buatJamDariInput(input);

        // 2. Input jam kedua
        System.out.println("\n--- Input Jam 2 ---");
        jam_2511533010 j2 = buatJamDariInput(input);

        // 3. Menampilkan Data
        System.out.println("\n--- Hasil Operasi ---");
        System.out.println("Jam 1 (String)      : " + j1);
        System.out.println("Jam 2 (String)      : " + j2);
        System.out.println("Jam 1 dalam detik   : " + j1.toSeconds());
        System.out.println("Jam 2 dalam detik   : " + j2.toSeconds());
        
     // 4. Perbandingan
        int perbandingan = j1.compareTo(j2);
        if (perbandingan > 0) {
            System.out.println("Status : Jam 1 lebih lambat (setelah) Jam 2");
        } else if (perbandingan < 0) {
            System.out.println("Status : Jam 1 lebih awal (sebelum) Jam 2");
        } else {
            System.out.println("Status : Jam 1 dan Jam 2 sama");
        }

        // 5. Operasi Aritmatika
        System.out.println("Durasi (J1 ke J2) : " +
        		jam_2511533010.durasiDetik(j1, j2) + " detik");

        jam_2511533010 jNext = j1.nextSecond();
        System.out.println("Detik berikutnya : " + jNext);

        jam_2511533010 jPrev = j1.prevSecond();
        System.out.println("Detik sebelumnya : " + jPrev);

        // 6. Penjumlahan
        jam_2511533010 jHasil = j1.plus(j2);
        System.out.println("J1 + J2 : " + jHasil);

        input.close();
        System.out.println("\nProgram Selesai.");
}
        

        private static jam_2511533010 buatJamDariInput(Scanner sc) {
            int h, m, s;

            while (true) {
                System.out.print("Masukkan jam (0-23): ");
                h = sc.nextInt();

                System.out.print("Masukkan menit (0-59): ");
                m = sc.nextInt();

                System.out.print("Masukkan detik (0-59): ");
                s = sc.nextInt();

                if (jam_2511533010.isValid(h, m, s)) {
                    return new jam_2511533010(h, m, s);
                } else {
                    System.out.println("[Error] Input tidak valid! Ulangi.\n");
                }
            }
        
    }
    
}