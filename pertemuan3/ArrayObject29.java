package pertemuan3;

import java.util.Scanner;

import pertemuan3.ArrayBalok.Balok;

public class ArrayObject29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----percobaan 3-----");
        Balok[] blArray = new Balok[3];
        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }

        System.out.println();
        System.out.println("------Percobaan 2-------");
        System.out.print("Masukkan panjang array: ");
        int length = sc.nextInt();

        PersegiPanjang29[] ppArray = new PersegiPanjang29[length]; // Deklarasi array dengan panjang inputan

        // Inisialisasi array object
        for (int i = 0; i < length; i++) {
            ppArray[i] = new PersegiPanjang29();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        // Tampilkan informasi persegi panjang
        for (int i = 0; i < length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

        System.out.println("Ini percobaan 1 :");
        ppArray[0] = new PersegiPanjang29();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang29();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang29();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);

        sc.close();
    }
}
