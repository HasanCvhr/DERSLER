
public class ağaçlar2<T extends Comparable> {
    private Node<T> top;
    private int size;
    
    public LinkedStack(int size){
        this.size=size;
    }
    public boolean isEmpty(){
        return this.top==null;
    }
    public int count(){
        int counter=0;
        Node<T> iterator=top;
        while(iterator!=null){
            iterator=iterator.next;
            counter++;
        }
        return counter;
    }
    public boolean isFull(){
        return this.count()==this.size;            
    }
    
    
    public void push(T val){
        if(isFull())
            return;
        Node<T> newNode=new Node(val);
        newNode.next=top;
        top=newNode;
        
    }
    public T pop(){
        if(isEmpty())
            return null;
        T val=top.value;
        top=top.next;
        return val;
    }
    public void display(){
        Node<T> iterator=top;
        while(iterator!=null){
            System.out.pri  ntln(iterator);
            iterator=iterator.next;
        }
    }
    public boolean search(T val){
        Node<T> iterator=top;
        while(iterator!=null){
            if(iterator.value.compareTo(val)==0)
                return true;
            iterator=iterator.next;
        }
        return false;
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vylab7;

/**
 *
 * @author user
 */
public class Node<T extends Comparable> {
    T value;
    Node<T> next;
    
    public Node(T val){
        this.value=val;
        this.next=null;
    }
    @Override
    public String toString(){
        return String.valueOf(this.value);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vylab7;

/**
 *
 * @author user
 */
public class VYLab7 {
    public static<T extends Comparable> boolean 
                              search(LinkedStack<T> s, T val){
        LinkedStack<T> temp=new LinkedStack(s.count());
        boolean result=false;
        while(!s.isEmpty()){
            T tempVal=s.pop();
            temp.push(tempVal);
            if(tempVal.compareTo(val)==0){
                result=true;
                break;
            }
        }
        while(!temp.isEmpty())
            s.push(temp.pop());
                            
        return result;
    }
    public static void main(String[] args) {
        LinkedStack<Integer> s=new LinkedStack(5);
        s.push(4);
        s.push(14);
        s.push(7);
        s.display();
    }
}
}
