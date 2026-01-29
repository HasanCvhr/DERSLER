/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veriyapilari2025;

/**
 *
 * @author gurha
 */
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
