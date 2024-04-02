#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 7 </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="33%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama  : Vincentius Leonanda Prabowo </p>
<p align = "center"> NIM   : 2341720149 </p>
<p align = "center"> Kelas : 1B </p>
<p align = "center"> Prodi : D-IV TEKNIK INFOMATIKA</p>


<br><br><br><br><br>


## Praktikum 1 : Sequensial Search
### Class Buku
```java
package pertemuan7;

public class Buku28 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku28(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stock : " + stock);

    }

}
```

### Class Pencarian Buku
```java
package pertemuan7;

public class PencarianBuku28 {
    Buku28 listBk[] = new Buku28[5];
    int idx;

    void tambah(Buku28 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah Penuh");

        }
    }

    void tampil() {
        for (Buku28 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = 2;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                return j;
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + "ditemukan data pada index " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].pengarang);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
}
```

### Class BukuMain
```java
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
```

### Hasil
![!\[alt text\](image.png)](SS/1.png)
![!\[alt text\](image.png)](SS/2.png)
![!\[alt text\](image.png)](SS/3.png)
![!\[alt text\](image.png)](SS/4.png)


### Pertanyaan
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!<br>
    ==> break adalah sebuah pernyataan dalam bahasa pemrograman Java yang digunakan untuk menghentikan eksekusi dari loop atau switch statement di tengah jalan.<br>

2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?<br>
    ==> Benar.<br>
![!\[alt text\](image.png)](SS/6.png)
![!\[alt text\](image.png)](SS/7.png)
<br>
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe
method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
tersebut pada class BukuMain seperti gambar berikut :<br>
![!\[alt text\](image.png)](SS/5.png)