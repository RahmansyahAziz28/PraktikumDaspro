package jobsheet8;

import java.util.Scanner;

public class Star23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i+=2) {
                System.out.print("*");
        }
    }
}