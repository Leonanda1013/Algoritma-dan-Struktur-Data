public class Buku29 {
    // deklarasi variable
    String judul, pengarang;
    int halaman, stock, harga;

    // method
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jmlah halman: " + halaman);
        System.out.println("Sisa Stok: " + stock);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        stock -= jml;

    }

    void restock(int jml) {
        stock += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;

    }
}