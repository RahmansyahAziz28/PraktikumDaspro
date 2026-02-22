package Semester2.jobsheet2.latihan;

public class Dosenmain23 {
    public static void main(String[] args) {
        Dosen23 dosen1 = new Dosen23();
        dosen1.idDosen = "123";
        dosen1.nama = "Andi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "TI";
        
        dosen1.tampilinInformasi();
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("SI");
        dosen1.tampilinInformasi();
        
        Dosen23 dosen2 = new Dosen23("456", "Budi", false, 2010, "SI");
        dosen2.tampilinInformasi();
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("TI");
        dosen2.tampilinInformasi();
    }
}
