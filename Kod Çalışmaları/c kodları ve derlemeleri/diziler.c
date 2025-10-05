#include <stdio.h>
//diziler

int main(void){
int a[10];
int i;
for (i=0;i<5;i++){
    printf("%d. sayıyı giriniz:",i+1);
    scanf("%d",&a[i]);
}
}
/*Aşağıdaki programda, klavyeden girilen 5 sayı, for döngüsü kullanılarak 
görüntülenmektedir. Programda integer tipi dizi değişken kullanılmıştır. i değişkeni 
ise for döngülerini kontrol eden değişkendir. */

#include  <stdio.h>
int main(void){
int i,a[10];
for (i=0;i<5;i++){
    printf("%d .sayıyı giriniz:",i+1);
    scanf("%d",a[i]);
}
printf("\n");
for(i=0;i<5;i++){
    printf("%d. sayı: %d\n",i+1,a[i]);
}

}
// şimdi inceleyeceğimiz programda ise,klavyeden girilen 10 adet
// tam sayının en büyük ve en küçük olanı sayıların toplamı ve ortalaması bulucaz.
 
#include <stdio.h> 
int void main(){
int i, min, max, toplam, a[10]; 
float ortalama;   
for(i=0;i<10;i++){
    printf("%d . sayıyı giriniz:",i+1);
    scanf("%d",&a[i]);
}
min=max=a[0];
toplam=a[0];
for(i=1;i<10;i++){
    if(a[i]>max)
    max=a[i];
    if(a[i]<min)
    min=a[i];
    toplam=toplam +a[i];
}
ortalama = (float)toplam / 10; printf("\n"); 
printf("Sayilarin en buyugu :%5d\n", max); 
printf("Sayilarin en kucugu :%5d\n", min); 
printf("Sayilarin toplami   :%5d\n", toplam); 
printf("Sayilarin ortalamasi:%8.2f\n", ortalama);
}
/* BUBBLE SORT metodunda, sıralanacak sayıların 
bulunduğu dizi değişken hücrelerine ulaşmak üzere iç içe kurulmuş iki döngü 
kullanılır. Aşağıdaki programda klavyeden girilen N adet sayı büyükten küçüğe 
doğru sıralanmakta ve görüntülenmektedir.*/
# include <stdio.h>
#define N 10
int main(void){
    int a[N],i,j,gec;
    printf("%d adet sayı giriniz:\n",N);
    for(i=0;i<N;i++){
        printf("%2d. sayi:",i+1);
        scanf("%d",&a[İ]);
    }
    for(i=1; i<N; i++) 
for(j=0; j<N-1; j++) 
if(a[j] > a[j+1]) 
{ gec = a[j]; 
a[j] = a[j+1]; 
a[j+1] = gec; 
} 
printf("\nSayilarin siralanisi:\n"); 
for(i=0; i<N; i++) 
printf("%2d. Sayı:%3d\n",i+1, a[i]); 
}

/* Şimdi de iki boyutlu bir dizi değişkenin kullanıldığı, 1 ile 10 arasındaki sayılardan 
herhangi birisinin karesini görüntüleyen bir programı inceleyelim */
#include <stdio.h>
int main(void){
    int i,j;
    int kare[10] [2]={1, 1, 2, 4, 3, 9, 4, 16, 5, 25,  
6, 36, 7, 49, 8, 64, 9, 81, 10, 100}; 
printf("1 ile 10 arasında bir sayi giriniz:");
scanf("%d",&i);
for ( j = 0; j < 10; j++)
{
if(kare[j][0]==i)
printf("d nin karesi d dir",i,kare[j][1]);
}
// char isim[20][30]
/* Bu nedenle yukarıda tanımlanan iki boyutlu, char tipi dizi değişkenine uzunlukları en 
fazla 29 karaktere kadar olan 20 isim yerleştirilebilir. */
}
#include <stdio.h>
int main(void){
    int dizi[5];
    for(size_t indeks=0;indeks<5;indeks++){
        dizi[indeks]=0;
    }
    printf("%s %8s\n","Eleman","Değer");
    for (size_t indeks = 0; indeks < 5; ++indeks) {
    printf("%6zu%7d\n", indeks, dizi[indeks]);
 }
}
#include <stdio.h>
#define BOYUT 5 // DİZİNİN MAX BOYUTU
int main(void){
    int dizi[BOYUT]={0};
for(size_t indeks=0;indeks<BOYUT;indeks++){
    dizi[indeks]=2+2*indeks;
}
printf("%s%8s\n","eleman","Değer");
for (size_t indeks= 0; indeks < BOYUT; indeks++){

printf("%6zu%7d\n", indeks, dizi[indeks]);
}

}
#include <stdio.h>
#define CEVAP_BOYUTU 20
#define FREKANS_BOYUTU 6
int main(void){
    int cevaplar[CEVAP_BOYUTU]={1,2, 5, 4, 3, 5, 2, 1, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 2, 5};
    int frekans[FREKANS_BOYUTU]={0};
    for (size_t answer= 0; answer < CEVAP_BOYUTU; answer++)
    {
        frekans++[cevaplar[answer]]
    }
    printf("%s %12s\n","Puan","Frekans");
    }
 // fig06_06.c
  // Çubuk grafik gösterme.
