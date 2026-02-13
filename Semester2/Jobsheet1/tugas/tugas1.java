package tugas;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' ' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' ' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' ' },
                { 'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' ' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' ' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' ' },
                { 'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' ' },
                { 'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }
        };

        System.out.print("Masukkan kode kota (A, B, D, E, F, G, H, L, N): ");
        String kode = sc.nextLine();

        for (int i = 0; i < KODE.length; i++) {
            if (kode.charAt(0) == KODE[i]) {
                System.out.print("Kota dengan kode " + kode.charAt(0) + " adalah ");
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j]);
                }
                System.out.println();
            }
            
        }
    }
}
