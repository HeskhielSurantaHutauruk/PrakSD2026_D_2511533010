package pekan2_2511533010;

public class DaftarKataDriver_2511533010 {
	public static void main(String[] args) {
		DaftarKata_2511533010 al = new DaftarKata_2511533010();
		
		al.tambah("kami");
		al.tambah("informatika");
		
		al.tambahPada(1, "mahasiswa");
		System.out.println ("awal    :" + al);
		
		al.ubahElemen(1, "Departemen");
		System.out.println ("setelah ubah: " + al);
		String terhapus = al.hapusElemen(0);
		System.out.println ("Terhapus  :" + terhapus);
		System.out.println ("Setelah Hapus:" + al);
		
		System.out.print ("Iterasi:");
		al.iterasiCetak();
		System.out.println();
		
		
	}
}
