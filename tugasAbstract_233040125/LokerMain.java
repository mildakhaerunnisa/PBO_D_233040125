package tugasAbstract_233040125;

public class LokerMain {
    public static void main(String[] args) {
    	
        LokerPin loker = new LokerPin("4321");
        
        //PIN salah
        loker.buka("1234");
        
        //PIN benar
        loker.buka("4321"); 
        
        //Saat sudah terbuka
        loker.buka("4321");
        
        //Kunci kembali loker
        loker.kunci();
        
        //Cek status loker
        System.out.println("Status loker terkunci? " + loker.isTerkunci());
    }
}
