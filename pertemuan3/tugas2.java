package pertemuan3;
import javax.swing.JOptionPane;

public class tugas2 {
    public static void main(String[] args) {
        int km = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Jarak Tempuh (km) : "));
        int harga = 100000;
        int liter = km / 2;
        int total = harga * liter;
        JOptionPane.showMessageDialog(null, "Jarak Tempuh : " + km + " km" + "\nJumlah Liter : " + liter + " liter" + "\nTotal Harga : " + total);
    }
}
