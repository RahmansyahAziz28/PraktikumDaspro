package Semester2.jobsheet2.latihan;

public class MatakuliahMain23 {
    public static void main(String[] args) {
        Matakuliah23 mk1 = new Matakuliah23();
        mk1.kodeMK = "TI101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 48;

        mk1.tampilkanInformasi();
        mk1.ubahSks(4);
        mk1.tambahJam(16);
        mk1.tampilkanInformasi();

        Matakuliah23 mk2 = new Matakuliah23("TI102", "Struktur Data", 3, 48);
        mk2.kurangiJam(8);
        mk2.tampilkanInformasi();
    }
}
