package pekan1_2511533010;

public class Driver_2511533010 {
    public static void main(String[] args) {
        Mobil_2511533010 mobil1 = new Mobil_2511533010(
                "Brio", 2020, 1100, 131000000, "Honda");
        mobil1.tambahMobil();
        mobil1.tampilkanData();
        System.out.println("------------------");
        mobil1.setHarga(135000000);
        mobil1.tampilkanData();
        System.out.println("------------------");
        mobil1.hapusMobil();
    }
}