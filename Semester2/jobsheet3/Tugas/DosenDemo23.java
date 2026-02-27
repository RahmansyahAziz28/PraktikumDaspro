package Semester2.jobsheet3.Tugas;

public class DosenDemo23 {
    public static void main(String[] args) {
        Dosen23[] arrayOfDosen = new Dosen23[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            arrayOfDosen[i] = new Dosen23("", "", 0, true);
            arrayOfDosen[i].inputData();
        }

        System.out.println("\n=== DATA DOSEN ===");
        for (Dosen23 dosen23 : arrayOfDosen) {
            dosen23.cetakInfo();
        }
    }
}
