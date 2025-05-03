package tugas6_233040125;

public class ProdukMakanan extends Produk
{
    private String tanggalExp;

    public ProdukMakanan(String nama, double harga, String tanggalExp){
        super(nama, harga);
        setTanggalExp(tanggalExp);
    }

    public String getTanggalExp(){
        return tanggalExp;
    }

    public void setTanggalExp(String tanggalExp){
        this.tanggalExp = tanggalExp;
    }
    
    public void display() {
        System.out.println(getNama() + " - " + getHarga() + " - " + getTanggalExp());
    }

}
