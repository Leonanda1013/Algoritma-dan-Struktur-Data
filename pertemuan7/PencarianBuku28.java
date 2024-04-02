package pertemuan7;

public class PencarianBuku28 {
    Buku28 listBk[] = new Buku28[5];
    int idx;

    void tambah(Buku28 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah Penuh");

        }
    }

    void tampil() {
        for (Buku28 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                return j;
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data " + x + " ditemukan data pada index " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].pengarang);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

}
