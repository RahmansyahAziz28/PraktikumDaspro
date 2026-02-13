package Semester1;

import java.util.Scanner;

public class CM1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====INPUT DATA MAHASISWA====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        String matkul[] = {"Algoritma dan Pemrograman", "Struktur Data"}; //untuk menyimpan list mata kuliah
        String grade[] = new String[2]; //untuk menyimpan list grade 
        Boolean status[] = new Boolean[2]; //untuk menyimpan list status
        
        double average[] = new double[2]; //untuk menyimpan list rata-rata per matkul
        double utsData[] = new double[2]; //untuk menyimpan list nilai uts per matkul
        double uasData[] = new double[2]; // untuk menyimpan list nilai uas per matkul
        double tugasData[] = new double[2]; // untuk menyimpan list nilai tugas per matkul

        //untuk looping input nilai per matkul
        for (int i = 1; i <= 2; i++) {
            System.out.println("--- Mata Kuliah " + i + ". " + matkul[i - 1] + " ---");
            System.out.print("Nilai UTS : ");
            double uts = sc.nextInt();
            System.out.print("Nilai UAS : ");
            double uas = sc.nextInt();
            System.out.print("Nilai TUGAS : ");
            double tugas = sc.nextInt();
            //untuk menyimpan value dari nilai nilai uts, uas, dan tugas
            utsData[i - 1] = uts;
            uasData[i - 1] = uas;
            tugasData[i - 1] = tugas;

            double avg = (0.3 * uts) + (0.4 * uas) + (0.3 * tugas); //untuk menghitung nilai rata-rata
            status[i - 1] = (avg >= 60) ? true : false; //untuk menyimpan status lulus atau tidak

            //untuk menyimpan nilai rata-rata dan grade per matkul
            average[i - 1] = avg;
            if (avg >= 80) {
                grade[i - 1] = "A";
            } else if (avg >= 73) {
                grade[i - 1] = "B+";
            } else if (avg >= 65) {
                grade[i - 1] = "B";
            } else if (avg >= 60) {
                grade[i - 1] = "C+";
            } else if (avg >= 50) {
                grade[i - 1] = "C";
            } else if (avg >= 39) {
                grade[i - 1] = "D";
            } else {
                grade[i - 1] = "E";
            }
        }
        //untuk menampilkan output header tabel
        System.out.printf("%-30s %-8s %-8s %-8s %-12s %-12s %s%n", "Mata Kuliah", "UTS", "UAS", "TUGAS", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        //untuk menampilkan output isi tabel
        for (int a = 0; a < 2; a++) {
            System.out.printf("%-30s %-8.1f %-8.1f %-8.1f %-12.1f %-12s %s%n", matkul[a], utsData[a], uasData[a], tugasData[a], average[a], grade[a], (status[a] ? "Lulus" : "Tidak Lulus"));
        }
        double finalAvg = (average[0] + average[1]) / 2;
        System.out.printf("Rata-rata Nilai Akhir: %.2f%n", finalAvg);
        System.out.println("Status Kelulusan: " + (finalAvg >= 70 ? "Lulus" : "Tidak Lulus"));
    }
}
