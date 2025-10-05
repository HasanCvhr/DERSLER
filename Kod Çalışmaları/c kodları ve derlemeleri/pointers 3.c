#include <stdio.h>
int main(void){
    int nd , *pd;
    nd=25;
    printf("nd degiskeninin adresi:%p\n",&nd);
    printf("nd degiskeninin tuttugu sayi:%d\n",nd);
    printf("pd pointerinin adresi:%p\n",&pd);
    printf("pd pointerinin tuttugu adres:%p\n",pd);
    printf("pd pointerinin tuttugu adresteki sayi:%d\n",*pd);
 /*Bu programda nd, integer tipi bir değişken, pd ise integer tipi bir değişkenin 
adresini tutan pointer tipi bir değişken olarak tanımlanmıştır*/
// nd degişkenine 25 değeri aktarılmıştır.sonra adres&nd kullanılarak görüntülenmiştir.

}
#include <stdio.h>
int main(void){
int x; 
int *p1, *p2; 
x=101; 
p1=&x; //x değişkeninin adresi p1 pointer'a aktarılıyor.
p2=p1; 
printf("x degiskeninin adresi: %p\n", p2); 
printf("x degiskeninin degeri: %d\n", *p2); 

}
#include <stdio.h>
int main(void){
    int x;
    int *ptr;
    ptr =&x;
    printf("Lütfen bir tam sayi giriniz:");
    scanf("%d",ptr);
    printf("Girdiğiniz tam sayi değeri:%d\n",x);
}
#include <stdio.h>
int main(void){
    int x;
    int *ptrx;
    double y;
    double *ptry;
    char z;
    char *ptrz;

}
printf(" int x değişkeninin genişliği :%d byte\n",sizeof(x));// 4byte
printf("*ptrx pointerinin genisligi    :%d byte\n",sizeof(ptrx)); // 4 byte
 printf("double y degiskeninin genisligi:%d byte\n",sizeof(y)); // 8 byte
 printf("*ptry pointerinin genisligi    :%d byte\n",sizeof(ptry)); // 4 byte
 printf("char z degiskeninin genisligi  :%d byte\n",sizeof(z)); //1 byte
 printf("*ptrz pointerinin genisligi    :%d byte\n",sizeof(ptrz)); // 4 
 // sizeof() karakteri değişkeninin bellekte kapladığı alal-nı gösterir.
 //++p ile dizilerde bir sonraki bloğa geçiş sağlanır.
 // ptrs=s;
 // ptrs=&s[0];
 #include <stdio.h>
int main(void){
    int a[10], i;
    int *pa;
    pa=&a[0];
    for(i=0;i<5;i++){
        printf("%d. sayiyi giriniz:",i+1);
        scanf("%d",&a[i]);

    }
    printf("\n");
    for(i=0;i<5;i++){
        printf("%d.sayi:%d\n0",i+1, *pa++);;

    }
}
 
#include <stdio.h> 
int main(void){
char a[80];
char *p;
p= &a[0];
printf("%p\n",&a[0]); //p ile &a[0] aynı şey
printf("%p\n",p);     //p+1 ile &a[1] aynı şey
printf("%p\n",&a[1]); 
printf("%p\n",p+1); 
printf("%p\n",&a[2]); 
printf("%p\n",p+2); 
a[0]='B';a[1]='i';a[2]='l';a[3]='g';a[4]='i';a[5]='\0'; 
a[6]='s';a[7]='a';a[8]='y';a[9]='a';a[10]='r'; 
while(*p)    /* while(*p != NULL) da yazılabilir */ 
printf("%c",*p++); 
printf("\n");
 }
#include <stdio.h> 
#include <ctype.h> 
void main() 
{ char cumle[80]; 
int i; 
printf("BUYUK harflerle bir cumle giriniz:\n"); 
gets(cumle); 
for(i=0; cumle[i]; i++) 
printf("%c", tolower(cumle[i])); 
printf("\n"); 
} 

#include <stdio.h> 
void main() 
{ int i[10], j; 
int *iptr; 
for (j=0; j<10; j++) 
i[j]=j; 
/* Dizinin başlangıç adresine erişmek için ilk  
elemanın adresi kullanılabilir &i[0] veya doğrudan */ 
iptr = i; 
for (j=0; j<10; j++)  
{ printf("%d ", *iptr); 
iptr++; 
} 
printf("\n"); /* iptr artık dizinin başını göstermez */ 
iptr = i; 
for (j=0; j<10; j++) 
printf("%d ", *(iptr+j)); 
printf("\n"); 
/* iptr hala dizinin başını gösterir */ 
} 