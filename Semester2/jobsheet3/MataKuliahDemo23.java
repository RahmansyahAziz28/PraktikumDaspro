package Semester2.jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo23 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MataKuliah23[] arrayOfMatakuliah = new MataKuliah23[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah23();
            arrayOfMatakuliah[i].tambahData();
            System.out.println("----------------------------------------");
        }

        System.out.println("\n=== DATA MATAKULIAH ===");
        for (int i = 0; i < jumlah; i++) {
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("----------------------------------------");
        }
    }
}
