package tugasAbstract_233040125;

public abstract class Loker {
	
    protected boolean terkunci = true;
    
    public abstract boolean buka(String pin);
    
    public void kunci() {
        terkunci = true;
        System.out.println("Loker dikunci.");
    }
    
    public boolean isTerkunci() {
        return terkunci;
    }
}