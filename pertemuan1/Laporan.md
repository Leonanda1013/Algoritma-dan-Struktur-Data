# JOBSHEET II

![ini gambar polinema](Screenshot/download.jpg);

Nama    : Vincentius L.P<br>
Nim     : 2341720149<br>
Kelas   : TI-1B<br>
Absen   : 29<br>

## 2. Praktikum
### 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method

Mengimplementasikan Class Diagram berikut pada sourch code java.

![alt text](Screenshot/image.png)

#### 2.1.1 Langkah-langkah Percobaan

![alt text](Screenshot/ss1.png)

#### 2.1.2 Verifikasi Hasil Percobaan

![alt text](<Screenshot/Screenshot 2024-02-21 113420.png>)

Eror tersebut dikarenakan tidak adanya fungsi main pada file java tersebut.

#### 2.1.3 Pertanyaan

1. Sebutkan dua karakteristik class atau object!<br>
    *<b>Jwb</b>: mempunyai sesuatu & melakukan sesuatu<br>
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya!<br>
    *<b>Jwb</b>: judul, pengarang, halaman, stock, harga<br>

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!<br>
    *<b>Jwb</b>: menampilkan informasi, menghitung penjualan, menghitung restok, menghitung ganti harga<br>
4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!<br>
    *<b>Jwb</b>: <br>
    Perubahan kode program<br>
    ![!\[alt text\](image.png)](Screenshot/no4.png)<br>
    Perubahan pada output(termasuk output percobaan 2)<br>
    ![!\[alt text\](image.png)](Screenshot/2.png)<br>

5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?<br>
    *<b>Jwb</b>: Method restock() memiliki satu parameter berupa bilangan integer karena parameter tersebut mengindikasikan jumlah tambahan stok yang akan ditambahkan ke dalam persediaan buku. Dengan memberikan parameter berupa bilangan integer, pengguna dapat secara fleksibel menentukan seberapa banyak stok yang ingin ditambahkan saat melakukan restok.<br>

### 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method

Melakukan proses instansiasi.<br>

#### 2.2.1 Langkah-langkah Percobaan

<b>_Kode Program_</b>


public class BukuMain29 {
    public static void main(String[] args) {
        Buku29 bk1 = new Buku29();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stock = 0;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

    }
}


#### 2.2.2 Verifikasi Hasil Percobaan