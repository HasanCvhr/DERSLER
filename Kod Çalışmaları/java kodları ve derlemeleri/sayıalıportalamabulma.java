import java.util.Scanner;

public class Test{

public static void main(String[] args){
System.out.println("hello");
Scanner input= new Scanner (System.in);
System.out.print("İsminizi giriniz:");
String name=input.nextline();
System.out.println(name);
int x,y,z;
System.out.println("Birinci sayiyi giriniz:");
x=input.nextInt();
System.out.println("ikinci sayiyi giriniz:");
y=input.nextInt();
System.out.println("Üçüncü sayiyi giriniz:");
z=input.nextInt();
Systemm.out.println((x+y+z)/3);
}
}