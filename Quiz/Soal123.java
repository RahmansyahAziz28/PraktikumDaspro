package Quiz;
import java.util.Scanner;

//Rahmansyah Aziz Pratama, 254107060091, SIB-1B, Soal 1
public class Soal123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costPerLiter = 2500;

        System.out.println("Panjang: "); 
        int panjang = sc.nextInt();
        System.out.println("Lebar: "); 
        int lebar = sc.nextInt();
        System.out.println("Tinggi: ");
        int tinggi = sc.nextInt();
        int volume = panjang * lebar * tinggi;

        double volumeLiter = volume / 1000.0;
        double totalCost = volumeLiter * costPerLiter;
        System.out.println("Volume: " + volume + " cm" + "\nVolume Liter: " + (int) volumeLiter + "\nTotal Biaya: " +  "Rp. " + (int) totalCost);
    }
}
