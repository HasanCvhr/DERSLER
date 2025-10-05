/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author user
 */
public class Kup extends Kare implements Comparable{
    public Kup(){
        super();
    }
    public Kup(int kenar){
        super(kenar);
    }
    @Override
    public double alan(){
        return super.alan()*6;
    }
    @Override
    public double cevre(){
        return super.cevre()*3;
    }
    public double hacim(){
        return super.alan()*super.getKenar();
    }
    @Override
    public String toString(){
        return "Kup  kenarı :" + super.getKenar() +
                " Alan...:" + this.alan() +
                " Cevre..:" + this.cevre() +
                " Hacim..:" + this.hacim();
    }
       public int compareTo(Object o){
        Kup d=(Kup)o;
        if(this.alan()>d.alan())//if(this.alan()>((Daire)o).alan()) bu şekilde de olur
            return 1;
        else if(this.alan()<d.alan())
            return -1;
        else
            return 0;
    }
    
}
