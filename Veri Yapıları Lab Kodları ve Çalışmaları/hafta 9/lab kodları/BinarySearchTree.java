package com.mycompany.veri9;
public class BinarySearchTree <T extends Comparable>{
    private TNode<T> root;
    
    public TNode<T> findNode(T val){
        if(!search(val))
            return null; 
        TNode<T> iterator=root;
        while(iterator.value.compareTo(val)!=0){
            if(val.compareTo(iterator.value)==-1)
                iterator=iterator.left;
            else 
               iterator=iterator.right;
        }
        return iterator;
    }
    public TNode<T> inorderSuccessor(T val){
        TNode<T> iterator= findNode(val);
        if(iterator==null)
            return null;
        iterator = iterator.right;
        while(iterator.left!=null){
            iterator = iterator.left;
        }
        return iterator;
    }
    public void delete(T val){
        if(!search(val)){
            System.out.println("deger agacta bulunamadi");
            return ; 
        }
        if(root.left==null&&root.right==null){
            root=null;
            return;
        }
        TNode<T> toBeDeleted = findNode(val);
        if(toBeDeleted.left==null&&toBeDeleted.right==null){
        TNode <T> toBeDeleted=findNode(val);
        if(toBeDeleted.left==null && toBeDeleted.right ==null){
            TNode <T> parent = findParent(val);
            parent.left=null;
            else 
            parent.right=null;
        } else if(toBeDeleted.left!=null || toBeDeleted.right == null){
            TNode <T> parent = findParent(val);
            TNode <T> child = null;
            
            if(toBeDeleted.left!=null)
                child = toBeDeleted.left;
            else 
                child = toBeDeleted.right;
            if(parent.left==toBeDeleted)
                parent.left=child;
            else
                parent.right=child;
        }else{
            TNode <T> successor = inorderSuccessor(val);
            T temp = successor.value;
            delete(successor.value);
            toBeDeleted.value= temp;
                  
        }
            
    }
}
    //tek çocuklu sil
    //çift çocuklu sil
    //yaprak sil
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
