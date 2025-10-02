package pertemuan3.praktikum;
import java.util.Scanner;

public class MenghitungTotalBayar23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan harga barang: ");
        int harga = sc.nextInt();
        double diskon = 0.15;
        double potongan = harga * diskon;
        double total = harga - potongan;
        System.out.println("Jumlah yang harus dibayar: Rp.  " + total);
    }
}
