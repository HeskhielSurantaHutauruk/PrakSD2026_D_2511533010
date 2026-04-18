package pekan3_2511533010;
import java.util.Scanner;
import java.util.Stack;

/**
 * Kelas Driver Browser untuk simulasi history peramban web
 * NIM: 2511533010
 */
public class Browser_2511533010 {
    
    public static void main(String[] args) {
        // Deklarasi Stack dengan tipe Website_2511533010
        Stack<Website_2511533010> historyStack_3010 = new Stack<>();
        Scanner scanner_3010 = new Scanner(System.in);
        int pilihan_3010;
        
        System.out.println("=== Browser History NIM: 2511533010 ===\n");
        
        do {
            // Tampilkan menu
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3010 = scanner_3010.nextInt();
            scanner_3010.nextLine(); // Membersihkan buffer
            
            System.out.println();
            
            switch (pilihan_3010) {
                case 1:
                    // Push: Kunjungi website
                    System.out.print("Masukkan Judul: ");
                    String judul_3010 = scanner_3010.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url_3010 = scanner_3010.nextLine();
                    
                    Website_2511533010 websiteBaru_3010 = new Website_2511533010(judul_3010, url_3010);
                    historyStack_3010.push(websiteBaru_3010);
                    
                    System.out.println("Berhasil mengunjungi halaman!");
                    System.out.println("Halaman aktif sekarang: " + websiteBaru_3010);
                    break;
                    
                case 2:
                    // Pop: Tombol Back (hapus halaman teratas)
                    if (historyStack_3010.isEmpty()) {
                        System.out.println("[ERROR] History kosong! Tidak ada halaman yang bisa di-back.");
                    } else {
                        Website_2511533010 halamanDihapus_3010 = historyStack_3010.pop();
                        System.out.println("Tombol Back ditekan. Berhasil menghapus halaman:");
                        System.out.println(halamanDihapus_3010);
                        
                        // Tampilkan halaman yang sekarang aktif (jika ada)
                        if (!historyStack_3010.isEmpty()) {
                            System.out.println("\nSekarang berada di halaman:");
                            System.out.println(historyStack_3010.peek());
                        } else {
                            System.out.println("\nHistory kosong. Silakan kunjungi website baru.");
                        }
                    }
                    break;
                    
                case 3:
                    // Peek: Lihat halaman aktif (tanpa menghapus)
                    if (historyStack_3010.isEmpty()) {
                        System.out.println("[INFO] History kosong! Tidak ada halaman yang sedang aktif.");
                    } else {
                        Website_2511533010 halamanAktif_3010 = historyStack_3010.peek();
                        System.out.println("Halaman yang sedang aktif:");
                        System.out.println(halamanAktif_3010);
                    }
                    break;
                    
                case 4:
                    // Cek Status History
                    System.out.println("=== Status History ===");
                    System.out.println("Jumlah total riwayat tersimpan: " + historyStack_3010.size());
                    System.out.println("Apakah history kosong? " + (historyStack_3010.isEmpty() ? "Ya" : "Tidak"));
                    
                    // Tampilkan semua history (opsional)
                    if (!historyStack_3010.isEmpty()) {
                        System.out.println("\nDaftar history (dari paling baru ke paling lama):");
                        // Stack diiterasi dari atas ke bawah
                        for (int i = historyStack_3010.size() - 1; i >= 0; i--) {
                            System.out.println((historyStack_3010.size() - i) + ". " + historyStack_3010.get(i));
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                    break;
            }
            
            System.out.println("\n" + "-".repeat(50) + "\n");
            
        } while (pilihan_3010 != 5);
        
        scanner_3010.close();
    }
}