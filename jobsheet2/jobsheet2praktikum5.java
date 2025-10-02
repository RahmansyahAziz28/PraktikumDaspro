package jobsheet2;

import java.util.Scanner;

public class jobsheet2praktikum5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah tabungan awal: ");
        double tabunganAwal = sc.nextDouble();
        
        System.out.print("Masukkan lama menabung (tahun): ");
        int lama = sc.nextInt();

        double bungaPerTahun = 0.02; // 2% per tahun

        double bungaTotal = lama * bungaPerTahun * tabunganAwal;
        double tabunganAkhir = bungaTotal + tabunganAwal;

        System.out.println("==================================");
        System.out.println("Tabungan Awal       : Rp " + tabunganAwal);
        System.out.println("Lama Menabung       : " + lama + " tahun");
        System.out.println("Total Bunga         : Rp " + bungaTotal);
        System.out.println("Jumlah Tabungan Akhir: Rp " + tabunganAkhir);
        sc.close();
    }
}
