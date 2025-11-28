/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hceva
 */
public class HesapMakinesi {
   public int sayi1;// burda değişkenleri tanımladık.
   public int sayi2;
   public String renk;
   
   HesapMakinesi(int sayi1,int sayi2,String renk){
       this.sayi1=sayi1;//burası constractor.
       this.sayi2=sayi2;  
       this.renk=renk;
       
   }
public int toplama(){
    return this.sayi1+this.sayi2;
}
public int cikarma(){
    return this.sayi1-this.sayi2;
}
public int carpma(){
    return this.sayi1*this.sayi2;
}
public int bolme(){
    return this.sayi1/this.sayi2;
}
}
