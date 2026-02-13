import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String NIM = sc.next();
        String fullOutput = "";

        System.out.println("Jumlah karakter: " + NIM.length());
        for (int i = 0; i < NIM.length(); i++) {
            char c = NIM.charAt(i);
            int asNumber = Character.getNumericValue(c);
            if (asNumber % 3 == 0) {
                fullOutput += "#" + " ";
            } else if (asNumber % 2 == 0) {
                fullOutput += c + " ";
            } else if (asNumber == 10 || asNumber == 15) {
                fullOutput += "";
            } else {
                fullOutput += "*" + " ";
            }
        }
        System.out.println(fullOutput.trim());
    }
}
