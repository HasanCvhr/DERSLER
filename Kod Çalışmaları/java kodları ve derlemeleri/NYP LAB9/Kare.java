/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author user
 */
public class Kare extends Sekil implements Comparable{

    private int kenar;
    public Kare(){
        this.kenar=1;
    }
    public Kare(int k){
       this.setKenar(k);
    }
    @Override
    protected double alan() {
        return this.kenar*this.kenar;
    }

    @Override
    protected double cevre() {
        return this.kenar*4;
    }

    /**
     * @return the kenar
     */
    public int getKenar() {
        return kenar;
    }

    /**
     * @param kenar the kenar to set
     */
    public void setKenar(int kenar) {
        if(kenar>0)
            this.kenar = kenar;
        else
            this.kenar=1;
    }
    public String toString(){
        return "Kare Kenarı..: "+ this.kenar + "  alan..:"+this.alan()
                +"  cevre..:" +this.cevre();
    }

    @Override
       public int compareTo(Object o){
        Kare d=(Kare)o;
        if(this.alan()>d.alan())//if(this.alan()>((Daire)o).alan()) bu şekilde de olur
            return 1;
        else if(this.alan()<d.alan())
            return -1;
        else
            return 0;
    }
    
}
