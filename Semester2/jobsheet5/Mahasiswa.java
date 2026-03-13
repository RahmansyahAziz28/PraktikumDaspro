package Semester2.jobsheet5;

public class Mahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int highestUTS(Mahasiswa arr[], int i, int r) {
        if (i == r) {
            return i;
        }
        int mid = (i + r) / 2;
        int left = highestUTS(arr, i, mid);
        int raight = highestUTS(arr, mid + 1, r);
        return (arr[left].nilaiUTS > arr[raight].nilaiUTS) ? left : raight;
    }

    int lowestUTS(Mahasiswa arr[], int i, int r) {
        if (i == r) {
            return i;
        }
        int mid = (i + r) / 2;
        int left = lowestUTS(arr, i, mid);
        int raight = lowestUTS(arr, mid + 1, r);
        return (arr[left].nilaiUTS < arr[raight].nilaiUTS) ? left : raight;
    }

    void averageUAS(Mahasiswa[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        double average = total / arr.length;
        System.out.println("Rata-rata nilai UAS: " + average);
    }
}
