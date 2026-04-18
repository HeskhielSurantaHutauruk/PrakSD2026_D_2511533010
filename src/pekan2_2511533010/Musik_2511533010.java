package pekan2_2511533010;
/**
 * Kelas ADT Musik untuk merepresentasikan lagu dalam playlist
 * NIM: 2511533010
 */
public class Musik_2511533010 {
    // Atribut dengan akhiran 4 digit NIM (3010)
    private String judul_3010;
    private String penyanyi_3010;
    private int durasi_3010; // durasi dalam detik
    
    // Constructor
    public Musik_2511533010(String judul_3010, String penyanyi_3010, int durasi_3010) {
        this.judul_3010 = judul_3010;
        this.penyanyi_3010 = penyanyi_3010;
        this.durasi_3010 = durasi_3010;
    }
    
    // Selektor (Getter)
    public String getJudul_3010() {
        return judul_3010;
    }
    
    public String getPenyanyi_3010() {
        return penyanyi_3010;
    }
    
    public int getDurasi_3010() {
        return durasi_3010;
    }
    
    // Mutator (Setter)
    public void setJudul_3010(String judul_3010) {
        this.judul_3010 = judul_3010;
    }
    
    public void setPenyanyi_3010(String penyanyi_3010) {
        this.penyanyi_3010 = penyanyi_3010;
    }
    
    public void setDurasi_3010(int durasi_3010) {
        this.durasi_3010 = durasi_3010;
    }
    
    // Method untuk menampilkan detail lagu (opsional)
    @Override
    public String toString() {
        int menit_3010 = durasi_3010 / 60;
        int detik_3010 = durasi_3010 % 60;
        return String.format("%s - %s [%d:%02d]", judul_3010, penyanyi_3010, menit_3010, detik_3010);
    }
}