package pertemuan8;

import java.util.Scanner;

public class Utama28 {
    public static void main(String[] args) {
        Gudang28 gudang = new Gudang28(7);
        Scanner sc28 = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih oprasi");
            int pilihan = sc28.nextInt();
            sc28.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc28.nextInt();
                    sc28.nextLine();
                    System.out.println("Masukkan nama Barang: ");
                    String nama = sc28.nextLine();
                    System.out.println("Masukkan nama kategori: ");
                    String kategori = sc28.nextLine();
                    Barang28 barangBaru = new Barang28(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();

                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                    break;
            }
        }
    }
}
