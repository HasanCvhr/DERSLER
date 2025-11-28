
package com.mycompany.siniflar;
public class Siniflar {

    public static void main(String[] args) {
    //sınıf adı objeadı= new sınıf adı(); 
    //HesapMakinesi makine1= new HesapMakinesi();
    //makine1.sayi1=10;
    // makine1.sayi2=20;
    //System.out.println(makine1.sayi1);
    //HesapMakinesi makine2= new HesapMakinesi();
    //makine2.sayi1=20;
    // System.out.println(makine2.sayi1);
    HesapMakinesi m1= new HesapMakinesi(10,5,"siyah");
    System.out.println(m1.toplama());
    m1.sayi1=8;
    System.out.println(m1.cikarma());
    HesapMakinesi m2= new HesapMakinesi(20,3,"mavi");
    System.out.println(m2.toplama());
    }
}