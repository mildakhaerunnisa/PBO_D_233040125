package tugas5_233040125;

public class Mahasiswa {
    private final String nim;
    private String nama;
    private static int totalMahasiswa = 0;
    public static final int MAX_SKS = 24;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++; 
    }

    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Maksimum SKS: " + MAX_SKS);
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}

