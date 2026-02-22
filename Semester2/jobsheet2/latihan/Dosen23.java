package Semester2.jobsheet2.latihan;

class Dosen23 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen23() {}

    public Dosen23(String id, String nm, boolean aktif, int tahun, String bidang) {
        idDosen = id;
        nama = nm;
        statusAktif = aktif;
        tahunBergabung = tahun;
        bidangKeahlian = bidang;
    }

    void tampilinInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2024) + " tahun");
    }

    void setStatusAktif(boolean statusBaru) {
        statusAktif = statusBaru;
    }


    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    void ubahKeahlian(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
    }
}
