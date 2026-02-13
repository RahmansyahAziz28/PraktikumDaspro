import java.util.Scanner;

public class soal323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        int[][] penjualan = {
            {5, 3, 2, 4},
            {3, 2, 4, 3},
            {2, 1, 3, 5},
            {6, 1, 3, 1},
            {7, 6, 5, 6},
            {2, 2, 2, 2},
            {5, 5, 5, 5},
        };

        while (true) {
            System.out.println("\n1. Tampilkan penjualan per produk");
            System.out.println("2. Tampilkan total penjualan perhari");
            System.out.println("3. Tampilkan produk dengan penjualan tertinggi");
            System.out.println("4. Tampilkan hari dengan penjualan tertinggi");
            System.out.println("5. Exit");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            if (pilihan == 1) {
                int produkTotal[] = new int[4];
                for (int i = 0; i < penjualan.length; i++) {
                    for (int j = 0; j < penjualan[i].length; j++) {
                        produkTotal[j] += penjualan[i][j];
                    }
                }

                for (int i = 0; i < produkTotal.length; i++) {
                    System.out.println("Total penjualan produk ke-" + (i + 1) + " adalah " + produkTotal[i]);
                }
            } else if (pilihan == 2) {
                for (int i = 0; i < penjualan.length; i++) {
                    int total = 0;
                    for (int j = 0; j < penjualan[i].length; j++) {
                        total += penjualan[i][j];
                    }
                    System.out.println("Total penjualan hari ke-" + (i + 1) + " adalah " + total);
                }
            } else if (pilihan == 3) {
                int produkTotal[] = new int[4];
                for (int i = 0; i < penjualan.length; i++) {
                    for (int j = 0; j < penjualan[i].length; j++) {
                        produkTotal[j] += penjualan[i][j];
                    }
                }

                int highest = 0;
                int productIndex = 0;
                for (int i = 0; i < produkTotal.length; i++) {
                    if (highest < produkTotal[i]) {
                        highest = produkTotal[i];
                        productIndex = i;
                    }
                }
                System.out.println("Produk dengan penjualan tertinggi adalah produk ke-" + (productIndex + 1) + " dengan total penjualan sebesar " + highest);
            } else if (pilihan == 4) {
                int hariTotal[] = new int[7];
                int highestDay = 0;
                for (int i = 0; i < penjualan.length; i++) {
                    int total = 0;
                    for (int j = 0; j < penjualan[i].length; j++) {
                        total += penjualan[i][j];
                    }

                    hariTotal[i] = total;
                    if (total > hariTotal[highestDay]) {
                        highestDay = i;
                    }
                    total = 0;

                }

                System.out.println("Hari dengan penjualan tertinggi adalah hari ke-" + (highestDay + 1) + " dengan total penjualan sebesar " + hariTotal[highestDay]);
            } else if (pilihan == 5) {
                System.out.println("Exited.");
                break;
            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih 1-3.");
            }
        }
    }
}
