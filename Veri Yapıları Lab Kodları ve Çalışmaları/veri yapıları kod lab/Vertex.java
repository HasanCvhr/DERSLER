/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veriyapilari2025;

/**
 *
 * @author gurha
 */
public class Vertex<T extends Comparable> {
    T id;
    Vertex nextVertex;
    Edge edgeLink;
    public Vertex(T id){
        this.id=id;
                
    }
    public String toString(){
        return String.valueOf(id);
    }
}
