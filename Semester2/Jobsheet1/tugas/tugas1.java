package tugas;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Kota[][] = {{"A", "BANTEN"}, {"B", "JAKARTA"}, {"D", "BANDUNG"}, {"E", "CIREBON"}, {"F", "BOGOR"}, {"G", "PEKALONGAN"}, {"H", "SEMARANG"}, {"L", "SURABAYA"}, {"N", "MALANG", "TEGAL"}};
        System.out.print("Masukkan kode kota (A, B, D, E, F, G, H, L, N): ");
        String kode = sc.nextLine();

        for (int i = 0; i < Kota.length; i++) {
            if (Kota[i][0].equalsIgnoreCase(kode)) {
                System.out.println("Kota tujuan Anda adalah " + Kota[i][1]);
                return;
            }
        }
    }
}
