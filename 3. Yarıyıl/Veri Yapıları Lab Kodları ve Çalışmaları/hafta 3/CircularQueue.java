/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veriyapilari2025;

/**
 *
 * @author gurha
 */
public class CircularQueue<T extends Comparable> {
    private T [] values;
    private int front;
    private int rear;

    public CircularQueue(Class<T> dataType, int size) {
        //values=new T[size] olmalı ama olmuyor javada
        this.values = (T[]) java.lang.reflect.Array.newInstance(dataType, size);
        this.front=this.rear=0;
    }
    public void clear(){
        this.rear=this.front=0;
    }
    public boolean isEmpty(){
        return this.rear==this.front;
    }
    public boolean isFull(){
        return (this.rear+1)%this.values.length==this.front;
    }
    public void enQueue(T val){
        if(isFull())
            System.out.println("queue is full");
        else{
            this.rear=(this.rear+1)%this.values.length;
            this.values[this.rear]=val;
        }
    }
    public T deQueue() throws Exception{
        if(isEmpty())
            throw new Exception("empty");
        else{
            this.front=(this.front+1)%this.values.length;
            return this.values[this.front];
        }
    }
    public int size(){
        return this.values.length;
    }
    public void display(){
        for (int i = (this.front+1)%size(); i!=(this.rear+1)%size(); i=(i+1)%size()) {
            System.out.println(this.values[i]);
        }
    
    }
    
}










