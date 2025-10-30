package jobsheet8;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int c = 1;
        String cabor[] = {"badminton", "tenis meja", "basket", "bola voli"};

        while (i <= 5) {
            System.out.println("Politeknik " + i);

            while (c <= cabor.length) {
                System.out.println("Cabang Olahraga " + cabor[c-1]);
                for (int j = 1; j <= 2; j++) {
                    System.out.print("Nama pemain ke " + j + ": ");
                    String name = sc.nextLine();
                }
                c++;
            }
            c = 1;
            i++;
        }

    }
}
