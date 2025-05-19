package tugasAbstract_233040125;

public class LokerPin extends Loker implements Autentikasi {
    private String pin;
    public LokerPin(String pin) {
        this.pin = pin;
    }
    
    @Override
    public boolean login(String pinInput) {
        return this.pin.equals(pinInput);
    }
    
    @Override
    public boolean buka(String pinInput) {
        if (login(pinInput)) {
            if (terkunci) {
                terkunci = false;
                System.out.println("Loker dibuka.");
            } else {
                System.out.println("Loker sudah terbuka.");
            }
            return true;
        } else {
            System.out.println("PIN salah. Loker terkunci.");
            return false;
        }
    }
}
