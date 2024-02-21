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
        if (stock > 0 && stock >= jml) {
            stock -= jml;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    } // modifikasi kode program

    void restock(int jml) {
        stock += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;

    }
}