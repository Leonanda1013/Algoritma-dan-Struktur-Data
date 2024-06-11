package pertemuan13.Tugas;

public class 1 {//code sudah dicoba sebelumny salu disalin pada file ini
    public class BinaryTree28 {
        Node28 root;
        int size;
    
        public BinaryTree28() {
            root = null;
        }
    
        boolean isEmpty() {
            return root == null;
        }
    
        public void add(int data) {
            root = addRecursive(root, data);
        }
    
        private Node28 addRecursive(Node28 current, int data) {
            if (current == null) {
                return new Node28(data);
            }
    
            if (data < current.data) {
                current.left = addRecursive(current.left, data);
            } else if (data > current.data) {
                current.right = addRecursive(current.right, data);
            }
            return current;
        }
    }
    
}
