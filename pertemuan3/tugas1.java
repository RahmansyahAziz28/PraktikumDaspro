package pertemuan3;
import javax.swing.JOptionPane;

public class tugas1 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Harga X : "));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Uang Muka Y : "));
        int z = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Bulan Z : "));
        double bunga = 0.01;
        double restValue = x - y;
        double bungaperMonth = restValue * bunga / z;
        double cicilanPermont = bungaperMonth + (restValue / z);
        JOptionPane.showMessageDialog(null, "Harga X : " + x + "\nUang Muka Y : " + y + "\nBulan Z : " + z + "\nBunga : " + bunga*100 + "%" + "\nHarga setelah diskon : " + restValue + "\ncicilan per Bulan : " + cicilanPermont);
    }
}
