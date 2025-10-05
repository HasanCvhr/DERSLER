#include <stdio.h>
#include <stdlib.h>
void myMessage() {
printf("Now ı can ı write function\n");
}
void nameList (char name [],int age ){
  printf("Hello %s\n",name)  
}
    
int main(){
   namelist("Hasan",34);
   nameList("Fehmi",32);
 return 0;
}

#include <stdio.h>
#include <math.h>
int main(){

   c=13.0,d=3.0,f=4.0;
   printf("%.2f",sqrt(c+ d * f));
  /*
  sqrt= karekök cbrt = küpkök
  exp= elen fonksiyonu, log=x nin logaritması
  log10= x'in 10 luk tabanda logaritması, fabs= mutlak değer
  ceil = bir yukarı yuvarlar, floor= tam değer fonksiyonu
  pow(x,y)= x üzeri , fmod(x,y)=x /y bölümünden kalanı ondalıklı verir
  sin cos tan cot (x)
İyi fonksiyon isimlendirme ve tanımlama ile belirli görevleri
gerçekleştiren standartlaştırılmış fonksiyonlardan oluşan programlar
oluşturabilirsiniz; bu, soyutlama olarak bilinir. Her printf, scanf veya
pow gibi standart kütüphane fonksiyonlarını kullandığımızda
soyutlamadan yararlanıyoruz.
 Her fonksiyon, tek bir iyi tanımlanmış görevi yerine getirmekle sınırlı
 olmalı ve fonksiyon adı bu görevi ifade etmelidir. Bu, soyutlamayı
 kolaylaştırır ve yazılımın yeniden kullanılabilirliğini teşvik eder. 
fonksiyonu mümkün olan en küçük parçalara ayırmamız gerekir.Buna ayrıştırma denir.  
*/
   
int kare(int sayi); // fonksiyon protitipi
int main(void){
for (int x=1; x<= 10; ++x){
    
    printf("%d",kare(x));// fonksiyon çağrısı
    // 10 defa dön ve x in karesini hesapla

}
puts("");
}
int kare(int sayi){
    return sayi * sayi;
}   // değer geri döndürme return ifadesiyle yapılır.
   
   // geri-dönüş-türü fonksiyon-adı(parametre-listesi) {komutlar}
// fonksiyon adı geçici bir addır. geri dönüş türü çağırana döncek değerin türünü belirtir.
//her parametrenin türü ayrı olarak belirtilmelidir. 
   
   
  /*Kontrolü fonksiyondan döndürmek
 Kontrolü devretmek için iki yol vardır
 Eğer fonksiyon bir değer döndürmüyorsa return; biçiminde
 Eğer değer döndürüyorsa return ifade; biçiminde */ 
   
  return 0;
}
#include <stdio.h>
int maksimum(int x,int y,int z);
int main(){
    int sayi1=0;
    int sayi2=0;
    int sayi3=0;
printf("%s", "Üç tam sayi değeri giriniz:");
scanf("%d%d%d", &sayi1,&sayi2,&sayi3);
printf("Maksimum:%d\n",maksimum(sayi1,sayi2,sayi3));

}
int maksimum(int x,int y,int z){ //protitip
    int maks=x;
    if(y>maks){
        maks=y;
    }
    if (z>maks){
        maks=z;
    }
    return maks;
} /* Eğer bir ifade long double ise diğer değerler de long double türüne
 dönüştürülür
 Eğer bir ifade double ise diğer değerler de double türüne dönüştürülür
 Eğer bir ifade float ise diğer değerler de float türüne dönüştürülür
double ın printf(%f), scanf(%lf) ekleme push silme pop
*/

int kare(int x);
int main(){
    int a=10;
    printf("%d karesi %d\n",a,kare(a));
}
int kare(int x){
return x * x;
}
// rastgele sayı üretme 
int main (void){
    for (int i=0;i<10;++i){
        printf("%d",1+(rand() %6));// rastgele zar değerini göster.
    }
 puts("");
}
#include <stdio.h>
int kare(int sayi);
int main(void){
    for(int x=1;x<=10;x++){
        printf("%d",kare(x))
    }
puts("");
}
int kare(int sayi){
    return sayi*sayi;
}