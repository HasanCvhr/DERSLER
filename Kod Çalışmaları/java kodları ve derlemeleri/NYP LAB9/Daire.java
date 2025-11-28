/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author user
 */
public class Daire extends Sekil implements Comparable{

    private int r;
    
    public Daire(){
        this.r=1;
    }
    public Daire(int r){
        this.setR(r);
    }
    public int getR() {
        return r;
    }
    
    public void setR(int r) {
        if (r<0) 
            this.r=1;
        else
            this.r = r;
    }
    
    @Override
    public double alan() {
        return Math.PI*this.r*this.r;
    }

    @Override
    public double cevre() {
        return Math.PI*this.r*2;
    }
    
    public String toString(){
        return "Daire yarıçap..: "+ this.r + "  alan..:"+this.alan()
                +"  cevre..:" +this.cevre();
    }
    public int compareTo(Object o){
        Daire d=(Daire)o;
        if(this.alan()>d.alan())//if(this.alan()>((Daire)o).alan()) bu şekilde de olur
            return 1;
        else if(this.alan()<d.alan())
            return -1;
        else
            return 0;
    }
    
    
    
}
