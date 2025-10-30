package jobsheet8;

public class tugas {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int jumlahKuadrat = 0;
            String deretKuadrat = "";

            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j; 
                jumlahKuadrat += kuadrat;

            
                if (j > 1) {
                    deretKuadrat += " + ";
                }
                deretKuadrat += kuadrat;
            }

        
            System.out.println("n = " + i + " -> jumlah kuadrat = " + deretKuadrat + " = " + jumlahKuadrat);
        }
    }
}