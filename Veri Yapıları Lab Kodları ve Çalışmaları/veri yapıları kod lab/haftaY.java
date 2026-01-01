/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vylab9;

/**
 *
 * @author gurha
 */
public class Graph<T extends Comparable> {

    private Vertex head;

    public void addVertex(T id) {
        Vertex<T> newVertex = new Vertex(id);
        if (head == null) {
            head = newVertex;
        } else {
            Vertex<T> iterator = head;
            while (iterator.nextVertex != null) {
                iterator = iterator.nextVertex;
            }
            iterator.nextVertex = newVertex;
        }
    }

    public Vertex<T> findVertex(T id) {
        Vertex<T> iterator = head;
        while (iterator != null) {
            if (iterator.id.compareTo(id) == 0) {
                return iterator;
            }
            iterator = iterator.nextVertex;
        }
        return null;
    }

    public void addEdge(T startId, T endId) {
        Vertex<T> startVertex = findVertex(startId);
        if (startVertex != null && findVertex(endId) != null) {
            Edge<T> newEdge = new Edge(endId);
            if (startVertex.edgeLink == null) {
                startVertex.edgeLink = newEdge;
            } else {
                Edge iterator = startVertex.edgeLink;
                while (iterator.nextEdge != null) {
                    iterator = iterator.nextEdge;
                }
                iterator.nextEdge = newEdge;
            }
        } else {
            System.out.println("başlangıç veya bitiş düğümü yok");
        }
    }
    public int countVertex(){
        int counter=0;
        Vertex iterator=head;
        while(iterator!=null){
            counter++;
            iterator=iterator.nextVertex;
        }
        return counter;
    }
    public int inDegree(T id){
        int counter=0;
        Vertex iterator=head;
        while(iterator!=null){
            Edge iteratorEdge=iterator.edgeLink;
            while(iteratorEdge!=null){
                if(iteratorEdge.vertexId.compareTo(id)==0)
                    counter++;
                iteratorEdge=iteratorEdge.nextEdge;
            }
            iterator=iterator.nextVertex;
        }
        return counter;
    }
    public int outDegree(T id){
        int counter=0;
        Vertex current=findVertex(id);
        if (current==null){
            System.out.println("Bu id'ye sahip bir vertex bulunamadı");
            return counter;
        }
        Edge iterator=current.edgeLink;
        while(iterator!=null){
            counter++;
            iterator=iterator.nextEdge;
        }
        return counter;
    }
    

    public void display() {
        Vertex<T> iterator = head;
        while (iterator != null) {
            System.out.print(iterator.id + "-->");
            Edge iteratorEdge = iterator.edgeLink;
            if (iteratorEdge != null) {

                while (iteratorEdge.nextEdge != null) {
                    System.out.print(iteratorEdge.vertexId + "-->");
                    iteratorEdge = iteratorEdge.nextEdge;
                }
                System.out.println(iterator.id);
            }else
                System.out.println("");
            iterator = iterator.nextVertex;
            }
        }
    }