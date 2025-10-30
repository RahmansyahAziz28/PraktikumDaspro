package jobsheet8;

import java.util.Scanner;

public class tugas3 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int item = 0, totalitems = 0, customers = 0;

        System.out.print("Input jumlah cabang: ");
        int cabang = sc.nextInt();
        System.out.println("======INPUT PENJUALAN CABANG======");
        while (i <= cabang) {
            int items = 0;

            System.out.println("\n====" + "CABANG " + i + "====");
            System.out.print("Jumlah pelanggan: ");
            int customer = sc.nextInt();
            customers += customer;

            for (int j = 1; j <= customer; j++) {
                System.out.print("- Pelanggan " + j + " Memesan berapa item: " + ": ");
                item = sc.nextInt();
                items += item;
                totalitems += item;
            }

            System.out.println("- Cabang " + i);
            System.out.println("- Jumlah pelanggan: " + customer);
            System.out.println("- Item terjual: " + items);
            i++;
        }

        System.out.println("Total seluruh cabang: ");
        System.out.println("Pelanggan: " + customers);
        System.out.println("Item terjual: " + totalitems);
    }

}
