package Quiz;
import java.util.Scanner;

//Rahmansyah Aziz Pratama, 254107060091, SIB-1B, Soal 2
public class Soal223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abonemen = 50_000;
        int bicaraCostPerMinute = 200;
        int costPerSMS = 150;
        double PPN = 0.11;

        System.out.println("Masukkan Menit SMS yang digunakan: ");
        int minuteUse = sc.nextInt();
        System.out.println("Jumlah SMS: ");
        int sms = sc.nextInt();
        double totalCost = (minuteUse * bicaraCostPerMinute) + (sms * costPerSMS) + abonemen;
        double totalCostWithPPN = totalCost * PPN + totalCost;
        System.out.println("Total Biaya: " + (int) totalCostWithPPN);
    }
}
