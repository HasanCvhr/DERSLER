import java.util.*;
public class Test{
    public static int toplam(int [] numbers){
        int result=0;
        for(int i =0;i<numbers.length;i++){
            result=result+numbers[i];
        }
     return result ;
    }

    public static void main(String[]args){
        // int [] values={1,2,3,4,5};
        // int x=values[1];
        // System.out.println(x);
        // values[1]=8;
        // System.out.println(x);
        // for(int y =1;i<values.length;y++){
        //     System.out.println(values[i]);
            
        // }  
       int [] values={1,2,3,4,5};
       int sonuc=toplam(values);
       System.out.println(sonuc);
    }
}