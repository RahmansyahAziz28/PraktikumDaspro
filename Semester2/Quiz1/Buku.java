package Semester2.Quiz1;

import java.util.Scanner;

public class Buku {
    public String nim;
    public String judul;
    public String kode;
    public String penulis;
    public boolean isAvailable;

    public Buku(String judul, String kode, String penulis) {
        this.judul = judul;
        this.kode = kode;
        this.penulis = penulis;
        this.isAvailable = true;
        this.nim = "";
    }

    void cetakInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Kode: " + kode);
        System.out.println("Penulis: " + penulis);
        System.out.println("Status: " + (isAvailable ? "Tersedia" : "Dipinjam"));
        if (!isAvailable) {
            System.out.println("Dipinjam oleh NIM: " + nim);
        }
        System.out.println("----------------------------");
    }

    boolean pinjamBuku(String nimMahasiswa) {
        if (isAvailable) {
            isAvailable = false;
            this.nim = nimMahasiswa;
            System.out.println("Buku '" + judul + "' berhasil dipinjam!");
            return true;
        } else {
            System.out.println("Maaf, buku ini sedang dipinjam.");
            return false;
        }
    }

    boolean kembalikanBuku() {
        if (!isAvailable) {
            isAvailable = true;
            this.nim = "";
            System.out.println("Buku '" + judul + "' berhasil dikembalikan!");
            return true;
        } else {
            System.out.println("Buku ini tidak sedang dipinjam.");
            return false;
        }
    }

    static void menu() {
        System.out.println("\n=== SISTEM PEMINJAMAN BUKU ===");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Tampilkan Semua Buku");
        System.out.println("6. Tampilkan Semua Mahasiswa");
        System.out.println("7. Keluar");
    }

    static int tambahBuku(Scanner sc, Buku[] buku, int jumlahBuku) {
        if (jumlahBuku < buku.length) {
            System.out.print("Masukkan Judul Buku: ");
            String judul = sc.nextLine();
            System.out.print("Masukkan Kode Buku: ");
            String kode = sc.nextLine();
            System.out.print("Masukkan Penulis Buku: ");
            String penulis = sc.nextLine();
            
            buku[jumlahBuku] = new Buku(judul, kode, penulis);
            jumlahBuku++;
            System.out.println("Buku berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas buku sudah penuh!");
        }
        return jumlahBuku;
    }

    static Buku cariBuku(Buku[] daftarBuku, int jumlah, String kode) {
        for (int i = 0; i < jumlah; i++) {
            if (daftarBuku[i].kode.equals(kode)) {
                return daftarBuku[i];
            }
        }
        return null;
    }

    static void tampilkanSemuaBuku(Buku[] daftarBuku, int jumlah) {
        if (jumlah == 0) {
            System.out.println("Belum ada buku yang terdaftar!");
        } else {
            System.out.println("\n=== DAFTAR BUKU ===");
            for (int i = 0; i < jumlah; i++) {
                daftarBuku[i].cetakInfo();
            }
        }
    }

    static void prosesPinjamBuku(Scanner sc, Buku[] buku, Mahasiswa[] mahasiswa, int jumlahBuku, int jumlahMahasiswa) {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku yang terdaftar!");
            return;
        }
        if (jumlahMahasiswa == 0) {
            System.out.println("Belum ada mahasiswa yang terdaftar!");
            return;
        }
        
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nimPinjam = sc.nextLine();
        
        Mahasiswa mhs = Mahasiswa.cariMahasiswa(mahasiswa, jumlahMahasiswa, nimPinjam);
        if (mhs == null) {
            System.out.println("Mahasiswa dengan NIM " + nimPinjam + " tidak ditemukan!");
            return;
        }
        
        if (mhs.jumlahPinjaman >= 2) {
            System.out.println("Mahasiswa " + mhs.nama + " sudah meminjam 2 buku (maksimal)!");
            System.out.println("Silakan kembalikan buku terlebih dahulu.");
            return;
        }
        
        System.out.print("Masukkan Kode Buku: ");
        String kode = sc.nextLine();
        
        Buku bukuPinjam = cariBuku(buku, jumlahBuku, kode);
        if (bukuPinjam == null) {
            System.out.println("Buku dengan kode " + kode + " tidak ditemukan!");
        } else {
            if (bukuPinjam.pinjamBuku(nimPinjam)) {
                mhs.jumlahPinjaman++;
            }
        }
    }

    static void prosesKembalikanBuku(Scanner sc, Buku[] buku, Mahasiswa[] mahasiswa, int jumlahBuku, int jumlahMahasiswa) {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku yang terdaftar!");
            return;
        }
        
        System.out.print("Masukkan Kode Buku: ");
        String kode = sc.nextLine();
        
        Buku bukuKembali = cariBuku(buku, jumlahBuku, kode);
        if (bukuKembali == null) {
            System.out.println("Buku dengan kode " + kode + " tidak ditemukan!");
        } else {
            String nimPeminjam = bukuKembali.nim;
            if (bukuKembali.kembalikanBuku()) {
                Mahasiswa mhs = Mahasiswa.cariMahasiswa(mahasiswa, jumlahMahasiswa, nimPeminjam);
                if (mhs != null) {
                    mhs.jumlahPinjaman--;
                }
            }
        }
    }
}
