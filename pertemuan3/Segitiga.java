package pertemuan3;

public class Segitiga {
    public int alas;
    public int tinggi;

    // Konstruktor dengan parameter int a (alas) dan int t (tinggi)
    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public static void main(String[] args) {
        // Membuat objek Segitiga dengan konstruktor yang baru
        Segitiga sgt = new Segitiga(5, 8); // Misalnya, menginisialisasi alas=5 dan tinggi=8
    }
}
