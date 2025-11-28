package com.mycompany.veri9;
public class Veri9 {

    public static void main(String[] args) {
        BinarySearchTree <Integer> bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(20);
        bst.insert(15);
        bst.insert(17);
        bst.insert(8);
        bst.insert(3);
       
        bst.inorder();
        bst.inorderSuccessor(5);
        // bst.delete(12);
        // bst.inorder();
       
    }
}
