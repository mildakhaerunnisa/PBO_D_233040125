package tugasAbstract_233040125;

public interface InterfaceMain {
	
	public static void main(String[] args) {
		KartuElektronik kartu = new KartuElektronik("IF111", "123");
		System.out.println("Otentikasi: "+ kartu.otentikasi("123"));
	}

}
