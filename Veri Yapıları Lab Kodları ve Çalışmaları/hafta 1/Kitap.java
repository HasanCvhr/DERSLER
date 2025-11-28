/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veriyapilari2025;

/**
 *
 * @author gurha
 */
public class Kitap {
    private int sayfaSayisi;
    public int yil;
    
    public Kitap(int yil, int sayi){
        this.yil=yil;
        this.sayfaSayisi=sayi;
    }
    /**
     * @return the sayfaSayisi
     */
    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    /**
     * @param sayfaSayisi the sayfaSayisi to set
     */
    public void setSayfaSayisi(int sayfaSayisi) {
        if(sayfaSayisi<10){
            System.out.println("sayfa sayisi 10'dan büyük olmalı");
            return;
        }
        this.sayfaSayisi = sayfaSayisi;
    }
    public String toString(){
        return this.yil+" "+this.sayfaSayisi; 
    }
    
}
