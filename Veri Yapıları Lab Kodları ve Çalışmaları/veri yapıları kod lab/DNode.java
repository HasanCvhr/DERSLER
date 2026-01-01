/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veriyapilari2025;

/**
 *
 * @author gurha
 */
public class DNode<T extends Comparable> {
    T value;
    DNode<T> next, prev;
    
    public DNode(T val){
        this.value=val;
        this.next=null;
        this.prev=null;
    }
    @Override
    public String toString(){
        return String.valueOf(this.value);
    }
    
}
