package pertemuan5;

import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("----------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        faktorial[] fk = new faktorial[iJml];
        for (int i = 0; i < fk.length; i++) {
            fk[i] = new faktorial();
            System.out.println("masukkan nilai data ke-" + (i + 1) + " :");
            fk[i].nilai = sc.nextInt();

        }
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < fk.length; i++) {
            System.out.println(
                    "Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < fk.length; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah: "
                    + fk[i].faktorialDC(fk[i].nilai));
        }
        sc.close();
    }

}
