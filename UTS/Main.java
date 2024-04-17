package UTS;

public class Main {
    public static void main(String[] args) {
        Method object = new Method();
        int jumNilai = 17;

        Data n1 = new Data(48);
        Data n2 = new Data(13);
        Data n3 = new Data(1);
        Data n4 = new Data(5);
        Data n5 = new Data(19);
        Data n6 = new Data(11);
        Data n7 = new Data(23);
        Data n8 = new Data(28);
        Data n9 = new Data(1);
        Data n10 = new Data(50);
        Data n11 = new Data(21);
        Data n12 = new Data(19);
        Data n13 = new Data(43);
        Data n14 = new Data(23);
        Data n15 = new Data(12);
        Data n16 = new Data(12);
        Data n17 = new Data(35);

        object.tambah(n1);
        object.tambah(n2);
        object.tambah(n3);
        object.tambah(n4);
        object.tambah(n5);
        object.tambah(n6);
        object.tambah(n7);
        object.tambah(n8);
        object.tambah(n9);
        object.tambah(n10);
        object.tambah(n11);
        object.tambah(n12);
        object.tambah(n13);
        object.tambah(n14);
        object.tambah(n15);
        object.tambah(n16);
        object.tambah(n17);

        // Sebelum Sorting
        object.tampil();
        int posisisebelum = object.FindBinarySearchasce(21, 0, jumNilai - 1);
        object.tampilPosisi(21, posisisebelum);

        // Sorting ascending
        object.selectionSortAscen();
        object.tampil();
        int posisiAscending = object.FindBinarySearchasce(21, 0, jumNilai - 1);
        object.tampilPosisi(21, posisiAscending);

        // Sorting Descending
        object.selectionSortDescen();
        object.tampil();
        int posisiDescending = object.FindBinarySearchdesce(21, 0, jumNilai - 1);
        object.tampilPosisi(21, posisiDescending);

        object.selectionSortAscen();
        object.tampil();
        int posisitidak = object.FindBinarySearchasce(88, 0, jumNilai - 1);
        object.tampilPosisi(88, posisitidak);
    }
}
