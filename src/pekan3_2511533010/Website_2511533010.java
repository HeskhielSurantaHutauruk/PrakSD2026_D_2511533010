package pekan3_2511533010;
/**
 * Kelas ADT Website untuk merepresentasikan halaman web
 * NIM: 2511533010
 */
public class Website_2511533010 {
    // Atribut dengan akhiran 4 digit NIM (3010)
    private String judul_3010;
    private String url_3010;
    
    // Constructor
    public Website_2511533010(String judul_3010, String url_3010) {
        this.judul_3010 = judul_3010;
        this.url_3010 = url_3010;
    }
    
    // Selektor (Getter)
    public String getJudul_3010() {
        return judul_3010;
    }
    
    public String getUrl_3010() {
        return url_3010;
    }
    
    // Mutator (Setter)
    public void setJudul_3010(String judul_3010) {
        this.judul_3010 = judul_3010;
    }
    
    public void setUrl_3010(String url_3010) {
        this.url_3010 = url_3010;
    }
    
    // Method untuk menampilkan detail website
    @Override
    public String toString() {
        return "Judul: " + judul_3010 + " | URL: " + url_3010;
    }
}