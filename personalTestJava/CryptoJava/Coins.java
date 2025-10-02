package personalTestJava.CryptoJava;

public class Coins {
    private int id;
    private String name;
    private String symbol;
    private double price;

    public Coins(int id, String name, String symbol, double price){
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.price = price;
    }

    public int getId() {return id;}
    public String getname() {return name;}
    public String getSymbol() {return symbol;}
    public double getprice() {return price;}


    @Override
    public String toString(){
        return id + ". " + name + "(" + symbol + "): Rp" + price;
    }
}