package tugasStudiKasus;

public class TranskripNilaiMain {
	public static void main(String[] args) {
	    // Membuat objek dosen
	    Dosen dosen1 = new Dosen("198707302019031002", "Fajar Darmawan, ST., M.KOM.");
	    Dosen dosen2 = new Dosen("198707302019031003", "Dr. Ir. Leony Lidya, ST.,MT.");
	    Dosen dosen3 = new Dosen("198707302019031004", "Siroj Nur Ulum, S.T., M.T.");

	    // Membuat objek mata kuliah dan mengaitkan dengan dosen
	    MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3, dosen1);
	    MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3, dosen2);
	    MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3, dosen3);

	    // Membuat objek KHS
	    KartuHasilStudi khs = new KartuHasilStudi("20222");
	    khs.addMataKuliah(mk1);
	    khs.addMataKuliah(mk2);
	    khs.addMataKuliah(mk3);

	    // Membuat objek Mahasiswa
	    Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

	    // Membuat objek TranskripNilai
	    TranskripNilai transkrip = new TranskripNilai(mhs);
	    transkrip.addKHS(khs);
	    
	    // Menampilkan hasil transkrip
	    transkrip.display();
	}

}
