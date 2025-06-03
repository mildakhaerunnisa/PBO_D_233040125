package tugas5_233040125;

public class TestMahasiswa {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("23304002", "Indah");
        Mahasiswa mhs2 = new Mahasiswa("23303011", "Ari");
        Mahasiswa mhs3 = new Mahasiswa("23305004", "Putri");

        mhs1.displayInfo();
        System.out.println();
        mhs2.displayInfo();
        System.out.println();
        mhs3.displayInfo();
        System.out.println();

        System.out.println("Total Pendaftar Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
