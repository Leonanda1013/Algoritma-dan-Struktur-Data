package pertemuan13.Tugas;

public class 4 {//code sudah dicoba sebelumny salu disalin pada file ini
    public int countLeafNodes() {
        return countLeafNodesRecursive(root);
    }
    
    private int countLeafNodesRecursive(Node28 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodesRecursive(node.left) + countLeafNodesRecursive(node.right);
    }
    
}
