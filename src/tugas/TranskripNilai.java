package tugas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;	
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
    	double totalNilai = 0;
        int totalSks = 0;
        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS();
            totalNilai += khs.getIps() * khs.getTotalSks();
            totalSks += khs.getTotalSks();
        }
        this.ipk = totalSks > 0 ? totalNilai / totalSks : 0;
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    // Getter dan Setter
	public Date getTglCetak() {
		return tglCetak;
	}

	public void setTglCetak(Date tglCetak) {
		this.tglCetak = tglCetak;
	}

	public double getIpk() {
		return ipk;
	}

	public void setIpk(double ipk) {
		this.ipk = ipk;
	}

	public List<KartuHasilStudi> getKartuHasilStudi() {
		return kartuHasilStudi;
	}

	public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
		this.kartuHasilStudi = kartuHasilStudi;
	}

	public Mahasiswa getMahasiswa() {
		return mahasiswa;
	}

	public void setMahasiswa(Mahasiswa mahasiswa) {
		this.mahasiswa = mahasiswa;
	}
    
}

