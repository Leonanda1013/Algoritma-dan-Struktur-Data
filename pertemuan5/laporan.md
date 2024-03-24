# JOBSHEET IV : BRUTE FORCE DAN DIVIDE CONQUER


![!\[alt text\](image.png)](SS/image.png)

Nama    : Vincentius L.P<br>
Nim     : 2341720149<br>
Kelas   : TI-1B<br>
Absen   : 29<br>

## Percobaan 1 : Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and COnquer

### Kode Program

```java
package pertemuan5;

public class faktorial {
    public int nilai;

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;

        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
```

### Kode Program Main

```java
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
```

### Hasil Program:
![!\[alt text\](image-1.png)](SS/1.png)

### Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!<br>

Jawab : Pada algoritma Divide Conquer terdapat fungsi rekursif yang mengembalikan dirinya sendiri. Pada bagian if merupakan base case dari fungsi rekursif jika parameter bernilai 1. Pada bagian else dilakukan rekursif yang memanggil dirinya sendiri dengan parameter awal dikurangi 1<br>

2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan!<br>

Jawab : Perulangan dapat digantikan dengan menggunakan perulangan while<br>
```java
int fakto = 1;
int i = 1;
while (i<=n>){
    fakto = fakto * i;
    i++;
}
return fakto;
```
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

Jawab : Pada fakto *= i dilakukan operasi assignment dalam iterasi namun pada fakto = n * faktorialDC(n-1) dilakukan proses rekursif


## Percobaan 2 : Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer


### Kode Program :
```java
package pertemuan5;

public class Pangkat {

    public int nilai, pangkat;

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;

        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);

            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}
```

### KOde Program Main

```java
package pertemuan5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai: ");
            png[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));

        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        sc.close();
    }

}
```

### Hasil Program:
![!\[!\\[alt text\\](image.png)\](SS/2.png)](SS/2.png)


### Pertanyaan:
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!<br>

Jawab : Pada method PangkatBF terjadi penghitungan pangkat yang menggunakan algoritma Brute Force dengan menerapkan perhitungan per indeks pada perulangan. Sedangkan pada method PangkatDC menggunakan algoritma Devide Conquer yang membagi tiap bagian pangkat kemudian di hitung per bagian dan pada akhirnya di combine<br>

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!<br>

Jawab : Terdapat dalam method PangkatDC di bagian rekursif berikut :
```java
if (n % 2 == 1) {
     return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a); 
} else { return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));}
```
<br>
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.<br>

```java
public int nilai, pangkat;
Pangkat(int a, int n){
    nilai = a;
    pangkat = n;
}```
```java
Pangkat[] png = new Pangkat[elemen];
for(int i = 0; i<elemen; i++>){
    System.out.println("Masukkan Nilai yang hendak dipangkatkan : ");
    int nilai = sc.nextInt();
    System.out.println("Masukkan nilai pemangkat : ");
    int pangkat = sc.nextInt();
    png[i] = new Pangkat(nilai, pangkat);
}
```

4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan switch-case!

```java
switch (menu) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUITE FORCE");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Menu Invalid!");
                break;
                
                
              
```



## Percobaan 3 : Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

### Kode Program
```java
package pertemuan5;

public class Sum {
    int elemen;
    double keuntungan[], total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}
```

### Kode Program main

```java
package pertemuan5;

import java.util.Scanner;

public class Mainsum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("===============================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.println("MAsukkan untung bulan ke- " + (i + 1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();

            System.out.println("=============================");
            System.out.println("Algoritma Brute Force");
            System.out.println(
                    "Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
            System.out.println("=========================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "
                    + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        }
        sc.close();
    }
}
```

### Hasil
![!\[alt text\](image.png)](SS/3.png)


### Pertanyaan
1. Mengapa terdapat formulasi return value berikut?Jelaskan!<br>

Jawab : Untuk mencombine hasil penjumlahan sisi kiri (lsum), sisi kanan (rsum) dan bagian tengah (arr[mid])<br>

2. Kenapa dibutuhkan variable mid pada method TotalDC()?<br>

Jawab : untuk membagi array menjadi dua bagian sama panjang
<br>
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!<br>

```java
package pertemuan5;

import java.util.Scanner;

public class Sumpertanyaan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================================================");
        System.out.println("Masukkan jumlah Perusahaan : ");
        int jml = sc.nextInt();
        Sum[] smList = new Sum[jml];

        for (int i = 0; i < smList.length; i++) {
            System.out.println("========================================================================");
            System.out.println("Masukkan jumlah bulan perusahaan ke " + (i + 1) + " : ");
            int elm = sc.nextInt();
            smList[i] = new Sum(elm);
            System.out.println("========================================================================");
            for (int j = 0; j < smList[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke - " + (j + 1) + " = ");
                smList[i].keuntungan[j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < smList.length; i++) {
            System.out.println("========================================================================");
            System.out.println("Algoritma Brute Perusahaan ke " + (i + 1));
            System.out.println(
                    "Total keuntungan perusahaan ke - " + (i + 1) + " selama " + smList[i].elemen + " bulan adalah = "
                            + smList[i].totalBF(smList[i].keuntungan));
            System.out.println("========================================================================");
            System.out.println("Divide Conquer Perusahaan ke " + (i + 1));
            System.out.println(
                    "Total keuntungan perusahaan ke - " + (i + 1) + " selama " + smList[i].elemen + " bulan adalah = "
                            + smList[i].totalDC(smList[i].keuntungan, 0, smList[i].elemen - 1));
        }
        sc.close();
    }

}

```

![!\[alt text\](image.png)](SS/4.png)


## Latihan 1
```java
package pertemuan5;

public class Latihan1main {
    public static void main(String[] args) {
        double top_acceleration[] = { 6816, 3921, 4320, 4058, 6255, 3700, 4180, 4180 },
                        top_power[] = { 728, 575, 657, 609, 703, 553, 609, 631 },
                        total = 0;

        Latihan1 objek = new Latihan1();
        System.out.println("Nilai tertinggi top acceleration : "
                        + objek.TinggiDC(top_acceleration, 0, top_acceleration.length - 1));
        System.out.println("Nilai terendah top acceleration : "
                        + objek.RendahDC(top_acceleration, 0, top_acceleration.length - 1));
        System.out.println("Nilai rata-rata top power : "
                        + objek.JumlahBF(top_power, total));
}
}

```

![!\[alt text\](image.png)](SS/image.png)