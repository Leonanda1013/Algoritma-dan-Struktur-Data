package pertemuan7;

import java.util.Scanner;

public class BukuMain28 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku28 data = new PencarianBuku28();
        int jumBuku = 5;

        System.out.println("------------------------------");
        System.out.println("Masukkan data Buku secara urut dari kode buku terkecil : ");

        for (int i = 0; i < jumBuku; i++) {
            System.out.println("----------------------");
            System.out.println("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.println("Judul buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.println("Tahun Terbit : ");
            int tahunTerbit = s.nextInt();
            System.out.println(" Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.println(" Stock \t : ");
            int stock = s.nextInt();

            Buku28 m = new Buku28(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);

        }

        System.out.println("--------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku ynag Dicari : ");
        System.out.println("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);

        data.TampilData(cari, posisi);
    }
}
