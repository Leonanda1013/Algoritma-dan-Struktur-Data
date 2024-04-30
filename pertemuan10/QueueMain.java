package pertemuan10;
import java.util.Scanner;

public class QueueMain {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1: {
                    System.out.println("Masukkan data: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                }
                case 2: {
                    System.out.println("Data yang keluar: ");
                    Q.Dequeue();
                    break;
                }
                case 3: {
                    
        }
    }
}
    
