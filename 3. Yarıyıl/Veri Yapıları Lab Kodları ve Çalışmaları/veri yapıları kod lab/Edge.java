/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veriyapilari2025;

/**
 *
 * @author gurha
 */
public class Edge<T extends Comparable> {
    T vertexId;
    Edge nextEdge;
    public Edge(T id){
        vertexId=id;
    }
    public String toString(){
        return String.valueOf(vertexId);
    }
}
