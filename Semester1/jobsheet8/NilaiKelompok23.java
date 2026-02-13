package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int nilai;
        int totalNilai;
        double rataNilai;
        double highestAverage = 0;

        while (i <= 2) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 2; j++) {
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 2;

            if (rataNilai > highestAverage) {
                highestAverage = rataNilai;
            }

            System.out.println("Rata-rata Nilai Kelompok " + i + " adalah " + rataNilai);
            i++;
        }

        System.out.println("Rata-rata Nilai Tertinggi adalah " + highestAverage);
    }

}
