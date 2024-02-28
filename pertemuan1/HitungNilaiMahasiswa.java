package pertemuan1;

import java.util.Scanner;

public class HitungNilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai tugas (0-100): ");
        int nilaiTugas = input.nextInt();
        if (!isValid(nilaiTugas)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.println("Masukkan nilai kuis (0-100): ");
        int nilaiKuis = input.nextInt();
        if (!isValid(nilaiKuis)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.println("Masukkan nilai UTS (0-100): ");
        int nilaiUTS = input.nextInt();
        if (!isValid(nilaiUTS)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.println("Masukkan nilai UAS (0-100): ");
        int nilaiUAS = input.nextInt();
        if (!isValid(nilaiUAS)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        double nilaiAkhir = hitungNilaiAkhir(nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS);
        String nilaiHuruf = konversiNilaiHuruf(nilaiAkhir);
        String keterangan = (nilaiHuruf.equals("TIDAK LULUS") || nilaiHuruf.equals("D") || nilaiHuruf.equals("E"))
                ? "TIDAK LULUS"
                : "LULUS";

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);

    }

    public static boolean isValid(int nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    public static double hitungNilaiAkhir(int tugas, int kuis, int uts, int uas) {
        return 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;
    }

    public static String konversiNilaiHuruf(double nilai) {
        if (nilai > 100 || nilai < 0) {
            return "Nilai tidak valid";
        } else if (nilai > 80) {
            return "A";
        } else if (nilai > 73) {
            return "B+";
        } else if (nilai > 65) {
            return "B";
        } else if (nilai > 60) {
            return "C+";
        } else if (nilai > 50) {
            return "C";
        } else if (nilai > 39) {
            return "D";
        } else {
            return "E";
        }

    }

}
