package Pekan7_2511533010;

public class Mahasiswa_2511533010 {
    private String nama;
    private String nim;
    private String prodi;

    // Constructor
    public Mahasiswa_2511533010(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return nama + " (" + nim + ") - " + prodi;
    }
}