package pekan6_2511533010;

public class Lagu_2511533010 {
    // Atribut dengan akhiran 3010
    private String judul_3010;
    private String penyanyi_3010;
    private Lagu_2511533010 next_3010;
    private Lagu_2511533010 prev_3010;

    // Constructor
    public Lagu_2511533010(String judul, String penyanyi) {
        this.judul_3010 = judul;
        this.penyanyi_3010 = penyanyi;
        this.next_3010 = null;
        this.prev_3010 = null;
    }

    // Getter dan Setter (semua diakhiri 3010)
    public String getJudul_3010() {
        return judul_3010;
    }

    public void setJudul_3010(String judul) {
        this.judul_3010 = judul;
    }

    public String getPenyanyi_3010() {
        return penyanyi_3010;
    }

    public void setPenyanyi_3010(String penyanyi) {
        this.penyanyi_3010 = penyanyi;
    }

    public Lagu_2511533010 getNext_3010() {
        return next_3010;
    }

    public void setNext_3010(Lagu_2511533010 next) {
        this.next_3010 = next;
    }

    public Lagu_2511533010 getPrev_3010() {
        return prev_3010;
    }

    public void setPrev_3010(Lagu_2511533010 prev) {
        this.prev_3010 = prev;
    }
}