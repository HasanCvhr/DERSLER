import java.util.Scanner;

public class Test{

    public static void main(System [] args ){

        Scanner input= new Scanner (System.in);
        int x,y,z,number;
        System.out.print("Lütfen 5 basamakli bir tam sayi giriniz:");
        number=input.nextInt();
        System.out.println("Birinci basamak"+ number/10000);
        System.out.println("ikinci basamak"+ number/1000%10);
        System.out.println("Üçüncü basamak"+ number/100%10);
        System.out.println("Dördüncü basamak"+ number/10%10);
        System.out.println("Beşinci basamak"+ number%10);
    }
}