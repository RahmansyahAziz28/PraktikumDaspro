package jobsheet5.tugas;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah sks: ");
        int sks = sc.nextInt();

        if (sks >= 12){
            System.out.println("Akses wifi diberikan (mahasiswa aktif)");
        } else {
            System.out.println("Akses wifi ditolak, sks kurang dari 12");
        }
    }
}
