package Semester2.jobsheet2.latihan;

class Matakuliah23 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public Matakuliah23() {}

    public Matakuliah23(String kd, String nm, int sks, int jam) {
        kodeMK = kd;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSks(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jamBaru) {
        jumlahJam += jamBaru;
    }

    void kurangiJam(int jamBaru) {
        
        if (jamBaru > jumlahJam) {
            System.out.println("Jumlah jam yang dikurangi melebihi jumlah jam saat ini.");
            return;
        }

        jumlahJam -= jamBaru;
    }

}
