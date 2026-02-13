package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("apakah mahasigma sudah bebas kompen? (y/t)");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen == "y"){
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4){
                pesan = "semua syarat terpenuhi , Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4){
                pesan = "Gagal!, Log bimbingan kurang";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal!, Log bimbingan P1 belum 8";
            } else {
                pesan = "Gagal!, Log bimbingan P2 belum 4";
            }
        } else {
            pesan = "gagal!, mahasiswa memiliki tanggungan kompen";
        }

        System.out.println(pesan);
    }
}
