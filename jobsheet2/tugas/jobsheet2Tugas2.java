package jobsheet2.tugas;
import javax.swing.JOptionPane;

public class jobsheet2Tugas2 {
    public static void main(String[] args) {
        // int lebar = 50;
        // int panjang = 100;
        // int diameter = 2;
        // int sisi = 2;
        int lebar = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Lebar : "));
        int panjang = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Panjang : "));
        int diameter = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Diameter : "));
        int sisi = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Sisi : "));
        double phi = 3.14;

        double luasTanah = lebar * panjang;
        double jarijari = diameter / 2.0;
        double luasLingkaran = phi * (jarijari * jarijari);
        double luas2Kolam = 2 * luasLingkaran;
        double luasPersegi = sisi * sisi;
        double totalLuasKolam = luas2Kolam + luasPersegi;
        double sisaTanah = luasTanah - totalLuasKolam;

        JOptionPane.showMessageDialog(null, "Luas Tanah : " + luasTanah + " m²" + "\nLuas Kolam Lingkaran : " + luasLingkaran + " m²"
                + "\nLuas 2 Kolam : " + luas2Kolam + " m²"
                +"\nLuas Persegi : " + luasPersegi + " m²"
                +"\nTotal Luas Kolam : " + totalLuasKolam + " m²" + "\nSisa Tanah : " + sisaTanah + " m²" );
    }
}
