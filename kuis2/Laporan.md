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

    Pada kuis ini saya membuat sebuah algoritma linklist dengan studycase F1. 
    
    Peraturan f1 :
    Poin diberikan kepada pembalap yang finis di posisi 10 besar dalam setiap balapan. Berikut adalah distribusi poin untuk posisi finis dalam balapan F1:

    Posisi 1: 25 poin
    Posisi 2: 18 poin   
    Posisi 3: 15 poin
    Posisi 4: 12 poin
    Posisi 5: 10 poin
    Posisi 6: 8 poin
    Posisi 7: 6 poin
    Posisi 8: 4 poin
    Posisi 9: 2 poin
    Posisi 10: 1 poin

    Penjelasan class :

    Class Driver:
    Kelas Driver merepresentasikan seorang pembalap dengan atribut nama dan poin total yang telah diperoleh selama musim balap.
    -Atribut name: Menyimpan nama pembalap.
    -Atribut points: Menyimpan total poin yang telah diperoleh pembalap.
    -Konstruktor Driver(String name): Menginisialisasi nama pembalap dan menetapkan poin awal menjadi 0.
    -Metode addPoints(int points): Menambahkan poin ke total poin pembalap.
    -Metode toString(): Mengembalikan representasi string dari pembalap, menampilkan nama dan total poin.

    Class RaceResult
    Kelas RaceResult merepresentasikan hasil balapan dari seorang pembalap dengan atribut id pembalap dan posisi finisnya.
    Atribut driverId: Menyimpan ID pembalap.
    Atribut position: Menyimpan posisi finis pembalap dalam balapan.
    Konstruktor RaceResult(int driverId, int position): Menginisialisasi id pembalap dan posisi finisnya.

    Class Node
    Kelas Node digunakan sebagai elemen dalam linked list yang menyimpan objek RaceResult dan referensi ke node berikutnya.
    Atribut result: Menyimpan objek RaceResult.
    Atribut next: Menyimpan referensi ke node berikutnya dalam linked list.
    Konstruktor Node(RaceResult result): Menginisialisasi objek RaceResult dan menetapkan referensi next menjadi null.

    Class RaceResultList
    Kelas RaceResultList mengelola linked list dari hasil balapan, mengandung metode untuk menambahkan hasil balapan dan menghitung poin berdasarkan posisi finis.
    Atribut head: Menyimpan referensi ke node pertama dalam linked list.
    Konstruktor RaceResultList(): Menginisialisasi linked list dengan node pertama (head) sebagai null.
    Metode addResult(RaceResult result): Menambahkan hasil balapan baru ke akhir linked list.
    Membuat node baru dengan hasil balapan yang diberikan.
    Menambahkan node baru ke akhir linked list.
    Metode calculatePoints(Driver[] drivers): Menghitung dan menambahkan poin untuk setiap pembalap berdasarkan posisi finis dalam balapan.
    Melakukan iterasi melalui linked list dan menambahkan poin ke pembalap yang sesuai berdasarkan posisi finis.
    Metode getPoints(int position): Mengembalikan jumlah poin berdasarkan posisi finis pembalap.
    Menggunakan switch-case untuk menentukan poin berdasarkan posisi finis (1 hingga 10).