#include <stdio.h>

int main(void){

double pi=3.141519;
double radius;
double circumference;
double area;
printf("\n Dairenin yaricapini giriniz: ");
scanf("%lf",&radius);
circumference=2*radius*radius;
area=pi*radius*radius;

printf("\n dairenin çevresi: %lf", circumference);
printf("\n dairenin alani= %lf",area);
 
 return 0;
}

