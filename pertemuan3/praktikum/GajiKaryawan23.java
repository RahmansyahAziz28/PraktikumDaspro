package pertemuan3.praktikum;
import java.util.Scanner;

public class GajiKaryawan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tunjTransparant = 600000;
        double tunjMkn = 400000;

        System.out.println("Gaji pokok: ");
        int gajiPokok = sc.nextInt();
        double bonus = 0.05 * gajiPokok;
        double totalGaji = gajiPokok + bonus + tunjTransparant + tunjMkn - 0.1 * gajiPokok;
        System.out.println("Bonus: " + bonus + "\nTotal gaji: " + (int) totalGaji);
    }
}
