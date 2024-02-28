# JOBSHEET III : ARRAY OF OBJEK


![!\[alt text\](image.png)](SS/image.png)

Nama    : Vincentius L.P<br>
Nim     : 2341720149<br>
Kelas   : TI-1B<br>
Absen   : 29<br>

## 3. Praktikum
### 3.2 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan
#### Kode Program
Class Persegi panjang
```java
public class PersegiPanjang29 { // buat class Persegi panjang
    // deklarasi atribut
    public int panjang;
    public int lebar;

}
```
<br>
Class ArrayObject

```java
ppublic class ArrayObject29 {
    public static void main(String[] args) {
        PersegiPanjang29[] ppArray = new PersegiPanjang29[3]; //instansiasi dan deklarasi rray
        // inisialisasi array object
        ppArray[0] = new PersegiPanjang29();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang29();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang29();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    }
}

```
#### 3.2.2 Verifikasi Hasil Percobaan
![!\[alt text\](image.png)](<SS/validasipercobaan 1.png>)


#### Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method?Jelaskan!<br>
    <b>JWB: </b>Uji coba tersebut menunjukkan bahwa class yang akan digunakan sebagai array of objects tidak selalu harus memiliki method, asalkan memenuhi kebutuhan representasi data yang diinginkan.
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut :<br>
![!\[alt text\](image.png)](<SS/pertanyaan 1.png>)<br>
    <B>JWB:</B> Tidak, class PersegiPanjang tidak secara eksplisit mendefinisikan sebuah konstruktor. <br>
    Baris tersebut sebenarnya memanggil konstruktor bawaan (default constructor) dari class PersegiPanjang29. Meskipun class PersegiPanjang29 tidak mendefinisikan konstruktor secara eksplisit, Java akan menyediakan sebuah konstruktor bawaan yang akan dipanggil ketika objek baru dibuat tanpa parameter.<br>

3. Apa yang dimaksud dengan kode berikut ini:<br>
![!\[alt text\](image.png)](<SS/pertanyaan 3.png>)<br>
    <b>JWB</b>: <br>
    > PersegiPanjang29[] ppArray: Ini adalah deklarasi array dari objek PersegiPanjang29. Ini menunjukkan bahwa kita membuat sebuah array yang dapat menyimpan objek-objek dari class PersegiPanjang29. Tanda [] menandakan bahwa kita membuat sebuah array. Nama array-nya adalah ppArray.

    > new PersegiPanjang29[3]: Ini adalah inisialisasi array tersebut. Kita menggunakan operator new untuk membuat array baru. PersegiPanjang29[3] menunjukkan bahwa kita membuat sebuah array yang dapat menyimpan objek PersegiPanjang29, dengan panjang (jumlah elemen) 3. Dengan kata lain, kita membuat array ppArray yang memiliki kapasitas untuk menyimpan 3 objek PersegiPanjang29.

    > Jadi, secara keseluruhan, potongan kode PersegiPanjang29[] ppArray = new PersegiPanjang29[3] digunakan untuk mendeklarasikan dan menginisialisasi array yang dapat menyimpan objek PersegiPanjang29 dengan panjang 3. 
<br>

4. Apa yang dimaksud dengan kode berikut ini:<br>
![!\[alt text\](image.png)](<SS/pertaanyaan 4.png>)
<br>
    <B>JWB</B>: 
    <br>
    ppArray[1] = new PersegiPanjang29();: Baris ini membuat sebuah objek baru dari class PersegiPanjang29 menggunakan operator new, dan objek tersebut disimpan di indeks ke-2 dari array ppArray. Dengan kata lain, objek yang baru dibuat ini akan ditempatkan di posisi ketiga dalam array.

    ppArray[1].panjang = 80;: Setelah objek PersegiPanjang29 dibuat dan disimpan di indeks ke-2 dari array ppArray, baris ini mengatur nilai atribut panjang dari objek tersebut menjadi 80.

    ppArray[1].lebar = 40;: Baris ini mengatur nilai atribut lebar dari objek yang sama menjadi 40.

    Jadi, secara keseluruhan, potongan kode ini menciptakan sebuah objek PersegiPanjang29 baru, kemudian mengatur nilai atribut panjang dan lebar dari objek tersebut, dan menyimpan objek tersebut di indeks ke-2 dari array ppArray.
    
