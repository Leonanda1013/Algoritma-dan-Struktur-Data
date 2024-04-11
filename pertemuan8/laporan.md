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


## Praktikum 1 : Penyimpanan Tumpukan Barang dalam Gudang
### Class Barang

```java
package pertemuan8;

public class Barang28 {
    int kode;
    String nama;
    String kategori;

    public Barang28(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }
}
```

### Class Gudang
```java
package pertemuan8;

public class Gudang28 {
    Barang28[] tumpukan;
    int size;
    int top;

    public Gudang28(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang28[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;

        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang28 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gaga! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang28 ambilBarang() {
        if (!cekKosong()) {
            Barang28 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            return delete;
        } else {
            System.out.println("Tumpukkan barang kosong.");
            return null;
        }

    }

    public Barang28 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang28 barangTeratas = tumpukan[top];
            System.out.println("Baang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barnag di Gudang: ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("KOde %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
}
```

### Class Main
```java
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
```

### Hasil
<video controls src="SS/20240403-0542-50.1778589.mp4" title="Title"></video>


### Pertanyaan: 
#### 1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki?
   Jawab : Pada method tampilkanBarang pada bagian
```java
            for (int i = top; i >= 0; i--) 
```

#### 2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya!
   Jawab : Data yang dapat disimpan dalam tumpukan adalah sebanyak 7
```java
        Gudang28 gudang = new Gudang28(7);
```

#### 3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya?
   Jawab : Pengecekan !cekKosong() digunakan untuk memastikan bahwa tumpukan barang tidak kosong sebelum menampilkan rinciannya. Jika kondisi tersebut dihapus, maka program akan mencoba menampilkan rincian barang tanpa memeriksa apakah tumpukan kosong terlebih dahulu. Hal ini dapat mengakibatkan error saat mencoba mengakses tumpukan barang yang kosong.

#### 4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang!
   Jawab : 
```java
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
```
```java
        System.out.println("Masukkan kapasitas Gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang28 gudang = new Gudang28(kapasitas);
```


## Percobaan 2
```java
package pertemuan8;

public class Gudang28 {
    Barang28[] tumpukan;
    int size, top;

    public Gudang28(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang28[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang28 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang28 ambilBarang() {
        if (!cekKosong()) {
            Barang28 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang28 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang28 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang:");
            //for (int i = top; i >= 0; i--) {
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %s: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi28 stack = new StackKonversi28();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }   
}
```

### Class StackKonversi
```java
package pertemuan8;

public class StackKonversi28 {
    
        int size;
        int[] tumpukanBiner;
        int top;
    
        public StackKonversi28() {
            this.size = 32;
            tumpukanBiner = new int[size];
            top = -1;
        }
    
        public boolean isEmpty() {
            return top == -1;
        }
    
        public boolean isFull() {
            return top == size - 1;
        }
    
        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack penuh");
            } else {
                top++;
                tumpukanBiner[top] = data;
            }
        }   
    
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack kosong");
                return -1;
            } else {
                int data = tumpukanBiner[top];
                top--;
                return data;
            }
        }
    }

```

### Hasil
![!\[alt text\](image.png)](SS/2.png)

### PErtanyaan
#### 1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!
   Jawab : Hasilnya akan tetap sama. Perulangan akan terus berjalan selama nilai kode lebih besar dari 0 dalam kedua kasus tersebut.
#### 2. Jelaskan alur kerja dari method konversiDesimalKeBiner!
   Jawab : Objek StackKonversi25 dibuat untuk menyimpan sisa pembagian bilangan desimal dengan 2. kemudian Selama nilai kode lebih besar dari 0, akan dilakukan perulangan, Sisa pembagian kode dengan 2 dihitung dan disimpan dalam variabel sisa. Nilai sisa dimasukkan ke dalam stack menggunakan metode push. Nilai kode dibagi dengan 2 untuk mengurangi nilainya. Setelah selesai perulangan, dilakukan inisialisasi string biner. Selama stack tidak kosong, akan dilakukan perulangan, Nilai dari stack diambil menggunakan metode pop dan ditambahkan ke dalam string biner. Nilai biner yang telah terbentuk dari perulangan sebelumnya dikembalikan sebagai output dari metode.

## Percobaan 3
### Kode
