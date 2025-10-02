package jobsheet1;
public class jobsheet1 {
    public static void main(String[] args) {
     String nama[] = { "Aziz", "bagas", "arkan", "rendy", "helmi", "faqih", "naila", "zigma", "isya", "aisya"};
     String nim[] = {"254107060091", "254107060059", "254107060013", "254107060047", "254107060023", "254107060067", "254107060046", "254107060057", "254107060116", "254107060089"};
     String Prodi = "Sistem Informasi Bisnis";

     System.out.println("NIM\t\tNama\tProdi");
     for (int i = 0; i < nama.length; i++) {
        System.out.println(nim[i] +"\t" + nama[i] + "\t" + Prodi);
     }
    }
}