package pertemuan3;

public class Soal {
    public static void main(String[] args) {
        PersegiPanjang29[][] array2D = new PersegiPanjang29[3][3];

        // Inisialisasi array of object
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2D[i][j] = new PersegiPanjang29();
                array2D[i][j].panjang = (i + 3) * 10; // Contoh nilai panjang
                array2D[i][j].lebar = (j + 2) * 5; // Contoh nilai lebar
            }
        }

        // Akses objek dalam array of object
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Persegi Panjang[" + i + "][" + j + "]: Panjang = " + array2D[i][j].panjang
                        + ", Lebar = " + array2D[i][j].lebar);
            }
        }
    }
}
