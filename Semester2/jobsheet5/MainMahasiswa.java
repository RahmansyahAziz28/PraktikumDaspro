package Semester2.jobsheet5;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswaArray = new Mahasiswa[5];
        mahasiswaArray[0] = new Mahasiswa("Alice", "12345", 2020, 80, 90);
        mahasiswaArray[1] = new Mahasiswa("Bob", "67890", 2019, 75, 85);
        mahasiswaArray[2] = new Mahasiswa("Isaac", "54321", 2021, 90, 95);
        mahasiswaArray[3] = new Mahasiswa("David Laid", "98765", 2020, 70, 80);
        mahasiswaArray[4] = new Mahasiswa("Yve", "11223", 2019, 85, 88);

        int n = mahasiswaArray.length;
        int indexMax = mahasiswaArray[0].highestUTS(mahasiswaArray, 0, n - 1);
        int indexMin = mahasiswaArray[0].lowestUTS(mahasiswaArray, 0, n - 1);
        System.out.println("Mahasiswa dengan nilai UTS tertinggi: " + mahasiswaArray[indexMax].nama + " dengan nilai " + mahasiswaArray[indexMax].nilaiUTS);
        System.out.println("Mahasiswa dengan nilai UTS terendah: " + mahasiswaArray[indexMin].nama + " dengan nilai " + mahasiswaArray[indexMin].nilaiUTS);

        mahasiswaArray[0].averageUAS(mahasiswaArray);
    }
}
