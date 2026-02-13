import java.util.Scanner;

public class percobaan4 {

    static void showPendapatan(int stock[][], int price[]) {
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * price[j];
            }
            System.out.println("Pendapatan cabang RoyalGarden" + (i + 1) + ": Rp" + pendapatan);
            if (pendapatan > 1_500_000){
                System.out.println("Status Sangat Baik");
            } else {
                System.out.println("Status Perlu Evaluasi");
            }
        }
    }

    public Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int stock[][] = { {10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9} };
        int price[] = {75_000, 50_000, 60_000, 10_000};
        showPendapatan(stock, price);
    }
}
