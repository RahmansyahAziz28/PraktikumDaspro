package jobsheet5;

import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("---Cetak KRS---");
       System.out.print("Apakah ukt sudah lunas? (true/false): ");
       boolean lunas = sc.nextBoolean();
       System.out.println(lunas ? "Pembayaran UKT sudah terverifikasi" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
    //    if (lunas){
    //     System.out.println("Pembayaran UKT sudah terverifikasi");
    //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    //    } else {
    //     System.out.println("“Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
    //    }
    }
}
