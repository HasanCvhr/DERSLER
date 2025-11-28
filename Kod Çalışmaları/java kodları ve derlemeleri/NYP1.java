import java.util.Scanner;
public class NYP1 {

    public static void main(String[] args) {
        
       Scanner scn = new Scanner(System.in);
       
       
       System.out.print("Adınız : ");
       String ad =  scn.nextLine();
       
       System.out.print("Soyadınız : ");
       String soyad =  scn.nextLine();
       
       System.out.println(ad + " " + soyad);
       
       System.out.print("Sayi1 : ");
       int sayi1 = scn.nextInt();
       
       System.out.print("Sayi2 : ");
       int sayi2 = scn.nextInt();
       
       System.out.print("Sayi3 : ");
       int sayi3 = scn.nextInt();
       
       
       int toplam = sayi1 + sayi2 + sayi3;
       double ortalama = toplam/3.0;
       
       System.out.println("toplam = "+toplam);
       System.out.println("ortalama = " + ortalama);
       
        
        System.out.println("Günlük Mesafe");
        int gunlukMesafe = scn.nextInt();
        
        System.out.println("Galon Benzin Fiyatı");
        double galon = scn.nextDouble();
        
        System.out.println("1 Galon ile kaç mil gidilir? : ");
        double menzil = scn.nextDouble();
        
        System.out.println("Otopark Ücreti");
        int otoparkUcreti = scn.nextInt();
        
        System.out.println("Yol Ücreti");
        int yolUcreti = scn.nextInt();
        
        double benzinUcreti = galon * gunlukMesafe/menzil;
        
        double toplamMaliyet = benzinUcreti + otoparkUcreti + yolUcreti;
        
        System.out.println("toplam Maliyet : " + toplamMaliyet );
        
        int sayi =  12345;
        
        int birinciSayi = sayi/10000;
        int ikinciSayi = (sayi/1000) % 10;
        int ucuncuSayi = (sayi/100) % 10;
        int dorduncuSayi = (sayi/10) % 10;
        int besinciSayi = sayi % 10;
        
        System.out.println(birinciSayi+ " " + ikinciSayi + " " + ucuncuSayi + " " + dorduncuSayi + " " + besinciSayi);
        
        

    }
}