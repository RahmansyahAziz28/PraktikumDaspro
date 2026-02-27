package Semester2.jobsheet3;
import java.util.Scanner;

public class MataKuliah23 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah23() {

    }

    public MataKuliah23(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode        : ");
        kode = sc.nextLine();
        System.out.print("Nama        : ");
        nama = sc.nextLine();
        System.out.print("Sks         : ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam  : ");
        jumlahJam = sc.nextInt();
        sc.nextLine();
    }

    void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Sks         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }
}
