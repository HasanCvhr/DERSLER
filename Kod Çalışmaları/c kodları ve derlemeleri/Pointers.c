#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(void){
// pointers is a variable
int x=7;
printf("X in adresi %x\n",&x); // bilgisayardaki adresini gösteriyor.
printf("int:%d\n",sizeof(int));
printf("double:%d\n",sizeof(double));//sizeof ifadesiyle bellekteki kapladığı alanı görüntüleyebiliyoruz.
printf("float:%d\n",sizeof(float));
printf("char:%d\n",sizeof(char));
 return 0;   
}
// #include <stdio.h>
// #include <stdlib.h>
// #include <math.h>
// int main(void){
// int x=7;
// float y =3.14;
// double z =4.23456;
// char name='F';
// printf(" x variable:%d\n",x);
// printf("y variable:%f\n",y);
// printf(" z variable:%f\n",z);
// printf("name variable:%c\n\n",name);

// printf("x variable address:%x\n",&x);
// }

/* Her değişkenimiz bellekte bir yer kaplar, bu değişkenlerin belleğin neresinde
 tutulduğunu adresler ile tutarız. Bir değişkenimizin tutulduğu 
 adrese değişkenimizin başına “&” koyarak ulaşabiliriz.*/
// #include <stdio.h>
// int main () {

//    int  var1;
//    char var2[10];

//    printf("var1 degiskenimizin adresi: %x\n", &var1  );
//    printf("var2 degiskenimizin adresi: %x\n", &var2  );

//    return 0;
// }

// #include <stdio.h>
// int main(void){
// int var=20;
// int *ip;
// ip= &var;
// printf("var değişkenimizin adresi %x\n",&var);
// /*var degiskenimizin adresi: bffd8b3c
// ip işaretçisinde saklanan adres: bffd8b3c
// *ip değişkeninin değeri: 20*/
// int *ptr=NULL;
// printf("ptr isaretcisinin degeri%x\n",ptr);
// // ptr isaretcisinin degeri 0 çıktısını alırız
// }

// if(ptr)     /* ptr işaretçisi boş değilse true döner */
// if(!ptr)    /* ptr işaretçisi boşsa true döner */
// // bir işaretcinin boş olup olmadığını kontrol etme şekli

//  // Bir tam sayı (integer) işaretçimiz (ptr) olduğunu ve bu işaretçimizin adresi 1000
//  //olan bir tam sayıyı işaret ettiğini düşünelim. Tam sayımızın 32-bit 
//  //olduğunu varsayarak aşağıdaki işlemi yaptıktan sonra ne olacağını tahmin edebilir misiniz?
//  //ptr++ işleminden sonra değeri 1004 olacaktır.
// // bunun sebebi işaretci her arttığında boyutu kadar artacaktır.
// // char++ olsaydı 1001 olacaktı.
// int* p1;
// int* p2;
// int* p1,p2;

// int* pc, c;
// c = 5;
// pc = &c;
// printf("%d", *pc);   // Çıktısı: 5
// // İŞARETCİLER VE DİZİLER
// #include <stdio.h>
// int main(void){
//     int x[4];
//     int i;
//     for(i=0;i<4;i++){
//         printf("&x[%d]=%p\n",i,&x[i]);

//     }
// printf("Address of array x:%p",x);
// return 0;
// }
// //Temel olarak, & x [i], x + i’ye eşittir ve x [i], * (x + i) ‘ye eşdeğerdir.
// #include <stdio.h>
// int main(){
//     int i,x[6],sum=0;
//     printf("6 sayı giriniz");
//     for(int i=0;i<6;i++){
//         scanf("%d",x+1);
//     sum +=*(x+i);
//     }
//     printf("toplam=%d",sum);
//     return 0;
// }
// #include <stdio.h>
// int main()
// {
//   int x[5] = {1, 2, 3, 4, 5};
//   int* ptr;
//   ptr=&x[2];
//   printf("*ptr = %d \n", *ptr);   // 3
//   printf("*ptr+1 = %d \n", *ptr+1); // 4
//   printf("*ptr-1 = %d", *ptr-1);  // 2
//   return 0;

// }
// #include <stdio.h>
// int main(void){
// int i=5;
// int *p = &i;
// printf("%p",p); // adresini gösterir
// printf("%d",*p);// değeri gösterir
// // & değişkenin adres bilgisini verir
// // * adresteki değeri verir
// }
// #include <stdio.h>
// int main(void){
//     int a=5,*ap;
//     float b =3.2 ,* bp;
//     double c=3.423,*cp ;
//     char d='a',*dp;
//     int sayilar[5]={1,2,3,4,5};
//     int *arrayp;
//     ap=&a;
//     bp=&b;
//     cp=&c;
//     dp=&d;
//     arrayp=&sayilar[1];
    
// printf("%p adresindeki değeri % d dir.\n",ap,*ap);
// printf("%p adresindeki değeri % f dir.\n",ap,*ap);
// printf("%p adresindeki değeri % lf ir.\n",ap,*ap);
// printf("%p adresindeki değeri % c dir.\n",ap,*ap);
// }
// #include <stdio.h>
// int main(void){
//     int i,j=1;
//     int *jp1,*jp2=&j;
//     jp1=jp2;
//     i=++*(jp2);
//     *jp2=*jp1+i;
// }
// #include <stdio.h>
// void degerdegistir(int a, int b){
//     int gecici=a ;
//     a=b;
//     b=gecici;
//     printf("a:%d,b:&d")
// }
// int main(void){
//     int x=5 , y=10;


    
    
    
    
//     return 0;

// }

