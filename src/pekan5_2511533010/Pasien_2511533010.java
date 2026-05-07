package pekan5_2511533010;

public class Pasien_2511533010 {
    private String namaPasien_3010;
    private String penyakit_3010;
    private int noAntrian_3010;
    private Pasien_2511533010 next_3010;   // pointer ke node selanjutnya

    // Constructor: inisialisasi semua atribut
    public Pasien_2511533010(String namaPasien_3010, String penyakit_3010, int noAntrian_3010) {
        this.namaPasien_3010 = namaPasien_3010;
        this.penyakit_3010 = penyakit_3010;
        this.noAntrian_3010 = noAntrian_3010;
        this.next_3010 = null;  // node baru selalu menunjuk ke null
    }

    // Getter (selektor) untuk setiap atribut
    public String getNamaPasien_3010() {
        return namaPasien_3010;
    }

    public String getPenyakit_3010() {
        return penyakit_3010;
    }

    public int getNoAntrian_3010() {
        return noAntrian_3010;
    }

    public Pasien_2511533010 getNext_3010() {
        return next_3010;
    }

    // Setter untuk next, diperlukan saat menyambung node
    public void setNext_3010(Pasien_2511533010 next_3010) {
        this.next_3010 = next_3010;
    }
}