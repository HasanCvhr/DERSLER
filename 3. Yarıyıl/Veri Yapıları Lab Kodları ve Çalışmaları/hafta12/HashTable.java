/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veriyapilari2025;

/**
 *
 * @author gurha
 */
public class HashTable<T extends Comparable>{
    HashEntry<T> [] table;
    public HashTable(int size){
        table=new HashEntry[size];
        
    }
    
    //lineer probing yöntemi ile doğrusal sondalama
    public void insert(int key){
        int index=key%this.table.length;
        for (int i = 0; i < this.table.length; i++) {
            if(table[index]==null || table[index].isActive==false){
                table[index]=new HashEntry(key);
                return;
            }else{
                index=(index+1)%this.table.length;
            }
        }
        System.out.println("tablo dolu");
        return;
        
    }
    public boolean search(int key){
        int index=key%this.table.length;
        for (int i = 0; i < this.table.length; i++) {
            if(this.table[index]==null)
                return false;
            else if(this.table[index].value.compareTo(key)==0 && 
                    this.table[index].isActive==true)
                    return true;
            else
                index=(index+1)%this.table.length;
        }
        return false;
    }
    public void delete(int key){
        if(!search(key)){
            System.out.println("böyle bir değer yok");
            return;
        }
        int index=key%this.table.length;
        for (int i = 0; i < this.table.length; i++) {
            if(this.table[index].value.compareTo(key)==0){
                this.table[index].delete();
                return;
            }
            index=(index+1)%this.table.length;
        }
        
    }
    public void display(){
        for (int i = 0; i < this.table.length; i++) {
            System.out.println(this.table[i]);
        }
    }
    
    
}
