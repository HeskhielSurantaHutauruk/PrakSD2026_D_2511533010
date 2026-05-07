package pekan5_2511533010;
import java.util.Scanner;

public class RumahSakit_2511533010 {
    private Pasien_2511533010 head_3010;   // node terdepan antrian
    private int counter_3010;             // nomor antrian terakhir yang diberikan

    // Constructor: inisialisasi antrian kosong
    public RumahSakit_2511533010() {
        head_3010 = null;
        counter_3010 = 0;
    }

    public void daftarkanPasien_3010(String nama_3010, String keluhan_3010) {
        // Auto-increment nomor antrian
        counter_3010++;
        Pasien_2511533010 nodeBaru_3010 = new Pasien_2511533010(nama_3010, keluhan_3010, counter_3010);

        // Kondisi list kosong: node baru menjadi head
        if (head_3010 == null) {
            head_3010 = nodeBaru_3010;
        } else {
            // Traverse ke node terakhir
            Pasien_2511533010 current_3010 = head_3010;
            while (current_3010.getNext_3010() != null) {
                current_3010 = current_3010.getNext_3010();
            }
            // Sambungkan node baru di akhir
            current_3010.setNext_3010(nodeBaru_3010);
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_3010);
    }

    public void panggilPasien_3010() {
        if (head_3010 == null) {
            System.out.println("Antrian kosong, tidak ada pasien yang dapat dipanggil.");
            return;
        }
        // Simpan node yang akan dihapus
        Pasien_2511533010 pasienDipanggil_3010 = head_3010;
        // Geser head ke node berikutnya
        head_3010 = head_3010.getNext_3010();

        // Tampilkan data pasien yang dipanggil
        System.out.println("Pasien dipanggil:");
        System.out.println("  Nomor Antrian : " + pasienDipanggil_3010.getNoAntrian_3010());
        System.out.println("  Nama          : " + pasienDipanggil_3010.getNamaPasien_3010());
        System.out.println("  Keluhan       : " + pasienDipanggil_3010.getPenyakit_3010());
        System.out.println("  Status        : Telah dilayani\n");
    }

    public void tampilkanAntrian_3010() {
        if (head_3010 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("\n=== DAFTAR ANTRIAN RUMAH SAKIT ===");
        Pasien_2511533010 current_3010 = head_3010;
        int posisi_3010 = 1;
        while (current_3010 != null) {
            System.out.println("Posisi ke-" + posisi_3010);
            System.out.println("  No. Antrian : " + current_3010.getNoAntrian_3010());
            System.out.println("  Nama Pasien : " + current_3010.getNamaPasien_3010());
            System.out.println("  Keluhan     : " + current_3010.getPenyakit_3010());
            System.out.println("-----------------------------");
            current_3010 = current_3010.getNext_3010();
            posisi_3010++;
        }
    }

    public void cariPasien_3010(String namaDicari_3010) {
        if (head_3010 == null) {
            System.out.println("Antrian kosong, pencarian tidak dapat dilakukan.");
            return;
        }

        Pasien_2511533010 current_3010 = head_3010;
        boolean ditemukan_3010 = false;
        while (current_3010 != null) {
            // Bandingkan tanpa memperhatikan huruf besar/kecil
            if (current_3010.getNamaPasien_3010().equalsIgnoreCase(namaDicari_3010)) {
                System.out.println("Pasien ditemukan:");
                System.out.println("  Nomor Antrian : " + current_3010.getNoAntrian_3010());
                System.out.println("  Nama          : " + current_3010.getNamaPasien_3010());
                System.out.println("  Keluhan       : " + current_3010.getPenyakit_3010());
                ditemukan_3010 = true;
                break;
            }
            current_3010 = current_3010.getNext_3010();
        }

        if (!ditemukan_3010) {
            System.out.println("Pasien dengan nama \"" + namaDicari_3010 + "\" tidak ditemukan dalam antrian.");
        }
    }

    public void cekStatusAntrian_3010() {
        if (head_3010 == null) {
            System.out.println("Antrian kosong, tidak ada pasien yang menunggu.");
            return;
        }

        // Hitung jumlah node
        int jumlah_3010 = 0;
        Pasien_2511533010 current_3010 = head_3010;
        while (current_3010 != null) {
            jumlah_3010++;
            current_3010 = current_3010.getNext_3010();
        }

        System.out.println("=== STATUS ANTRIAN ===");
        System.out.println("Jumlah pasien dalam antrian : " + jumlah_3010);
        System.out.println("Pasien terdepan:");
        System.out.println("  No. Antrian : " + head_3010.getNoAntrian_3010());
        System.out.println("  Nama        : " + head_3010.getNamaPasien_3010());
        System.out.println("  Keluhan     : " + head_3010.getPenyakit_3010());
    }

    // ========== METHOD MAIN ==========
    public static void main(String[] args) {
        Scanner scanner_3010 = new Scanner(System.in);
        RumahSakit_2511533010 rs_3010 = new RumahSakit_2511533010();
        int pilihan_3010;

        do {
            System.out.println("\n== Antrian Rumah Sakit NIM: 2511533010 ==");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3010 = scanner_3010.nextInt();
            scanner_3010.nextLine(); // membersihkan newline

            switch (pilihan_3010) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_3010 = scanner_3010.nextLine();
                    System.out.print("Masukkan Keluhan     : ");
                    String keluhan_3010 = scanner_3010.nextLine();
                    rs_3010.daftarkanPasien_3010(nama_3010, keluhan_3010);
                    break;
                case 2:
                    rs_3010.panggilPasien_3010();
                    break;
                case 3:
                    rs_3010.tampilkanAntrian_3010();
                    break;
                case 4:
                    System.out.print("Masukkan nama pasien yang dicari: ");
                    String cariNama_3010 = scanner_3010.nextLine();
                    rs_3010.cariPasien_3010(cariNama_3010);
                    break;
                case 5:
                    rs_3010.cekStatusAntrian_3010();
                    break;
                case 6:
                    System.out.println("Program selesai. Semoga sehat selalu!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan_3010 != 6);

        scanner_3010.close();
    }
}