package pertemuan13.Tugas;

public class 2 {//code sudah dicoba sebelumny salu disalin pada file ini
    public int findMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Tree is empty");
        }
        return findMinRecursive(root);
    }
    
    private int findMinRecursive(Node28 node) {
        return node.left == null ? node.data : findMinRecursive(node.left);
    }
    
    public int findMax() {
        if (isEmpty()) {
            throw new NoSuchElementException("Tree is empty");
        }
        return findMaxRecursive(root);
    }
    
    private int findMaxRecursive(Node28 node) {
        return node.right == null ? node.data : findMaxRecursive(node.right);
    }
    
}