#include <stdio.h>
 #define BOYUT 5
 // main fonksiyonu programın çalışmasını başlatır
int main(void) {
//bir başlatıcı liste kullanarak dizi n'yi başlat
int dizi[BOYUT] = {19, 3, 15, 7, 11};
printf("%s%13s%17s\n", "Eleman", "Değer", "Çubuk Grafik");
for (size_t i = 0; i < BOYUT; ++i) {
printf("%6zu%12d%4s", i, dizi[i], "");
for(int j = 1; j <= dizi[i]; ++j) { // bir çubuk yazdır
printf("%c", '*');
 }
puts(""); // bir çubuğu yeni satır ile bitir
}
 }
 srand(time(NULL));// rastgele sayı üreticiyi başlat.
 char string1[]= "first";
 char string1[]= {'f','i','r','s','t','\n'};
 #include <stdio.h>
#define BOYUT 20
// main fonksiyonu programın çalışmasını başlatır
int main(void) {
char dizi1[BOYUT] = ""; // 20 karakterlik yer ayırır
char dizi2[] = "string literal"; // 15 karakterlik yer ayırır
printf("%s","Bir string girin(en fazla 19 karakter):");
scanf("%19s",dizi1);


}

/*int ages[]={1,2,3,4};
printf("%d",ages[2]);
sonuç 3 olur.*/
#include <stdio.h>
int main(void){
double avarage=0,numbers[3];
printf("Please enter three numbers:");
scanf("%lf%lf%lf",&numbers[0],&numbers[1],&numbers[2]);
avarage()/3;
printf("%lf\n",avarage);
// girilen 3 sayının ortalamasını dizilerle bulma

}
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(void){
int i=0,mysquare[20];
for(i=0;i<5;i++){
    mysquare[i]=i*i;
    printf("mysquare[%d]:%d\n",mysquare[i]);

}
}
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main (void){
    double myvalue,myarray[10];
    int choice,index;
    do{
    printf("make a choice (-1 to exit) ");
    printf()
    }while (/* condition */)
    {
        /* code */
    }   
}
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#define BOYUT 7
int main(void){
srand(time(NULL));
int frekans[BOYUT]={0};
for (int atis = 1; atis <= 60000000; ++atis) {
size_t yuz = 1 + rand() % 6;
++frekans[yuz];
}
 printf("%s%17s\n", "Yüz", "Frekans");
 for (size_t yuz = 1; yuz < BOYUT; ++yuz) {
 printf("%3zu%17d\n", yuz, frekans[yuz]);
 }     
}
char string1[]="first"
char string1[]={'f','i','r','s','t','\n'};
char string2[20]
scanf("%19s",string2)

#include <stdio.h>
#define BOYUT 5

int main(void){
int a[BOYUT]={2,6,4,8,10,12,89,68,45,37}
puts("Veri elemanları orijinal sırada");
for (size_t i = 0; i < BOYUT; i++)
{
printf("%4d",a[i]);
}
for (int gecis = 1; gecis < BOYUT; ++gecis) {
for(size_t i = 0; i < BOYUT- 1; ++i) {
if (a[i] > a[i + 1]) {
int gecici = a[i];
a[i]=a[i +1];
a[i+1] =gecici;
}
}
}
puts("\nVeri elemanları artan sırada");
for (size_t i = 0; i < BOYUT; ++i) {
printf("%4d", a[i]);
}
puts("");
}

#include <stdio.h>
#define BOYUT 100
int dogrusalArama(const int dizi[],anahtar,size_t boyut);
int main(void){
int a[BOYUT]={0};
for (size_t x = 0; x <BOYUT ; x++)
{
    
}



}
