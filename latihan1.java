class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}
public class latihan1 {
    public Node root;
    public latihan1(){
        root = null;
    }
    public void addRoot(int data){
        root = new Node(data);
    }

    public void inOrder(Node node1) {
        if (node1 != null) {
            inOrder(node1.left);
            System.out.print(node1.data + " ");
            inOrder(node1.right);
        }
    }

    public void preOrder(Node node1) {
        if (node1 != null) {
            System.out.print(node1.data + " ");
            preOrder(node1.left);
            preOrder(node1.right);
        }
    }

    public void postOrder(Node node1) {
        if (node1 != null) {
            postOrder(node1.left);
            postOrder(node1.right);
            System.out.print(node1.data + " ");
        }
    }

    public static void main(String[] args) {
        latihan1 tree = new latihan1();

        tree.addRoot(20);
        tree.root.left = new Node(2);
        tree.root.right = new Node(25);
        tree.root.left.left = new Node(37);
        tree.root.left.right = new Node(12);
        tree.root.right.right = new Node(16);

        System.out.println("\nPre Order : ");
        tree.preOrder(tree.root);
        System.out.println("\nIn Order : ");
        tree.inOrder(tree.root);
        System.out.println("\nPost Order : ");
        tree.postOrder(tree.root);
    }
}