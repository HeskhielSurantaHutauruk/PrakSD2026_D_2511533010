package pekan1_2511533010;

public class jamdriver_2511533010 {
	public static void main(String[] args) {
		jam_2511533010 a=new jam_2511533010(23,59,50);
		jam_2511533010 b=new jam_2511533010(0,0,15);
		System.out.println("a             ="+a.toString());
		System.out.println("b             ="+b.toString());
		System.out.println("a+b           ="+a.plus(b).toString());
		System.out.println("next 20s      ="+a.nextSeconds(20).toString());
		System.out.println("durasi(a,b)   ="+ jam_2511533010.durasiDetik(a,b));
		System.out.println("a.compareTo(b)="+a.compareTo(b));
		
	}

}
