package tugas;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMataKuliah;

    public KartuHasilStudi(String semester) 
    {
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void addMataKuliah(MataKuliah matakuliah) {
        daftarMataKuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMataKuliah) 
        {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public int getTotalSks() {
        int totalSks = 0;
        for (MataKuliah mk : daftarMataKuliah) {
            totalSks += mk.getSks();
        }
        return totalSks;
    }

    public void hitungIPS() {
        double totalNilai = 0;
        int totalSks = 0;
        for (MataKuliah mk : daftarMataKuliah) {
            totalNilai += mk.nilaiIndex() * mk.getSks();
            totalSks += mk.getSks();
        }
        this.ips = totalSks > 0 ? totalNilai / totalSks : 0;
    }
    
   
    public String getSemester() {
        return semester;
    }

    public double getIps() {
        return ips;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }
    
}