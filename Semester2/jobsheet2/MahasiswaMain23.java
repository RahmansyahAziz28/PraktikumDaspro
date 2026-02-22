package Semester2.jobsheet2;

public class MahasiswaMain23 {
    public static void main(String[] args) {
        Mahasiswa23 mhs1 = new Mahasiswa23();
        mhs1.nama = "Andi";
        mhs1.nim = "123456";
        mhs1.kelas = "TI-1A";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-1B");
        mhs1.updateIpk(3.75);
        mhs1.tampilkanInformasi();

        Mahasiswa23 mhs2 = new Mahasiswa23("Budi", "654321", "TI-1A", 2.85);
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
