class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}

public class latihan2 {
    public Node root;
    public void NewNode(int data){
        root = NewNode(root, new Node(data));
    }
    private Node NewNode(Node root, Node newData){
        if(root == null){
            root = newData;
            return root;
        }
        if(newData.data < root.data){
            root.left = NewNode(root.left, newData);
        }else {
            root.right = NewNode(root.right, newData);
        }
        return root;
    }

    public void inOrder(Node node1){
        if(node1 != null){
            inOrder(node1.left);
            System.out.print(node1.data + " ");
            inOrder(node1.right);
        }
    }
    public void preOrder(Node node1){
        if(node1 != null){
            System.out.print(node1.data + " ");
            preOrder(node1.left);
            preOrder(node1.right);
        }
    }
    public void postOrder(Node node1){
        if(node1 != null){
            postOrder(node1.left);
            postOrder(node1.right);
            System.out.print(node1.data + " ");
        }
    }

    public static void main(String[] args) {
        latihan2 tree = new latihan2();

        tree.NewNode(20);
        tree.NewNode(2);
        tree.NewNode(25);
        tree.NewNode(37);
        tree.NewNode(16);

        System.out.println("\nPre Order : ");
        tree.preOrder(tree.root);
        System.out.println("\nIn Order : ");
        tree.inOrder(tree.root);
        System.out.println("\nPost Order : ");
        tree.postOrder(tree.root);
    }
}