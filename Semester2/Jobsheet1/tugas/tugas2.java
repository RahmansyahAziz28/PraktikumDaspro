package tugas;

import java.util.Scanner;

public class tugas2 {
    public static Scanner sc = new Scanner(System.in);

    static void inputJadwal(String jadwal[][]){
        for (int i = 0; i < jadwal.length; i++) {
            System.out.print("Masukkan mata kuliah ke-" + (i + 1) + ": ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Masukkan hari kuliah: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Masukkan waktu kuliah: ");
            jadwal[i][2] = sc.nextLine();
        }
    }

    static void showJadwal(String jadwal[][]){
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%s - %s - %s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2]);
        }
    }   

    static void showJadwalByDay(String jadwal[][]){
        System.out.print("\nMasukkan hari yang ingin ditampilkan: ");
        String day = sc.nextLine();

        System.out.println("\nJadwal Kuliah pada hari " + day + ":");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][1].equalsIgnoreCase(day)) {
                System.out.printf("%s - %s\n", jadwal[i][0], jadwal[i][2]);
            }
        }
    }

    static void showJadwalByMatkul (String jadwal[][]){
        System.out.print("\nMasukkan mata kuliah yang ingin ditampilkan: ");
        String matkul = sc.nextLine();

        System.out.println("\nJadwal Kuliah untuk mata kuliah " + matkul + ":");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.printf("%s - %s\n", jadwal[i][1], jadwal[i][2]);
            }
        }
    }

    static void menu(){
        System.out.println("\nMenu:");
        System.out.println("1. Tampilkan semua jadwal");
        System.out.println("2. Tampilkan jadwal berdasarkan hari");
        System.out.println("3. Tampilkan jadwal berdasarkan mata kuliah");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        String jadwal[][] = new String[n][3];
        int menu;
        
        sc.nextLine();
        inputJadwal(jadwal);
        
        do {
            menu();
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    showJadwal(jadwal);
                    break;
                case 2:
                    showJadwalByDay(jadwal);
                    break;
                case 3:
                    showJadwalByMatkul(jadwal);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu < 1 || menu > 4);
    }
}
