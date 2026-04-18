package pekan2_2511533010;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kelas Driver Playlist untuk sistem manajemen playlist musik
 * NIM: 2511533010
 */
public class Playlist_2511533010 {
    
    public static void main(String[] args) {
        // Deklarasi ArrayList dengan tipe Musik_2511533010
        ArrayList<Musik_2511533010> playlist_3010 = new ArrayList<>();
        Scanner scanner_3010 = new Scanner(System.in);
        int pilihan_3010;
        
        System.out.println("=== Playlist Musik NIM: 2511533010 ===\n");
        
        do {
            // Tampilkan menu
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Kapasitas");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3010 = scanner_3010.nextInt();
            scanner_3010.nextLine(); // Membersihkan buffer
            
            System.out.println();
            
            switch (pilihan_3010) {
                case 1:
                    // Tambah Lagu ke ArrayList
                    System.out.print("Masukkan Judul: ");
                    String judul_3010 = scanner_3010.nextLine();
                    
                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi_3010 = scanner_3010.nextLine();
                    
                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi_3010 = scanner_3010.nextInt();
                    scanner_3010.nextLine(); // Membersihkan buffer
                    
                    // Membuat objek Musik baru
                    Musik_2511533010 laguBaru_3010 = new Musik_2511533010(judul_3010, penyanyi_3010, durasi_3010);
                    playlist_3010.add(laguBaru_3010);
                    
                    System.out.println("Data berhasil ditambahkan!");
                    break;
                    
                case 2:
                    // Lihat Playlist (tampilkan seluruh daftar lagu)
                    if (playlist_3010.isEmpty()) {
                        System.out.println("[INFO] Playlist kosong! Belum ada lagu yang ditambahkan.");
                    } else {
                        System.out.println("=== DAFTAR PLAYLIST ===");
                        System.out.println("No.\tJudul\t\t\tPenyanyi\t\tDurasi");
                        System.out.println("=".repeat(60));
                        
                        // Perulangan untuk menampilkan semua lagu
                        for (int i = 0; i < playlist_3010.size(); i++) {
                            Musik_2511533010 lagu_3010 = playlist_3010.get(i);
                            int menit_3010 = lagu_3010.getDurasi_3010() / 60;
                            int detik_3010 = lagu_3010.getDurasi_3010() % 60;
                            
                            System.out.printf("%d.\t%s\t\t%s\t\t%d:%02d%n", 
                                (i + 1), 
                                lagu_3010.getJudul_3010(), 
                                lagu_3010.getPenyanyi_3010(), 
                                menit_3010, 
                                detik_3010);
                        }
                        System.out.println("=".repeat(60));
                        System.out.println("Total lagu: " + playlist_3010.size());
                    }
                    break;
                    
                case 3:
                    // Hapus Lagu berdasarkan nomor indeks
                    if (playlist_3010.isEmpty()) {
                        System.out.println("[ERROR] Playlist kosong! Tidak ada lagu yang bisa dihapus.");
                    } else {
                        // Tampilkan daftar lagu terlebih dahulu
                        System.out.println("Daftar lagu saat ini:");
                        for (int i = 0; i < playlist_3010.size(); i++) {
                            Musik_2511533010 lagu_3010 = playlist_3010.get(i);
                            System.out.println((i + 1) + ". " + lagu_3010.getJudul_3010() + " - " + lagu_3010.getPenyanyi_3010());
                        }
                        
                        System.out.print("\nMasukkan nomor lagu yang akan dihapus: ");
                        int nomorHapus_3010 = scanner_3010.nextInt();
                        scanner_3010.nextLine(); // Membersihkan buffer
                        
                        // Validasi nomor yang dimasukkan (1-based index)
                        if (nomorHapus_3010 >= 1 && nomorHapus_3010 <= playlist_3010.size()) {
                            Musik_2511533010 laguTerhapus_3010 = playlist_3010.remove(nomorHapus_3010 - 1);
                            System.out.println("Lagu \"" + laguTerhapus_3010.getJudul_3010() + "\" berhasil dihapus!");
                        } else {
                            System.out.println("[ERROR] Nomor lagu tidak valid!");
                        }
                    }
                    break;
                    
                case 4:
                    // Cek Kapasitas (jumlah total lagu menggunakan .size())
                    System.out.println("=== STATUS PLAYLIST ===");
                    System.out.println("Jumlah total lagu dalam playlist: " + playlist_3010.size() + " lagu");
                    System.out.println("Apakah playlist kosong? " + (playlist_3010.isEmpty() ? "Ya" : "Tidak"));
                    
                    // Informasi tambahan: kapasitas maksimum ArrayList (teoritis)
                    System.out.println("Kapasitas maksimum (teoritis): Tidak terbatas (dinamis)");
                    break;
                    
                case 5:
                    System.out.println("Keluar dari program. Terima kasih telah menggunakan Playlist Musik!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi (1-5).");
                    break;
            }
            
            System.out.println("\n" + "-".repeat(50) + "\n");
            
        } while (pilihan_3010 != 5);
        
        scanner_3010.close();
    }
}