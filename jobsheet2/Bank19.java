package jobsheet2;

public class Bank19 {
    public static void main(String[] args) {
        double tabunganAwal = 5000000; 
        int lama = 5; 
        double bungaPerTahun = 0.02; 

        double bungaTotal = tabunganAwal * bungaPerTahun * lama;
        double tabunganAkhir = tabunganAwal + bungaTotal;

        System.out.println("Tabungan Awal     : Rp " + tabunganAwal);
        System.out.println("Lama Menabung     : " + lama + " tahun");
        System.out.println("Bunga Total       : Rp " + bungaTotal);
        System.out.println("Jumlah Tabungan   : Rp " + tabunganAkhir);
    }
}
