package Semester2.jobsheet3.Tugas;

public class DosenDemo23 {
    public static void main(String[] args) {
        Dosen23[] arrayOfDosen = new Dosen23[3];
        DataDosen23 dataDosen23 = new DataDosen23();

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            arrayOfDosen[i] = new Dosen23("", "", 0, true);
            arrayOfDosen[i].inputData();
        }

        dataDosen23.dataSemuaDosen(arrayOfDosen);
        dataDosen23.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen23.rerataUsiaDosenPerJenisKelamins(arrayOfDosen);
        dataDosen23.infoDosenPalingTua(arrayOfDosen);
        dataDosen23.infoDosenPalingMuda(arrayOfDosen);
    }
}
