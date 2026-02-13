package Semester2.jobsheet2;

import java.util.Scanner;

public class test {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matkulGradeKualifikasi[][] = {{"Pancasila", "", ""}, 
        {"Konsep Tenologi Informasi", "", ""}, 
        {"Critical Thinking dan Problem Solving", "", ""}, 
        {"Matematika Dasar", "", ""}, 
        {"Bahasa Inggris", "", ""}, 
        {"Dasar Pemrograman", "", ""}, 
        {"Praktikum Dasar Pemrograman", "", ""}, 
        {"Keselamatan Dan Kesehatan Kerja", "", ""}};
        Double nilai[][] = new Double[matkulGradeKualifikasi.length][2];
        Double totalNilai = 0.0;
        for (int i = 0; i < matkulGradeKualifikasi.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkulGradeKualifikasi[i][0] + ": ");
            nilai[i][0] = sc.nextDouble();
        }

        System.out.println("Hasil Konversi Nilai: ");
        System.out.printf("%-40s %12s %12s %12s %20s\n","Mata Kuliah", "Nilai", "Huruf", "Bobot", "Kualifikasi");
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < matkulGradeKualifikasi.length; i++) {

            if (nilai[i][0] > 80 && nilai[i][0] <= 100) {
                nilai[i][1] = 4.0;
                totalNilai += nilai[i][1];
                matkulGradeKualifikasi[i][1] = "A";
                matkulGradeKualifikasi[i][2] = "Sangat Baik";
            } else if (nilai[i][0] >= 73 && nilai[i][0] < 80) {
                nilai[i][1] = 3.5;
                totalNilai += nilai[i][1];
                matkulGradeKualifikasi[i][1] = "B+";
                matkulGradeKualifikasi[i][2] = "Lebih dari Baik";
            } else if (nilai[i][0] >= 65 && nilai[i][0] < 73) {
                nilai[i][1] = 3.0;
                totalNilai += nilai[i][1];
                matkulGradeKualifikasi[i][1] = "B";
                matkulGradeKualifikasi[i][2] = "Baik";
            } else if (nilai[i][0] > 60 && nilai[i][0] < 65) {
                nilai[i][1] = 2.3;
                totalNilai += nilai[i][1];
                matkulGradeKualifikasi[i][1] = "C+";
                matkulGradeKualifikasi[i][2] = "Lebih dari Cukup";
            } else if (nilai[i][0] >= 50 && nilai[i][0] < 60) {
                nilai[i][1] = 2.0;
                totalNilai += nilai[i][1];
                matkulGradeKualifikasi[i][1] = "C";
                matkulGradeKualifikasi[i][2] = "Cukup";
            } else if (nilai[i][0] > 39 && nilai[i][0] <= 50) {
                nilai[i][1] = 1.0;
                totalNilai += nilai[i][1];
                matkulGradeKualifikasi[i][1] = "D";
                matkulGradeKualifikasi[i][2] = "Kurang";
            } else {
                nilai[i][1] = 0.0;
                totalNilai += nilai[i][1];
                matkulGradeKualifikasi[i][1] = "E";
                matkulGradeKualifikasi[i][2] = "Gagal";
            }

            System.out.printf("%-40s %12.2f %12s %12.2f %20s\n",
                    matkulGradeKualifikasi[i][0],
                    nilai[i][0],
                    matkulGradeKualifikasi[i][1],
                    nilai[i][1],
                    matkulGradeKualifikasi[i][2]);
        }
        
        double ipk = totalNilai / matkulGradeKualifikasi.length;
        System.out.println("IPK: " + String.format("%.2f", ipk));
    }

}
