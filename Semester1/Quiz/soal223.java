import java.util.Scanner;

public class soal223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai[][] = new int[4][3];

        for (int i = 0; i < 4; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " pada mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                total += nilai[i][j];
            }

            double avg = total / 3;
            String status = avg >= 60 ? "Lulus" : "Tidak Lulus";
            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + " adalah " + avg + ". Status: " + status);
        }
    }
}