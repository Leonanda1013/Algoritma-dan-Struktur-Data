package pertemuan1;

public class RoyalGarden {
    private static int[][] stockBunga = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    private static final int[] hargaBunga = { 75000, 50000, 60000, 10000 }; // Harga bunga dalam urutan yang sama dengan
                                                                            // nama bunga

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
