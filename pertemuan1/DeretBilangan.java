package pertemuan1;

import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input NIM:");
        String nim = input.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2)); // Mengambil 2 digit terakhir dari NIM
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewatkan angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        input.close();
    }
}
