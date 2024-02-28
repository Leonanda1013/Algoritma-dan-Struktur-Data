package pertemuan1;

import java.util.Scanner;

public class Tugas229 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (m): ");
        double s = input.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double t = input.nextDouble();

        double v = s / t;
        System.out.println("Kecepatan adalah: " + v + " m/s");
    }

    public static void hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (m/s): ");
        double v = input.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double t = input.nextDouble();

        double s = v * t;
        System.out.println("Jarak adalah: " + s + " meter");
    }

    public static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (m): ");
        double s = input.nextDouble();
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = input.nextDouble();

        double t = s / v;
        System.out.println("Waktu yang diperlukan adalah: " + t + " detik");
    }
}
