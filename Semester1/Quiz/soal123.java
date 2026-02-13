import java.util.Arrays;
import java.util.Scanner;

public class soal123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddCount = 0, evenCount = 0, number = 0;

        System.out.print("Masukkan jumlah bilangan: ");
        number = sc.nextInt();

        
        int Numbers[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            Numbers[i] = sc.nextInt();

            if (Numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int evenNumbers[] = new int[evenCount];
        int oddNumbers[] = new int[oddCount];
        int even = 0, odd = 0;
        for (int i = 0; i < number; i++) {
            if (Numbers[i] % 2 == 0) {
                evenNumbers[even++] = Numbers[i];
            } else {
                oddNumbers[odd++] = Numbers[i];
            }
        }

        System.out.println("Jumlah bilangan genap: " + evenCount);
        System.out.println("Jumlah bilangan ganjil: " + oddCount);

        System.out.println("Bilangan genap: " + Arrays.toString(evenNumbers));
        System.out.println("Bilangan ganjil: " + Arrays.toString(oddNumbers));
    }
}
