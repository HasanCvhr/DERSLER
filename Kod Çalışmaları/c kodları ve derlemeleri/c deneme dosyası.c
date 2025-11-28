#include <stdio.h>

int main(void){
int ilk_sayi,ikinci_sayi;
int toplam ;
printf("Lütfen ilk sayiyi giriniz!");
scanf("%d",&ilk_sayi);
printf("Lütfen ikinci sayiyi giriniz!");
scanf("%d",&ikinci_sayi);
 toplam=ilk_sayi+ikinci_sayi ;
 printf("%d",toplam)
}
//ilk alıştırma: iki tam sayını toplamı.

#include <stdio.h>
int main(void);
{
int sayi;
printf("Lütfen ekrana bir tam sayı girniz!");
scanf ("%d",&sayi);
if(sayi%2==1)
    printf("tek");
else
    printf("çift");
}
//ikinci alıştırmamız: sayıların tekmi çift mi olduğunu kontrol eden algoritma.

#include<stdio.h>
int main(void);
{
int sayi;
int bir,on,yuz,bin,onbin;
printf("lütfen 5 basamaklı bir tam sayı giriniz.")
scanf("%d",&sayi);
onbin=sayi/10000%10;
bin= sayi/1000%10;
yuz= sayi/100%10;
on=sayi/10%10;
bir=sayi%10;
printf("%d\n",onbin);
printf("%d\n",bin);
printf("%d\n",yuz);
printf("%d\n",on);
printf("%d",bir);
}
//üçüncü alıştırmamız: 5 basamaklı bir tam sayinin basamak değerlerini ekrana yazdıran bir çalışma.

#include<stdio.h>
int main(void)
{
float anapara,faiz,oran;
int gun;
   printf("Lütfen anapara'nizin tutarini ekrana giriniz!");
   scanf("%f",&anapara);

   printf("Lütfen faiz oranini ekrana giriniz!");
   scanf("%f",&faiz);

   printf("Lütfen gun sayisini ekrana giriniz!");
   scanf("%f",&gun);
   printf("%f\t%f\t%d " anapara,faiz,gun);
   faiz = anapara * oran * gun / 365;
   printf("%.2f",faiz);
   
}
// dördüncü alıştırmamız: istenen değerleri girerek faiz oranını hesaplayan bir çalışma.

