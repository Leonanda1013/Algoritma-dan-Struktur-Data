package pertemuan2;

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

    public Buku29() {

    }

    public Buku29(String jud, String pg, int hal, int stock, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stock = stock;// Apabila nama parameter sama dengan nama atribut, maka untuk merujuk pada
                           // variabel atribut ditambahkan sintaks this di depan nama atribut
        harga = har;
    }

    int hitungHargaTotal(int jml) {
        int hargaTotal = jml *= harga;
        return hargaTotal;
    }

    int hitungDiskon(int hargaTotal) {
        int diskon;
        if (hargaTotal > 150000) {
            diskon = hargaTotal *= 12 / 100;

        } else if (75000 > hargaTotal && 150000 < hargaTotal) {
            diskon = hargaTotal *= 5 / 100;

        } else {
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar(int diskon, int hargaTotal) {
        int hargaBayar = hargaTotal - diskon;
        return hargaBayar;
    }

}