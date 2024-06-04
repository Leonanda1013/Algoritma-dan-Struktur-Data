package pertemuan13.Tugas;

public class 3 {//code sudah dicoba sebelumny salu disalin pada file ini
    public void printLeafNodes() {
        printLeafNodesRecursive(root);
    }
    
    private void printLeafNodesRecursive(Node28 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeafNodesRecursive(node.left);
            printLeafNodesRecursive(node.right);
        }
    }
    
}
