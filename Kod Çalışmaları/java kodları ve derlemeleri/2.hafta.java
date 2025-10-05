public class NYP2 {

    public static void main(String[] args) {
        
        
        Scanner scn =  new Scanner(System.in);
        
        System.out.print("Faktoriyeli hesaplanacak sayıyı girin :");
        int sayi = scn.nextInt();
        
        int fakt = 1;
        
        for (int i = 2; i <= sayi ; i++) {
            fakt = fakt * i;
        }

        int i = 2;

        while (i <= sayi) {
            
            fakt = fakt * i;
            
            i++;
        }
        
        System.out.println("faktoriyel : " + fakt);
        


        i = 1;
        
        double e = 1;
        
        System.out.print("Terim sayısını giriniz : ");
        sayi = scn.nextInt();

        while (i <= sayi) {
            
            fakt = fakt * i;
            e += 1.0 / fakt;
            i++;
        }
        
        System.out.println("E sayısı : " + e);
        
        
        int toplam = 0;
        int girilenSayi = 0;
        
        while (girilenSayi != -1) {
            
            toplam += girilenSayi;
            
            System.out.print("Lütfen sayı giriniz : ");
            girilenSayi = scn.nextInt();
            
        }
        
        System.out.println("Sayıların Toplamı : " + toplam);
        
        Random rnd = new Random();
        int randomSayi = rnd.nextInt(1,101);
        
        System.out.print("Bir sayı girin : ");
        int tahminEdilen = scn.nextInt();
        
        int denemeSayisi = 1;
        while(tahminEdilen != randomSayi) {
            
            if (randomSayi > tahminEdilen) {
                System.out.print("Daha büyük bir sayı girin : ");
            } else {
                System.out.print("Daha küçük bir sayı girin : ");
            }
            
            tahminEdilen = scn.nextInt();
            denemeSayisi++;
        }
        
        System.out.println("Tebrikler doğru tahmin. Deneme Sayısı : " + denemeSayisi);
        
        
    }
}