package Jan22InClassDemos.src.DS_assignment9;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<E> {

    private Node<E> root;
    private int size = 0;

    //todo creating inner class node
    private static class Node<E>{
        //todo instances field
        private List<Node> children;
        private Node<E> left;
        private Node<E> right;
        private E data;

        //todo constructor for node
        private Node(E item){
            this.children = new ArrayList<>();
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
    public Node<E> addNode(Node<E> node){
        if(root == null){
            root = node;
            size++;
        }
        if((int)root.data > (int)node.data){
            root.left = node;
            size++;
        }
        if((int)root.data < (int)node.data){
            root.right = node;
            size++;
        }
        return root;
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
        myTree.addNode(55);
        myTree.addNode(45);
        myTree.addNode(47);
        myTree.addNode(43);
        myTree.addNode(54);
        myTree.addNode(58);
        myTree.addNode(76);
        myTree.addNode(71);
        myTree.addNode(50);
        myTree.addNode(60);
        myTree.addNode(68);
        myTree.addNode(80);
        myTree.addNode(91);

        System.out.println("Preorder to traversal of binary search tree");
        myTree.preOrderTraversal();
        System.out.println("\nInorder to traversal of binary search tree");
        myTree.inOrderTraversal();
        System.out.println("\nPostorder to traversal of binary search tree");
        myTree.postOrderTraversal();
    }
}
