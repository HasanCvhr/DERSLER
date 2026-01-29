/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veriyapilari2025;

/**
 *
 * @author gurha
 */
public class HashEntry<T extends Comparable> {

    T value;
    boolean isActive;

    public HashEntry(T value, boolean isActive) {
        this.value = value;
        this.isActive = isActive;
    }

    public HashEntry(T value) {
        this(value, true);
    }
    public void delete(){
        this.isActive=false;
    }
    public String toString(){
        if(this.isActive)
            return String.valueOf(this.value);
        else
            return "available";
    }
}
