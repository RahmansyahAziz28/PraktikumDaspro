package Semester2.Quiz1;

import java.util.Scanner;

public class Mahasiswa {
    public String nim;
    public String nama;
    public int jumlahPinjaman;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.jumlahPinjaman = 0;
    }

    void cetakInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Pinjaman: " + jumlahPinjaman);
        System.out.println("----------------------------");
    }

    static int tambahMahasiswa(Scanner sc, Mahasiswa[] mahasiswa, int jumlahMahasiswa) {
        if (jumlahMahasiswa < mahasiswa.length) {
            System.out.print("Masukkan NIM Mahasiswa: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama Mahasiswa: ");
            String nama = sc.nextLine();
            
            mahasiswa[jumlahMahasiswa] = new Mahasiswa(nim, nama);
            jumlahMahasiswa++;
            System.out.println("Mahasiswa berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas mahasiswa sudah penuh!");
        }
        return jumlahMahasiswa;
    }

    static Mahasiswa cariMahasiswa(Mahasiswa[] daftarMahasiswa, int jumlah, String nim) {
        for (int i = 0; i < jumlah; i++) {
            if (daftarMahasiswa[i].nim.equals(nim)) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

}
