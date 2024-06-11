package pertemuan6.kode;

public class HotelMain {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Hotel POP Denpasar", "Kota Bali", 280000, (byte) 2);
        Hotel h2 = new Hotel("Hotel Mercure", "Kota Jakarta", 890000, (byte) 4);
        Hotel h3 = new Hotel("Hotel D'Paragon Ijen Nirwana ", "Kota Malang", 180000, (byte) 1);
        Hotel h4 = new Hotel("Hotel Grand Malioboro", "Kota Yogjakarta", 350000, (byte) 3);
        Hotel h5 = new Hotel("Hotel DoubleTree by Hilton ", "Kota Surabaya", 1020000, (byte) 5);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Menampilkan hotel sebelum pengurutan :");
        list.tampilAll();

        System.out.println("Pengurutan harga termurah ke harga tertinggi :");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Pengurutan bintang tertinggi (5) ke terendah (1) :");
        list.selectionSort();
        list.tampilAll();
    }
}