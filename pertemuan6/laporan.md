#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 6 </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="33%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama  : Vincntius Leonanda Prabowo </p>
<p align = "center"> NIM   : 2341720149 </p>
<p align = "center"> Kelas : 1B </p>
<p align = "center"> Prodi : D-IV Teknik Informatika</p>


<br><br><br><br><br>

#
#  Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort
Kode Program Class
```java
package pertemuan6;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa07(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama         = " + nama);
        System.out.println("Tahun Masuk  = " + thnMasuk);
        System.out.println("Umur         = " + umur);
        System.out.println("IPK          = " + ipk);
    }
}
```
Kode Program Class
```java
package pertemuan6;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("-----------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[i].ipk < listMhs[j].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[i];
                    listMhs[i] = listMhs[j];
                    listMhs[j] = tmp;
                }
            }
        }
    }
}
```
Kode Program Main
```java
package pertemuan6;

import java.util.Scanner;

public class MahasiswaMain07 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();
    }
}
```

#  Pertanyaan
1. Terdapat di method apakah proses bubble sort? <br>
Jawab : Proses bubble sort terdapat di dalam method bubbleSort() pada class DaftarMahasiswaBerprestasi07.
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
```java
 if (listMhs[i].ipk < listMhs[j-l].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-l];
                    listMhs[j-l] = tmp;
                }
            }
```
Untuk apakah proses tersebut? <br>
Jawab : Proses tersebut adalah proses pertukaran atau swap data antara dua elemen dalam array listMhs jika syarat listMhs[i].ipk < listMhs[j-l].ipk terpenuhi. Ini merupakan langkah utama dalam algoritma bubble sort untuk mengurutkan elemen-elemen array. <br>
3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
```java
for (int i=0; i<listMhs.length-1; i++) {
            for (int j=i; j<listMhs.length-i; j++) {
```
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? <br>
Perulangan i digunakan untuk mengontrol iterasi terhadap elemen array secara keseluruhan, sedangkan perulangan j digunakan untuk melakukan perulangan dalam satu iterasi i untuk membandingkan elemen-elemen sepanjang array. <br>
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ? <br>
Syarat dari perulangan i yaitu i<listMhs.length-1 digunakan untuk memastikan bahwa iterasi i tidak akan melebihi panjang array listMhs. <br>
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ? <br>
Syarat dari perulangan j yaitu j<listMhs.length-i digunakan untuk membatasi iterasi j untuk hanya berjalan hingga sebelum mencapai panjang array dikurangi nilai i. <br>
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan 
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh? <br>
Jika banyak data di dalam listMhs adalah 50, maka perulangan i akan berlangsung sebanyak 49 kali, karena syaratnya adalah i<listMhs.length-1.Tahap bubble sort yang ditempuh dalam kasus ini adalah 49 tahap, karena proses bubble sort memerlukan iterasi sebanyak n-1 kali untuk mengurutkan data yang berjumlah n. 
#
#  Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort
Kode Program Class
```java
package pertemuan6.kode;

public class DaftarMahasiswaBerprestasi07 {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("-----------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[i].ipk < listMhs[j].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa07 tmp = listMhs[i];
                    listMhs[i] = listMhs[j];
                    listMhs[j] = tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}
```
Kode Program Main
```java
package pertemuan6.kode;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();
    }
}
```

#  Pertanyaan
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
```java
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
```
Untuk apakah proses tersebut, jelaskan! <br>
Proses tersebut adalah proses pencarian indeks dengan nilai ipk terkecil dari sebuah array listMhs dengan melakukan perbandingan pada setiap indeks pada array-nya.
#
# Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
Kode Program Class
```java
package pertemuan6.kode;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("-----------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[i].ipk < listMhs[j].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[i];
                    listMhs[i] = listMhs[j];
                    listMhs[j] = tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = 1;
            while (j >= 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
```
Kode Program Main
```java
package Pertemuan6.Kode;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
```

#  Pertanyaan
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending
```java
package pertemuan6.kode;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("-----------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[i].ipk < listMhs[j].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[i];
                    listMhs[i] = listMhs[j];
                    listMhs[j] = tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = 1;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
```

#  Latihan Praktikum
Sebuah platform travel yang menyediakan layanan pemesanan kebutuhan travelling sedang 
mengembangkan backend untuk sistem pemesanan/reservasi akomodasi (penginapan), salah 
satu fiturnya adalah menampilkan daftar penginapan yang tersedia berdasarkan pilihan filter 
yang diinginkan user. Daftar penginapan ini harus dapat disorting berdasarkan 
1. Harga dimulai dari harga termurah ke harga tertinggi. <br>
2. Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1) 
Buatlah proses sorting data untuk kedua filter tersebut dengan menggunakan algoritma bubble sort dan selection sort. <br>
![alt text](<img/Screenshot Latihan soal.png>) <br>
Kode Program Class
```java
package Pertemuan6.Kode;

public class Hotel {
    public String nama, kota;
    public int harga;
    public Byte bintang;

    public Hotel(String nama, String kota, int harga, Byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.bintang = bintang;
        this.harga = harga;
    }
}
```
Kode Program Class
```java
package pertemuan6.kode;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int idx = 0;

    void tambah(Hotel H) {
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Nama    = " + rooms[i].nama);
            System.out.println("Kota    = " + rooms[i].kota);
            System.out.println("Harga   = " + rooms[i].harga);
            System.out.println("Bintang = " + rooms[i].bintang);
            System.out.println("----------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length; i++) {
            int idMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idMax].bintang) {
                    idMax = j;
                }
            }
            Hotel tmp = rooms[idMax];
            rooms[idMax] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
```
Kode Program Main
```java
package pertemuan6.kode;

public class HotelMain {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Hotel POP Denpasar", "Kota Bali", 280000, (byte) 2);
        Hotel h2 = new Hotel("Hotel Mercure", "Kota Jakarta", 890000, (byte) 4);
        Hotel h3 = new Hotel("Hotel D'Paragon Ijen Nirwana ", "Kota Malang", 180000, (byte) 1);
        Hotel h4 = new Hotel("Hotel Grand Malioboro", "Kota Yogjakarta", 350000, (byte) 3);
        Hotel h5 = new Hotel("Hotel DoubleTree by Hilton ", "Kota Surabaya", 1020000, (byte) 5);
        
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Menampilkan hotel sebelum pengurutan :");
        list.tampilAll();

        System.out.println("Pengurutan harga termurah ke harga tertinggi :");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Pengurutan bintang tertinggi (5) ke terendah (1) :");
        list.selectionSort();
        list.tampilAll();
    }
}
```
