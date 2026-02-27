package Semester2.jobsheet3.Tugas;

import java.util.Scanner;

public class Dosen23 {
    String kode, nama;
    int usia;
    Boolean jenisKelamin;

    public Dosen23(String kode, String nama, int usia, Boolean jenisKelamin) {
        this.kode = kode;
        this.nama = nama;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;

    }

    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode        : ");
        kode = sc.nextLine();
        System.out.print("Nama        : ");
        nama = sc.nextLine();
        System.out.print("Usia        : ");
        usia = sc.nextInt();
        System.out.print("Jenis Kelamin (true untuk Laki-laki, false untuk Perempuan): ");
        jenisKelamin = sc.nextBoolean();

        System.out.println("----------------------------------------");
    }

    void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Usia        : " + usia);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));

        System.out.println("----------------------------------------");
    }
}
