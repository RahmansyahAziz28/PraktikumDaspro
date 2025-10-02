package jobsheet2;

import java.util.Scanner;

public class Segitiga19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = sc.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = sc.nextDouble();
        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas garasi Pak Dani adalah: " + luas + " m2");
        }
}
