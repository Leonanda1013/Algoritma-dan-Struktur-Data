# JOBSHEET I : KONSEP DASAR PEMROGRAMAN


![!\[alt text\](image.png)](SS/image.png)

Nama    : Vincentius L.P<br>
Nim     : 2341720149<br>
Kelas   : TI-1B<br>
Absen   : 29<br>

## 2. Praktikum
### 2.1 Pemilihan 
#### Kode Program

```java
package pertemuan1;

import java.util.Scanner;

public class HitungNilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai tugas (0-100): ");
        int nilaiTugas = input.nextInt();
        if (!isValid(nilaiTugas)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.println("Masukkan nilai kuis (0-100): ");
        int nilaiKuis = input.nextInt();
        if (!isValid(nilaiKuis)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.println("Masukkan nilai UTS (0-100): ");
        int nilaiUTS = input.nextInt();
        if (!isValid(nilaiUTS)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.println("Masukkan nilai UAS (0-100): ");
        int nilaiUAS = input.nextInt();
        if (!isValid(nilaiUAS)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        double nilaiAkhir = hitungNilaiAkhir(nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS);
        String nilaiHuruf = konversiNilaiHuruf(nilaiAkhir);
        String keterangan = (nilaiHuruf.equals("TIDAK LULUS") || nilaiHuruf.equals("D") || nilaiHuruf.equals("E"))
                ? "TIDAK LULUS"
                : "LULUS";

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);

    }

    public static boolean isValid(int nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    public static double hitungNilaiAkhir(int tugas, int kuis, int uts, int uas) {
        return 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;
    }

    public static String konversiNilaiHuruf(double nilai) {
        if (nilai > 100 || nilai < 0) {
            return "Nilai tidak valid";
        } else if (nilai > 80) {
            return "A";
        } else if (nilai > 73) {
            return "B+";
        } else if (nilai > 65) {
            return "B";
        } else if (nilai > 60) {
            return "C+";
        } else if (nilai > 50) {
            return "C";
        } else if (nilai > 39) {
            return "D";
        } else {
            return "E";
        }

    }

}
```

### 2.2 Perulangan

```java
package pertemuan1;

import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input NIM:");
        String nim = input.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2)); // Mengambil 2 digit terakhir dari NIM
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewatkan angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        input.close();
    }
}
```

### 2.3 Array

```java
package pertemuan1;

import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mataKuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        double[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        double[] nilaiAngka = new double[mataKuliah.length];

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
        }

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobotSks = 0;
        double totalSks = 0; 

        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = konversiNilaiHuruf(nilaiAngka[i]);
            double bobotNilai = konversiNilaiSetara(nilaiAngka[i]);
            double bobotSks = bobotNilai * sks[i];
            totalBobotSks += bobotSks;
            totalSks += sks[i];
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf,
                    bobotNilai);
        }

        double ipSemester = totalBobotSks / totalSks;

        System.out.println("\nIP Semester Anda: " + String.format("%.2f", ipSemester));
    }

    public static String konversiNilaiHuruf(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 75) {
            return "B+";
        } else if (nilaiAngka >= 65) {
            return "B";
        } else if (nilaiAngka >= 60) {
            return "C+";
        } else if (nilaiAngka >= 50) {
            return "C";
        } else if (nilaiAngka >= 40) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double konversiNilaiSetara(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return 4;
        } else if (nilaiAngka >= 75) {
            return 3.5;
        } else if (nilaiAngka >= 65) {
            return 3;
        } else if (nilaiAngka >= 60) {
            return 2.5;
        } else if (nilaiAngka >= 50) {
            return 2;
        } else if (nilaiAngka >= 40) {
            return 1;
        } else {
            return 0;
        }
    }
}
```


### 2.4 Fungsi

```java
package pertemuan1;

public class RoyalGarden {
    private static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    
    private static final int[] hargaBunga = {75000, 50000, 60000, 10000}; // Harga bunga dalam urutan yang sama dengan nama bunga

    public static void main(String[] args) {
        // 1. Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Cabang RoyalGarden " + (i + 1) + ": " + totalPendapatan);
        }

        // 2. Mengetahui jumlah Stock setiap jenis bunga pada cabang royalgarden 4
        System.out.println("\nJumlah Stock setiap jenis bunga pada cabang RoyalGarden 4:");
        for (int j = 0; j < stockBunga[3].length; j++) {
            System.out.println(getNamaBunga(j) + ": " + stockBunga[3][j]);
        }
        
        // 3. Informasi tambahan: pengurangan stock karena bunga mati
        penguranganStockBunga(3, 1, 2, 0, 5); // Pengurangan stock pada cabang RoyalGarden 4
        System.out.println("\nJumlah Stock setiap jenis bunga pada cabang RoyalGarden 4 setelah bunga mati:");
        for (int j = 0; j < stockBunga[3].length; j++) {
            System.out.println(getNamaBunga(j) + ": " + stockBunga[3][j]);
        }
    }

    public static String getNamaBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }

    public static void penguranganStockBunga(int cabang, int aglonema, int keladi, int alocasia, int mawar) {
        stockBunga[cabang - 1][0] -= aglonema;
        stockBunga[cabang - 1][1] -= keladi;
        stockBunga[cabang - 1][2] -= alocasia;
        stockBunga[cabang - 1][3] -= mawar;
    }
}
```


## 3. Tugas
### 1.

```java
package pertemuan1;
import java.util.Scanner;

public class Tugas129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {
            { 'B', 'A', 'N', 'T', 'E', 'N' },
            { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
            { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
            { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
            { 'B', 'O', 'G', 'O', 'R' },
            { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
            { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
            { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
            { 'M', 'A', 'L', 'A', 'N', 'G' },
            { 'T', 'E', 'G', 'A', 'L' }
        };
        
        System.out.print("Masukkan kode plat nomor : ");
        char kode = scanner.next().charAt(0);

        int index = -1;
        
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            
            System.out.println("Kota yang sesuai dengan kode plat nomor " + kode + " adalah : ");
            for (int i = 0; i < KOTA[index].length; i++) {
                System.out.print(KOTA[index][i] + " "); 
            }
        } else {
            System.out.println("Kode plat nomor tidak valid.");
        }
    }
}
```

### 2.

```java
package pertemuan1;

import java.util.Scanner;

public class Tugas229 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (m): ");
        double s = input.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double t = input.nextDouble();

        double v = s / t;
        System.out.println("Kecepatan adalah: " + v + " m/s");
    }

    public static void hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (m/s): ");
        double v = input.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double t = input.nextDouble();

        double s = v * t;
        System.out.println("Jarak adalah: " + s + " meter");
    }

    public static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (m): ");
        double s = input.nextDouble();
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = input.nextDouble();

        double t = s / v;
        System.out.println("Waktu yang diperlukan adalah: " + t + " detik");
    }
}
```
