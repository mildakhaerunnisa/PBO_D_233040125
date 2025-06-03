package tugas3_233040125;

public class TestCounter {
    public static void main(String[] args) {
        System.out.println("Jumlah awal instance: " + Counter.getInstanceCount());
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        
        System.out.println("Jumlah instance setelah pembuatan 5 objek: " 
            + Counter.getInstanceCount());
            
        new Counter(); 
        new Counter(); 
        
        
        System.out.println("Total instance akhir: " + Counter.getInstanceCount());
    }
}
