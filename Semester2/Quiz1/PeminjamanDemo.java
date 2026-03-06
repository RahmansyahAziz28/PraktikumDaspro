package Semester2.Quiz1;

import java.util.Scanner;

public class PeminjamanDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Buku[] buku = new Buku[10];
        Mahasiswa[] mahasiswa = new Mahasiswa[10];
        int jumlahBuku = 0;
        int jumlahMahasiswa = 0;
        int option;
        
        while (true) {
            Buku.menu();
            System.out.print("Pilih menu: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    jumlahBuku = Buku.tambahBuku(sc, buku, jumlahBuku);
                    break;
                case 2:
                    jumlahMahasiswa = Mahasiswa.tambahMahasiswa(sc, mahasiswa, jumlahMahasiswa);
                    break;
                case 3:
                    Buku.prosesPinjamBuku(sc, buku, mahasiswa, jumlahBuku, jumlahMahasiswa);
                    break;
                case 4:
                    Buku.prosesKembalikanBuku(sc, buku, mahasiswa, jumlahBuku, jumlahMahasiswa);
                    break;
                case 5:
                    Buku.tampilkanSemuaBuku(buku, jumlahBuku);
                    break;
                case 6:
                    Mahasiswa.tampilkanSemuaMahasiswa(mahasiswa, jumlahMahasiswa);
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
