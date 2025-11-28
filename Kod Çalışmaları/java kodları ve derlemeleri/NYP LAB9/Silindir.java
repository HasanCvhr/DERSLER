/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author user
 */
public class Silindir extends Daire  implements Comparable{
    private int yukseklik;

    public Silindir(){
        super();//bu satır yazılmasa da çağırılır.
        this.yukseklik=1;
    }
    public Silindir(int y, int r){
        super(r);
        this.setYukseklik(y);
    }
    public int getYukseklik() {
        return yukseklik;
    }
    public void setYukseklik(int yukseklik) {
        if(yukseklik>0)
            this.yukseklik = yukseklik;
        else
            this.yukseklik=1;
    }
    @Override
    public double alan(){
        return super.alan()*2+this.yukseklik*super.cevre();
    }
    @Override
    public double cevre(){
        return super.cevre();
    }
    public double hacim(){
        return super.alan()*this.yukseklik;
    }
    @Override
    public String toString(){
        return "Silindir yarıcap..:"+super.getR() +
                "  yükseklik...:" + this.yukseklik +
                " Cevre..:" + this.cevre() +
                " Alan..:" + this.alan() +
                " Hacim..:" + this.hacim();
    }
       public int compareTo(Object o){
        Silindir d=(Silindir)o;
        if(this.alan()>d.alan())//if(this.alan()>((Daire)o).alan()) bu şekilde de olur
            return 1;
        else if(this.alan()<d.alan())
            return -1;
        else
            return 0;
    }
    
    
}
