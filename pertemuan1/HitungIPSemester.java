package pertemuan1;

import java.util.Scanner;

public class HitungIPSemester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah mata kuliah yang diambil:");
        int jumlahMatkul = input.nextInt();

        double totalSKS = 0;
        double totalNilai = 0;

        for (int i = 1; i <= jumlahMatkul; i++) {
            System.out.println("Masukkan nilai mata kuliah ke-" + i + ":");
            double nilai = input.nextDouble();
            System.out.println("Masukkan jumlah SKS mata kuliah ke-" + i + ":");
            double sks = input.nextDouble();

            totalNilai += konversiNilai(nilai) * sks;
            totalSKS += sks;
        }

        if (totalSKS == 0) {
            System.out.println("Tidak ada mata kuliah yang diinput.");
        } else {
            double ipSemester = totalNilai / totalSKS;
            System.out.println("IP Semester Anda adalah: " + ipSemester);
        }

        input.close();
    }

    public static double konversiNilai(double nilai) {
        if (nilai >= 85) {
            return 4.0;
        } else if (nilai >= 80) {
            return 3.7;
        } else if (nilai >= 75) {
            return 3.3;
        } else if (nilai >= 70) {
            return 3.0;
        } else if (nilai >= 65) {
            return 2.7;
        } else if (nilai >= 60) {
            return 2.3;
        } else if (nilai >= 55) {
            return 2.0;
        } else if (nilai >= 40) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
