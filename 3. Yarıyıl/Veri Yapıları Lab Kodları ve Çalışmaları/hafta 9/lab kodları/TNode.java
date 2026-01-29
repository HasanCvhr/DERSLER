package com.mycompany.veri9;
public class TNode<T extends Comparable> {
    T value;
    TNode<T> left;
    TNode<T> right;
    public TNode(T val){
        this.value=val;
    }
    public String toString(){
        return String.valueOf(value);
    }
}