/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veriyapilari2025;

/**
 *
 * @author gurha
 */
public class BinarySearchTree<T extends Comparable> {
    private TNode<T> root;
    
    public void insert(T val){
        TNode<T> newNode=new TNode(val);
        if(root==null)
            root=newNode;
        else{
            TNode<T> iterator=root;
            while(true){
                if(val.compareTo(iterator.value)<0){
                    if(iterator.left==null){
                        iterator.left=newNode;
                        return;
                    }else
                        iterator=iterator.left;
                }else if(val.compareTo(iterator.value)>0){
                    if(iterator.right==null){
                        iterator.right=newNode;
                        return;
                    }else
                        iterator=iterator.right;
                }else{
                    System.out.println("değer ağaçta mevcut");    
                    return;
                }
               
            }
        }
    }
    public void preorder(){
        preorder(this.root);
    }
    private void preorder(TNode<T> tempRoot){
        if(tempRoot!=null){
            System.out.println(tempRoot.value);
            preorder(tempRoot.left);
            preorder(tempRoot.right);
        }
    }
    public void postorder(){
        postorder(this.root);
    }
    private void postorder(TNode<T> tempRoot){
        if(tempRoot!=null){
            postorder(tempRoot.left);
            postorder(tempRoot.right);
            System.out.println(tempRoot.value);
 
        }
    }
    public void inorder(){
        inorder(this.root);
    }
    private void inorder(TNode<T> tempRoot){
        if(tempRoot!=null){
            inorder(tempRoot.left);
            System.out.println(tempRoot.value);
            inorder(tempRoot.right);
        }
    }
    
    public boolean search(T val){
        TNode<T> iterator=root;
        while(iterator!=null){
           if(val.compareTo(iterator.value)==1)
               iterator=iterator.right;
           else if(val.compareTo(iterator.value)==-1)
               iterator=iterator.left;
           else
                return true;
        }
        return false;
    }
    public boolean searchRecursive(T val){
        return searchRecursive(this.root, val);
    }
    private boolean searchRecursive(TNode<T> tempRoot, T val){
        if(tempRoot==null)
            return false;
        else{
            if(tempRoot.value.compareTo(val)==0)
                return true;
            else if (tempRoot.value.compareTo(val)==1)
                return searchRecursive(tempRoot.left, val);
            else
                return searchRecursive(tempRoot.right, val);
            
        }
    }
    public TNode<T> findParent(T val){
        if(!search(val))
            return null;
        else if(root!=null && root.value.compareTo(val)==0)
            return null;
        TNode<T> iterator=root, parent=root;
        while(iterator.value.compareTo(val)!=0){
            parent=iterator;
            if(val.compareTo(iterator.value)==-1)
                iterator=iterator.left;
            else
                iterator=iterator.right;
        }
        return parent;
    }
    
    
}
