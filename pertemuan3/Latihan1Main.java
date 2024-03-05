
package pertemuan3;

import java.util.Scanner;

public class Latihan1Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array of objects untuk menyimpan bangun ruang
        Object[] bangunRuangArray = new Object[3];

        // Input atribut-atribut untuk tiap jenis bangun ruang
        for (int i = 0; i < bangunRuangArray.length; i++) {
            System.out.println("Masukkan atribut untuk bangun ruang ke-" + (i + 1));
            if (i == 0) { // Kerucut
                System.out.print("Masukkan jari-jari kerucut: ");
                double jariJari = scanner.nextDouble();
                System.out.print("Masukkan sisi miring kerucut: ");
                double sisiMiring = scanner.nextDouble();
                bangunRuangArray[i] = new Kerucut(jariJari, sisiMiring);
            } else if (i == 1) { // Limas Segi Empat
                System.out.print("Masukkan panjang sisi alas limas segi empat: ");
                double sisiAlas = scanner.nextDouble();
                System.out.print("Masukkan tinggi limas segi empat: ");
                double tinggi = scanner.nextDouble();
                bangunRuangArray[i] = new LimasSegiEmpat(sisiAlas, tinggi);
            } else if (i == 2) { // Bola
                System.out.print("Masukkan jari-jari bola: ");
                double jariJari = scanner.nextDouble();
                bangunRuangArray[i] = new Bola(jariJari);
            }
        }

        // Menampilkan luas permukaan dan volume tiap jenis bangun ruang
        for (int i = 0; i < bangunRuangArray.length; i++) {
            if (i == 0) { // Kerucut
                Kerucut kerucut = (Kerucut) bangunRuangArray[i];
                System.out.println("\nBangun ruang ke-" + (i + 1) + ": Kerucut");
                System.out.println("Luas Permukaan: " + kerucut.hitungLuasPermukaan());
                System.out.println("Volume: " + kerucut.hitungVolume());
            } else if (i == 1) { // Limas Segi Empat
                LimasSegiEmpat limas = (LimasSegiEmpat) bangunRuangArray[i];
                System.out.println("\nBangun ruang ke-" + (i + 1) + ": Limas Segi Empat Sama Sisi");
                System.out.println("Luas Permukaan: " + limas.hitungLuasPermukaan());
                System.out.println("Volume: " + limas.hitungVolume());
            } else if (i == 2) { // Bola
                Bola bola = (Bola) bangunRuangArray[i];
                System.out.println("\nBangun ruang ke-" + (i + 1) + ": Bola");
                System.out.println("Luas Permukaan: " + bola.hitungLuasPermukaan());
                System.out.println("Volume: " + bola.hitungVolume());
            }
        }

        scanner.close();
    }
}