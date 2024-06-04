package pertemuan13.Tugas;

public class 5b {
    package pertemuan13.percobaan2;

public class BinaryTreeArrayMain28 {
    public static void main(String[] args) {
        BinaryTreeArray28 bta = new BinaryTreeArray28();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.println("InOrder Traversal:");
        bta.traverseInOrder(0);
        System.out.println("\nPreOrder Traversal:");
        bta.traversePreOrder(0);
        System.out.println("\nPostOrder Traversal:");
        bta.traversePostOrder(0);
    }
}

}

//code sudah dicoba sebelumny salu disalin pada file ini
