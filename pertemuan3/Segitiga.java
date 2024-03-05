package pertemuan3;

public class Segitiga {
    public int alas;
    public int tinggi;

    // Konstruktor dengan parameter int a (alas) dan int t (tinggi)
    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga (asumsi segitiga siku-siku)
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    public static void main(String[] args) {
        // Membuat array sgArray yang berisi 4 objek Segitiga
        Segitiga[] sgArray = new Segitiga[4];

        // Menginisialisasi setiap elemen sgArray dengan objek Segitiga dan atribut yang
        // ditentukan
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        // Looping untuk mencetak luas dan keliling setiap segitiga
        for (int i = 0; i < sgArray.length; i++) {
            double luas = sgArray[i].hitungLuas();
            double keliling = sgArray[i].hitungKeliling();
            System.out.println("Segitiga ke-" + i);
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
            System.out.println();
        }
    }

}
