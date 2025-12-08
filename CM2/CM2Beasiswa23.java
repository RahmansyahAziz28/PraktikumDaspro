package CM2;
import java.util.Scanner;

public class CM2Beasiswa23 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] pendaftar = new String[0][5];
        int pilihan;

        while (true) {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    pendaftar = register(pendaftar);
                    break;
                case 2:
                    showAll(pendaftar);
                    break;
                case 3:
                    searchByJenis(pendaftar);
                    break;
                case 4:
                    calculateAverageIPKByJenis(pendaftar);
                    break;
                case 5:
                    System.out.println("Keluar");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }

    }

    static void menu() {
        System.out.println("=== Sistem Pendaftaran Beasiswa ===");
        System.out.println("1. Tambah Data Pendaftar Mahasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar Jenis Beasiswa");
        System.out.println("4. Hitung Rata-Rata IPK per Jenis Mahasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    static String[][] register(String[][] pendaftar) {
        System.out.print("Masukkan jenis beasiswa (Regular/Unggulan/Riset): ");
        String jenisBeasiswa = sc.nextLine();

        if (!jenisBeasiswa.equalsIgnoreCase("Regular") &&
                !jenisBeasiswa.equalsIgnoreCase("Unggulan") &&
                !jenisBeasiswa.equalsIgnoreCase("Riset")) {
            System.out.println("Jenis beasiswa tidak valid. Pendaftaran dibatalkan.\n");
            return pendaftar;
        }

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("IPK terakhir: ");
        String ipk = sc.nextLine();
        System.out.print("Penghasilan orang tua (maksimal 2000000): ");
        String penghasilan = sc.nextLine();

        if (Double.parseDouble(ipk) < 0.0 || Double.parseDouble(ipk) > 4.0) {
            System.out.println("IPK tidak valid. Pendaftaran dibatalkan.\n");
            return pendaftar;
        }

        if (Double.parseDouble(penghasilan) >= 2_000_000) {
            System.out.println("Penghasilan ortu tidak valid. Pendaftaran dibatalkan.\n");
            return pendaftar;
        }

        String[] dataPendaftar = { nama, nim, ipk, jenisBeasiswa, penghasilan };
        String[][] updatedPendaftar = new String[pendaftar.length + 1][];
        updatedPendaftar[pendaftar.length] = dataPendaftar;
        System.out.println("Pendaftar berhasil ditambahkan. Total pendaftar: " + updatedPendaftar.length + "\n");
        return updatedPendaftar;
    }

    static void showAll(String[][] pendaftar) {
        if (pendaftar.length == 0) {
            System.out.println("Tidak ada data pendaftar.");
            return;
        }

        System.out.println("\n=== Daftar Pendaftar Beasiswa ===");
        for (int i = 0; i < pendaftar.length; i++) {
            System.out.println("Pendaftar ke-" + (i + 1) + ":");
            System.out.println("Nama: " + pendaftar[i][0]);
            System.out.println("NIM: " + pendaftar[i][1]);
            System.out.println("IPK: " + pendaftar[i][2]);
            System.out.println("Jenis Beasiswa: " + pendaftar[i][3]);
            System.out.println("Penghasilan Orang Tua: " + pendaftar[i][4]);
            System.out.println();
        }
    }

    static void searchByJenis(String[][] pendaftar) {
        System.out.print("Masukkan jenis beasiswa yang dicari (Regular/Unggulan/Riset): ");
        String jenisCari = sc.nextLine();
        boolean found = false;

        System.out.println("\n=== Hasil Pencarian Pendaftar Jenis " + jenisCari + " ===");
        for (int i = 0; i < pendaftar.length; i++) {
            if (pendaftar[i][3].equalsIgnoreCase(jenisCari)) {
                System.out.println("Pendaftar ke-" + (i + 1) + ":");
                System.out.println("Nama: " + pendaftar[i][0]);
                System.out.println("NIM: " + pendaftar[i][1]);
                System.out.println("IPK: " + pendaftar[i][2]);
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tidak ada pendaftar dengan jenis beasiswa " + jenisCari + ".\n");
        }
    }

    static void calculateAverageIPKByJenis(String[][] pendaftar) {
        if (pendaftar.length == 0) {
            System.out.println("Tidak ada data pendaftar.");
            return;
        }

        String[] jenisBeasiswa = { "Regular", "Unggulan", "Riset" };

        for (String jenis : jenisBeasiswa) {
            double totalIPK = 0;
            int count = 0;

            for (int i = 0; i < pendaftar.length; i++) {
                if (pendaftar[i][3].equalsIgnoreCase(jenis)) {
                    totalIPK += Double.parseDouble(pendaftar[i][2]);
                    count++;
                }
            }

            if (count > 0) {
                double averageIPK = totalIPK / count;
                System.out.printf(jenis + ": Rata-rata IPK = %.2f%n", averageIPK);
            } else {
                System.out.printf(jenis + ": Tidak ada pendaftar.%n");
            }
        }
        System.out.println();
    }
}

//