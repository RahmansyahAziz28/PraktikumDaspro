package personalTestJava.CryptoJava;

import javax.swing.*;
import java.util.List;
import java.util.ArrayList;



class Database {
    private static Database instance;
    private List<Coins> BoughtCoins = new ArrayList<Coins>();

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void BuyCoins(Coins id) {
        BoughtCoins.add(id);
    }

    public String showCoinsTransacton() {
        StringBuilder sb = new StringBuilder();
        if (BoughtCoins.isEmpty()) {
            sb.append("Belum ada transaksi.");
        } else {
            for (Coins coin : BoughtCoins) {
                sb.append(coin.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}

public class cryptoMarket {
    public static void main(String[] args) {
        ArrayList<Coins> listCoins = new ArrayList<Coins>();
        boolean running = true;

        listCoins.add(new Coins(1, "Bitcoin", "BTC", 50000.00));
        listCoins.add(new Coins(2, "Ethereum", "ETH", 30000.00));
        listCoins.add(new Coins(3, "Litecoin", "LTC", 20000.00));
        listCoins.add(new Coins(4, "Dogecoin", "DOGE", 15000.00));
        listCoins.add(new Coins(5, "Cardano", "ADA", 10000.00));

        String username = JOptionPane.showInputDialog("Masukkan username:");
        int saldo = Integer.parseInt(JOptionPane.showInputDialog("Masukkan saldo:"));
        StringBuilder sb = new StringBuilder("Halo, " + username + "\nDaftar Coins:\n");
        for (Coins coin : listCoins) {
            sb.append(coin.toString()).append("\n");
        }

        while (running) {
            String menu = JOptionPane.showInputDialog(
                    "=== CRYPTO MARKET ===\n" +
                            "1. Beli Coins\n" +
                            "2. Jual Coin\n" +
                            "3. Lihat Portofolio\n" +
                            "4. Keluar\n" +
                            "Pilih menu:");

            if (menu == null)
                break;

            switch (menu) {
                case "1":
                    int option = Integer.parseInt(JOptionPane.showInputDialog(
                        sb.toString() + "\nPilih coin:"
                        ));
                    
                    break;

                default:
                    break;
            }
        }

    }
}
