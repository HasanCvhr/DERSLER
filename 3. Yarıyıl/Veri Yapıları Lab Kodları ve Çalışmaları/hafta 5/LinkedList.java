/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veriyapilari2025;

/**
 *
 * @author gurha
 */
public class LinkedList<T extends Comparable> {

    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public void addToFront(T val) {
        Node<T> newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAfterHead(T val) {
        Node<T> newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    public void addToEnd(T val) {
        Node<T> newNode = new Node(val);
        Node<T> iterator = head;
        if (head == null) {
            head = newNode;
        } else {
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = newNode;
        }

    }

    public boolean search(T val) {
        Node<T> iterator = head;
        while (iterator != null) {
            if (iterator.value.compareTo(val) == 0) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    public void display() {
        if (head == null) {
            return;
        }
        Node<T> iterator = head;
        while (iterator.next != null) {
            System.out.print(iterator + "-->");
            iterator = iterator.next;
        }
        System.out.println(iterator);

    }

    public int count() {
        int counter = 0;
        Node<T> iterator = head;
        while (iterator != null) {
            iterator = iterator.next;
            counter++;
        }
        return counter;
    }

    public void deleteHead() {
        if (head != null) {
            head = head.next;
        }
    }
    public Node<T> findMinNode(Node<T> startNode){
         if(startNode==null)
            return null;
        Node<T> iterator=startNode;
        Node<T> min=startNode;
        while(iterator!=null){
            if(iterator.value.compareTo(min.value)==-1)
                min=iterator;
            iterator=iterator.next;
        }
        return min;       
        
    }
    public Node<T> findMinNode(){
        if(head==null)
            return null;
        Node<T> iterator=head;
        Node<T> min=head;
        while(iterator!=null){
            if(iterator.value.compareTo(min.value)==-1)
                min=iterator;
            iterator=iterator.next;
        }
        return min;       
                    
    }
    public void selectionSort(){
        if(head==null)
            return;
        Node<T> iterator=head;
        while(iterator.next!=null){
            Node<T> minNode=findMinNode(iterator);
//            T temp=head.value;
//            head.value=minNode.value;
//            minNode.value=temp;
            
            
        }
        
        
        
        
        
    }

    public void delete(T val) {
        while (search(val)) {

            if (head.value.compareTo(val) == 0) {
                head = head.next;

            } else {
                Node<T> previous, iterator;
                previous = iterator = head;
                while (iterator.value.compareTo(val) != 0) {
                    previous = iterator;
                    iterator = iterator.next;

                }
                previous.next = iterator.next;
            }
        }
    }

}
