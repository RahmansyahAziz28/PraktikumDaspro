import java.util.Scanner;

public class percobaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai[] = new int[4];
        String type[] = {"Tugas", "Kuis", "UTS", "UAS"};
        double sum = 0;
        System.out.println(nilai.length);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai " + type[i] + ": ");
            nilai[i] = sc.nextInt();
        }

        for (int n : nilai) {
            if (n < 0 || n > 100) {
                System.out.println("========================================");
                System.out.println("Nilai tidak valid");
                System.out.println("========================================");
                return;
            }
        }

        sum = (0.2 * nilai[0]) + (0.2 * nilai[1]) + (0.3 * nilai[2]) + (0.3 * nilai[3]);
        
        if (sum > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            System.out.println("Rata-rata nilai: " + sum);

            if (sum > 80 && sum <= 100) {
                System.out.println("========================================");
                System.out.println("Nilai Huruf: A");
                System.out.println("========================================");
                System.out.println("Selamat Anda Lulus");
            } else if (sum > 73 && sum <= 80) {
                System.out.println("========================================");
                System.out.println("Nilai Huruf: B+");
                System.out.println("========================================");
                System.out.println("Selamat Anda Lulus");
            } else if (sum > 65 && sum <= 73) {
                System.out.println("========================================");
                System.out.println("Nilai Huruf: B");
                System.out.println("========================================");
                System.out.println("Selamat Anda Lulus");
            } else if (sum > 60 && sum <= 65) {
                System.out.println("========================================");
                System.out.println("Nilai Huruf: C+");
                System.out.println("========================================");
                System.out.println("Selamat Anda Lulus");
            } else if (sum > 50 && sum <= 60) {
                System.out.println("========================================");
                System.out.println("Nilai Huruf: C");
                System.out.println("========================================");
                System.out.println("Selamat Anda Lulus");
            } else if (sum > 39 && sum <= 50) {
                System.out.println("========================================");
                System.out.println("Nilai Huruf: D");
                System.out.println("========================================");
                System.out.println("Maaf Anda Tidak Lulus");
            } else {
                System.out.println("========================================");
                System.out.println("Nilai Huruf: E");
                System.out.println("========================================");
                System.out.println("Maaf Anda Tidak Lulus");
            }
        }
    }
}
