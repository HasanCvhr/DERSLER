// #include <stdio.h>
// #include<string.h>
// struct Adress
// {
//     char mahalle [15];
//     char cadde[20];
//     char sokak[15];

// };
// struct ogrenci
// {
//    char  isim[20];
//    char soyisim[20];
//    int numara;
//    int yas;
//    struct Adress adres;
// };

// int main (void){
//  struct ogrenci ogrenci1;
//  strcpy(ogrenci1.isim,"Mustafa");
//  strcpy(ogrenci1.soyisim,"Baltaci");
//  ogrenci1.numara=132;
//  ogrenci1.yas=24;
//  strcpy (ogrenci1.adres.cadde,"Atatürk");
//  strcpy(ogrenci1.adres.mahalle,"Bahçelievler");
// printf("%s %s %d %d %s %s %s",ogrenci1.isim,ogrenci1.soyisim,ogrenci1.yas,ogrenci1.adres.cadde,ogrenci1.adres.mahalle);

// return 0;
// }
#include <stdio.h>
struct ogrenci{
    char isim[20];
    char soyisim[20];
    int numara;
};


int main(void){
    struct ogrenci ogrenciler[3];
    for(int i=0;i<3;i++){
        printf("%d ninci öğrencinin bilgilerini giriniz",i+1);
        scanf("%s %d %s",&ogrenciler[i].isim,&ogrenciler[i].numara,ogrenciler[i].soyisim);
    }
    for (int i = 0; i < 3; i++)
    {
        printf(" % dninci ogrencinin bilgileri %s %s %d\n",i+1,ogrenciler[i].isim,ogrenciler[i].soyisim,ogrenciler[i].numara);
    }
    
}
#include <stdio.h>
struct ogrenci{
    char isim[20];
    char soyisim[20];
    int numara;
};
void goster(struct ogrenci a){
    printf("Öğrencinin bilgileri : %s %s %d",a.isim,a.soyisim,a.numara);
}
int main(void){
struct ogrenci ogrenci1={"mustafa","coskun",150};
   goster(ogrenci1);



   
}
