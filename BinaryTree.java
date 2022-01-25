package Jan22InClassDemos.src.DS_assignment9;

public class BinaryTree<E> {

    private Node<E> root;
    private int size = 0;

    //todo creating inner class node
    private static class Node<E>{
        //todo instances field
        private Node<E> left;
        private Node<E> right;
        private E data;

        //todo constructor for node
        private Node(E item){
            this.data = item;
            this.left = null;
            this.right = null;
        }

    }
    //todo constructor for the BinaryTree class
    public BinaryTree(){
        root = null;

    }
    //todo add method
    public Node<E> addNode(Node<E> root, E item){
        if(root == null){
            root = new Node<E>(item);
            size++;
        }
        if((int)root.data > (int)item){
            root.left = addNode(root.left, item);
            size++;
        }
        if((int)root.data < (int)item){
            root.right = addNode(root.right, item);
            size++;
        }
        return root;
    }
    //todo insert to the tree
    public void addToTree(E item){
        root = addNode(root, item);
    }
    //todo inorder
    public void inOrder(Node<E> root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }
    //todo preorder
    public void preOrder(Node<E> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
    //todo preorder
    public void preOrder(Node<E> root, Node<E> child){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
    //todo postorder
    public void postOrder(Node<E> root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    // todo Pre-order traversal
    public void preOrderTraversal(){
        preOrder(root);
    }
    // todo In-order traversal
    public void inOrderTraversal(){
      inOrder(root);
    }
    // todo Post-order traversal
    public void postOrderTraversal(){
        postOrder(root);
    }
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree<>();
        //myTree = new int[55,45,47,43,54,58,76,71,50,60,68,80,91];
        myTree.addToTree(55);
        myTree.addToTree(45);
        myTree.addToTree(47);
        myTree.addToTree(43);
        myTree.addToTree(54);
        myTree.addToTree(58);
        myTree.addToTree(76);
        myTree.addToTree(71);
        myTree.addToTree(50);
        myTree.addToTree(60);
        myTree.addToTree(68);
        myTree.addToTree(80);
        myTree.addToTree(91);

        System.out.println("Preorder to traversal of binary search tree");
        myTree.preOrderTraversal();
        System.out.println("\nInorder to traversal of binary search tree");
        myTree.inOrderTraversal();
        System.out.println("\nPostorder to traversal of binary search tree");
        myTree.postOrderTraversal();
    }
}
