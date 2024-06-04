package pertemuan13.percobaan2;

public class BinaryTreeArray28 {
    int[] data;
    int idxLast;

    public BinaryTreeArray28() {
        data = new int[10];

    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.println(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
}