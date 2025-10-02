package pertemuan3.praktikum;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan panjang: ");
        int panjang = sc.nextInt();
        System.out.println("Masukkan lebar: ");
        int lebar = sc.nextInt();
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}
