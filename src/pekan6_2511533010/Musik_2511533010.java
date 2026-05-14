package pekan6_2511533010;
import java.util.Scanner;

public class Musik_2511533010 {
    // Head dan tail dengan akhiran 3010
    private Lagu_2511533010 head_3010;
    private Lagu_2511533010 tail_3010;

    // 1. Tambah lagu di AKHIR playlist
    public void tambahLagu_3010(String judul, String penyanyi) {
        Lagu_2511533010 baru = new Lagu_2511533010(judul, penyanyi);
        if (head_3010 == null) {
            head_3010 = baru;
            tail_3010 = baru;
        } else {
            tail_3010.setNext_3010(baru);
            baru.setPrev_3010(tail_3010);
            tail_3010 = baru;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    // 2. Hapus lagu pertama (head)
    public void hapusLaguAwal_3010() {
        if (head_3010 == null) {
            System.out.println("Playlist kosong, tidak ada lagu yang dihapus!");
            return;
        }
        if (head_3010 == tail_3010) {
            head_3010 = null;
            tail_3010 = null;
        } else {
            head_3010 = head_3010.getNext_3010();
            head_3010.setPrev_3010(null);
        }
        System.out.println("Lagu pertama berhasil dihapus!");
    }

    // 3. Tampilkan dari awal ke akhir (maju)
    public void tampilMaju_3010() {
        if (head_3010 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("\n=== Daftar Playlist (Maju) ===");
        Lagu_2511533010 current = head_3010;
        int urutan = 1;
        while (current != null) {
            System.out.println(urutan + ". " + current.getJudul_3010() + " - " + current.getPenyanyi_3010());
            current = current.getNext_3010();
            urutan++;
        }
    }

    // 4. Tampilkan dari akhir ke awal (mundur) - wajib DLL
    public void tampilMundur_3010() {
        if (tail_3010 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("\n=== Daftar Playlist (Mundur) ===");
        Lagu_2511533010 current = tail_3010;
        int urutan = 1;
        while (current != null) {
            System.out.println(urutan + ". " + current.getJudul_3010() + " - " + current.getPenyanyi_3010());
            current = current.getPrev_3010();
            urutan++;
        }
    }

    // 5. Cari lagu berdasarkan judul (tidak case-sensitive)
    public void cariLagu_3010(String judul) {
        if (head_3010 == null) {
            System.out.println("Playlist kosong, tidak ada lagu yang dicari!");
            return;
        }
        boolean ditemukan = false;
        Lagu_2511533010 current = head_3010;
        int posisi = 1;
        while (current != null) {
            if (current.getJudul_3010().equalsIgnoreCase(judul)) {
                System.out.println("Lagu ditemukan!");
                System.out.println("Posisi : " + posisi);
                System.out.println("Judul  : " + current.getJudul_3010());
                System.out.println("Penyanyi: " + current.getPenyanyi_3010());
                ditemukan = true;
                break;
            }
            current = current.getNext_3010();
            posisi++;
        }
        if (!ditemukan) {
            System.out.println("Lagu dengan judul \"" + judul + "\" tidak ditemukan!");
        }
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Musik_2511533010 playlist = new Musik_2511533010();
        int pilihan;

        System.out.println("== Playlist Musik NIM: 2511533010 ==");

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // bersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi = scanner.nextLine();
                    playlist.tambahLagu_3010(judul, penyanyi);
                    break;
                case 2:
                    playlist.hapusLaguAwal_3010();
                    break;
                case 3:
                    playlist.tampilMaju_3010();
                    break;
                case 4:
                    playlist.tampilMundur_3010();
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu yang dicari: ");
                    String cari = scanner.nextLine();
                    playlist.cariLagu_3010(cari);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }
        } while (pilihan != 6);

        scanner.close();
    }
}