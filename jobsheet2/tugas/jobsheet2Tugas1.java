package jobsheet2.tugas;
import javax.swing.JOptionPane;

public class jobsheet2Tugas1 {
    public static void main(String[] args) {
        int gajiPokok = Integer.parseInt(JOptionPane.showInputDialog(null, "Gaji Pokok : "));
        int tunjangan = Integer.parseInt(JOptionPane.showInputDialog(null, "Tunjangan : "));
        int jumlahAnak = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Anak : "));
        // int gajiPokok = 3000000;
        // int tunjangan = 150000;
        // int jumlahAnak = 3;
        double pajak = 0.05;

        double finalGaji = gajiPokok * pajak;
        double totalTunjangan = tunjangan * jumlahAnak;
        double totalGaji = gajiPokok - finalGaji + totalTunjangan;
        JOptionPane.showMessageDialog(null, "Gaji Pokok : " + gajiPokok + "\nTunjangan : " + tunjangan + "\nJumlah Anak : " + jumlahAnak + "\nPajak : " + pajak*100 + "%" + "\nTotal Gaji : " + totalGaji);
    }
}