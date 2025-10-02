package personalTestJava;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

abstract class Buku {
    protected String judul;
    protected String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public abstract String getInfo();
}

class Novel extends Buku {
    public Novel(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public String getInfo() {
        return "[Novel] " + judul + " - " + penulis;
    }
}

class Komik extends Buku {
    public Komik(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public String getInfo() {
        return "[Komik] " + judul + " - " + penulis;
    }
}

class BukuFactory {
    public static Buku createBuku(String tipe, String judul, String penulis) {
        if (tipe.equalsIgnoreCase("novel")) {
            return new Novel(judul, penulis);
        } else if (tipe.equalsIgnoreCase("komik")) {
            return new Komik(judul, penulis);
        }
        return null;
    }
}

class Database {
    private static Database instance;
    private List<Buku> koleksiBuku = new ArrayList<>();
    private String username;

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void addUsername(String username) {
        this.username = username;
    }

    public void tambahBuku(Buku b) {
        koleksiBuku.add(b);
    }

    public String tampilkanSemua() {
        if (koleksiBuku.isEmpty())
            return "Belum ada buku.";
        StringBuilder sb = new StringBuilder(
            "Halo, " + username + "\nDaftar Buku:\n"
            );
        for (Buku b : koleksiBuku) {
            sb.append("- ").append(b.getInfo()).append("\n");
        }
        return sb.toString();
    }
}

public class PerpustakaanApp {
    public static void main(String[] args) {
        Database db = Database.getInstance();

        String username = JOptionPane.showInputDialog("Masukkan username:");
        db.addUsername(username);
        boolean jalan = true;

        while (jalan) {
            String menu = JOptionPane.showInputDialog(
                    "=== SISTEM PERPUSTAKAAN ===\n" +
                            "1. Tambah Buku\n" +
                            "2. Lihat Semua Buku\n" +
                            "3. Keluar\n" +
                            "Pilih menu:");

            if (menu == null)
                break;

            switch (menu) {
                case "1":
                    String tipe = JOptionPane.showInputDialog("Masukkan tipe buku (Novel/Komik):");
                    String judul = JOptionPane.showInputDialog("Masukkan judul buku:");
                    String penulis = JOptionPane.showInputDialog("Masukkan penulis buku:");

                    Buku b = BukuFactory.createBuku(tipe, judul, penulis);
                    if (b != null) {
                        db.tambahBuku(b);
                        JOptionPane.showMessageDialog(null, "Buku berhasil ditambahkan!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipe buku tidak valid!");
                    }
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, db.tampilkanSemua());
                    break;

                case "3":
                    jalan = false;
                    JOptionPane.showMessageDialog(null, "Terima kasih!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Menu tidak valid!");
            }
        }
    }
}