<br>

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?<br>
    <b>JWB</b>: <br>
    <b>Kesederhanaan dan Keterbacaan Kode</b>: Dengan memisahkan kelas utama (main) dari kelas objek (PersegiPanjang), kode menjadi lebih terstruktur dan mudah dibaca. Setiap kelas memiliki tanggung jawab yang terpisah, sehingga mudah untuk memahami fungsionalitas dan interaksi antar kelas.

    <b>Pemisahan Logika Aplikasi</b>: Memisahkan main dari definisi kelas objek memungkinkan untuk memisahkan logika aplikasi dari representasi objeknya. Ini memungkinkan untuk memodifikasi atau mengganti logika aplikasi tanpa harus menyentuh atau mengubah struktur atau perilaku dari kelas objek.    



### Percobaan 2: Menerima Input Isian Array Menggunakan Looping
#### 3.3.1 Kode Program

```java
import java.util.Scanner; // tambahan pada percobaan 2

public class ArrayObject29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang29[] ppArray = new PersegiPanjang29[3]; // instansiasi dan deklarasi rray
        // inisialisasi array object
        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang29();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
```

#### 3.3.2 Verifikasi Hasil Percobaan
![!\[alt text\](image.png)](<SS/validasi 2.png>)

#### 3.3.3 Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?<br>
    <b>JWB</b>: Ya, array of object dapat diimplementasikan dalam array dua dimensi. Dalam kasus ini, setiap elemen dari array dua dimensi adalah sebuah array yang mengandung objek-objek dari tipe yang sama.<br>

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
    <b>JWB</b>: 
    
    ```java
    public class Soal {
    public static void main(String[] args) {
        PersegiPanjang29[][] array2D = new PersegiPanjang29[3][3];

        // Inisialisasi array of object
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2D[i][j] = new PersegiPanjang29();
                array2D[i][j].panjang = (i + 3) * 10; // Contoh nilai panjang
                array2D[i][j].lebar = (j + 2) * 5; // Contoh nilai lebar
            }
        }

        // Akses objek dalam array of object
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Persegi Panjang[" + i + "][" + j + "]: Panjang = " + array2D[i][j].panjang
                        + ", Lebar = " + array2D[i][j].lebar);
            }
        }
    }
    }
    ```

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode
dibawah ini akan memunculkan error saat dijalankan. Mengapa?<br>
![!\[alt text\](image.png)](<SS/pertanyaan 2.3.png>)<br>
    <b>JWB</b>: kurangnya bagian inisialisaasi array

    ```java
    pgArray[] = new Persegi();
    ```

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
```java
import java.util.Scanner;

public class ArrayObject29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int length = sc.nextInt();

        PersegiPanjang29[] ppArray = new PersegiPanjang29[length]; // Deklarasi array dengan panjang inputan

        // Inisialisasi array object
        for (int i = 0; i < length; i++) {
            ppArray[i] = new PersegiPanjang29();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        // Tampilkan informasi persegi panjang
        for (int i = 0; i < length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

        sc.close();
    }
}
```

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !<br>
    <b>JWB</b>: Tidak, tidak diperbolehkan melakukan duplikasi instansiasi pada elemen array of objek. Setiap elemen array harus diinstansiasi hanya sekali, dan tidak boleh diinstansiasi lebih dari satu kali. Ini karena setiap kali Anda menggunakan operator new untuk membuat objek baru, itu akan menimbulkan alokasi memori baru.<br>


### 3.4 Percobaan 3: Penambahan Operasi Matematika di Dalam Method
#### 3.4.1 Kode Program

```java
package pertemuan3.ArrayBalok;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;

    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

}
```

```java
System.out.println("-----percobaan 3-----");
        Balok[] blArray = new Balok[3];
        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
```

#### 3.4.2 Verifikasi Hasil Percobaan
![!\[alt text\](image.png)](<SS/percobaan 3.png>)

#### 3.4.3 Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!<br>
    <b>JWB</b>: Ya, dalam sebuah kelas, Anda dapat memiliki lebih dari satu konstruktor. Ini dikenal sebagai konstruktor berlebihan (overloaded constructors). Konstruktor yang berlebihan memungkinkan Anda untuk membuat objek dengan cara yang berbeda, misalnya dengan jumlah dan tipe argumen yang berbeda.

2. Jika diketahui terdapat class Segitiga seperti berikut ini:<br>
![!\[alt text\](image.png)](<SS/pertanyaan 3.2.png>)<br>
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.<br>

```java


