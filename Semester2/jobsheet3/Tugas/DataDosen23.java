package Semester2.jobsheet3.Tugas;

public class DataDosen23 {
    void dataSemuaDosen(Dosen23[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (Dosen23 dosen23 : arrayOfDosen) {
            dosen23.cetakInfo();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;

        for (Dosen23 dosen23 : arrayOfDosen) {
            if (dosen23.jenisKelamin) {
                jumlahLakiLaki++;
            } else {
                jumlahPerempuan++;
            }
        }

        System.out.println("\nJumlah Dosen Laki-laki: " + jumlahLakiLaki);
        System.out.println("Jumlah Dosen Perempuan: " + jumlahPerempuan);
    }

    void rerataUsiaDosenPerJenisKelamins(Dosen23[] arrayOfDosen) {
        int totalUsiaLakiLaki = 0;
        int totalUsiaPerempuan = 0;
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;

        for (Dosen23 dosen23 : arrayOfDosen) {
            if (dosen23.jenisKelamin) {
                totalUsiaLakiLaki += dosen23.usia;
                jumlahLakiLaki++;
            } else {
                totalUsiaPerempuan += dosen23.usia;
                jumlahPerempuan++;
            }
        }

        double rerataUsiaLakiLaki = jumlahLakiLaki > 0 ? (double) totalUsiaLakiLaki / jumlahLakiLaki : 0;
        double rerataUsiaPerempuan = jumlahPerempuan > 0 ? (double) totalUsiaPerempuan / jumlahPerempuan : 0;

        System.out.println("\nRerata Usia Dosen Laki-laki: " + rerataUsiaLakiLaki);
        System.out.println("Rerata Usia Dosen Perempuan: " + rerataUsiaPerempuan);
    }

    void infoDosenPalingTua(Dosen23[] arrayOfDosen) {
        Dosen23 dosenPalingTua = arrayOfDosen[0];

        for (Dosen23 dosen23 : arrayOfDosen) {
            if (dosen23.usia > dosenPalingTua.usia) {
                dosenPalingTua = dosen23;
            }
        }

        System.out.println("\n=== INFO DOSEN PALING TUA ===");
        dosenPalingTua.cetakInfo();
    }

    void infoDosenPalingMuda(Dosen23[] arrayOfDosen) {
        Dosen23 dosenPalingMuda = arrayOfDosen[0];

        for (Dosen23 dosen23 : arrayOfDosen) {
            if (dosen23.usia < dosenPalingMuda.usia) {
                dosenPalingMuda = dosen23;
            }
        }

        System.out.println("\n=== INFO DOSEN PALING MUDA ===");
        dosenPalingMuda.cetakInfo();
    }
}
