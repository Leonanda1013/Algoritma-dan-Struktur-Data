package pertemuan13.Tugas;

public class 5a {//code sudah dicoba sebelumny salu disalin pada file ini
    package pertemuan13.percobaan2;

public class BinaryTreeArray28 {
    int[] data;
    int idxLast;

    public BinaryTreeArray28() {
        data = new int[10];
        idxLast = -1;
    }

    void add(int data) {
        if (idxLast < this.data.length - 1) {
            this.data[++idxLast] = data;
        } else {
            System.out.println("Tree is full");
        }
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}

}
