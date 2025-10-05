#include <stdio.h>
#include <math.h>
int main()
{
// Bu Projenin Mimarı Hasan Cevahirdir.

   
   printf("Merhaba Dunya\n");
   printf("Bu bir\n C proglama\n dil dosyasidir."); 

   printf("1\t2\t3\t4\t5\n6\t7\t8\t9\n");
   print("\"barbeküde et yanina salata\"- ünlü sanatci cakal");

   /* veriable =programlama yaparken verilen bir değeri bilgisayarın hafızasında tutan
   ve istediğiniz yerde kullanmamızı sağlayan verilere denir. değişkenlere ulaşmak için bir 
   bir isim vermemiz gerekirve ne tür bir değişken kullanmakm istediğimizi belirtmemiz gerekir. */

   int x ;
   x =123 ,
   int  level=87;  // tam sayılar  %d
   float xp=12.05;// ondalık sayılar %f
   char server='A'; // tek krakter  %c
   char nick[]="Xaof"; // karakter dizisi  %s
   double              // floatın uzun versiyonu %lf
   bool e=true;  // bize ture yada false olarak geridönüş belirtir.
   unsigned int k= // tamamen pozitif değerlerle çalışmış oluyoruz.
   long long int // çok büyük aralık %lld


   printf(" merhaba %s\n",nick)
   printf(" Şuan bu %d sahipsiniz.\n",)
// %.1
//%1

float item1=5.75;
float item2=10.50;
float item3=100.75;

printf("Item1= %.3f $\n",item1); // virgülden sonra 3 basamağı gözükecek.
printf("Item2= %f $\n",item2);
printf("Item3= %f $\n",item3);



const float pi=3.1456372; // bu const değerimizi sabitler.
pi =169.876;






int sayi;
    int bir,on,yuz,bin,onbin;
    //12375
    printf("Lutfen bir sayi girin");
    scanf("%d",&sayi);
    onbin=sayi/10000%10;
    bin=sayi/1000%10;
    yuz=sayi/100%10;
    on=sayi/10%10;
    bir=sayi%10;
    printf("%d\n",onbin);
    printf("%d\n",bin);
    printf("%d\n",yuz); 
    printf("%d\n",on);
    printf("%d\n",bir);
     

//scanf("%d,&123")  
if("sayi%2==1");
printf("tek");
else 
printf("çift")

float item1= 5.75
float item2=10.75
float item3= 15.25
printf("item1= %10.2f $\n,item1");/* sol taraftan 10 adet boşluk bıraktı ve virgülden
sonra 2 basamak gözükecek eğer 10 nun başına ekai koyarsak sağ taraftan boşluk bırakacak.*/

printf("item2= %.2f $\n,item2");
printf("item3= %.2f $,item3");

const float pi=3.1;
pi= 1234.567;

print("%f",pi);

/*
int x
int y 

float z= x/(float) y sonucumuz tam çıkmayacağı için sonucu floata çevirdik.*/

int x=10
x += 2;  12
x -= 3;  7
x /= 2;  5
x %= 3;  1

// fgets ve scanf arasındaki temel fark;scanf boşlukları anlamıyor ancak fgets bunları algılayabiliyor


double A= sqrt(16); //karekök alma.=4
double B= pow(2,3);// üs alma.=8
float c= round(3.25) // sayıyı yakın olduğu tam sayıya yuvarlama.=8
int D= ceil(3.12) // sayıya bir üstündeki tam sayıya yuvarlar.=4
int E= floor(5.99) // sayıyı altındaki tam sayıya yuvarlar=5
int F= fabs(-24) // bir sayının mutlak değerini alırız=24
double G= log(5) // logaritme alır
double H= sin(45)
double J=cos(45) // trigonometrik fonksiyonların gösterimi
double K =tan(45)
double M= cot(45)


/* aynı zamanda buda bir deneme yorum satırıdır.*/
    return 0;
}
