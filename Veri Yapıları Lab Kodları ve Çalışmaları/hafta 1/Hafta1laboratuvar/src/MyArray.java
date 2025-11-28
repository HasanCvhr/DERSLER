import java.util.Arrays;

public class MyArray {
private int[] array;// sınıf değişkeni(instance variable) :Tam sayı dizisi
// constructor parametre olarak bir int dizi alır ve bu diziyi sınıfın kendi dizisine kopyalar.
public MyArray(int [] array){
this.array=Arrays.copyOf(array, array.length);
}
public int [] getArray(){
    return array;
}
public void setArray(int []array){
    this.array=Arrays.copyOf(array,array.length);
}

//Arrays.copyOf(orijinaldizi,uzunluk )orijinal dizi elemanlarının  yeni bir diziye kopyalar ve bu yeni diziye kopyalar.
public void display(){
    for (int i=0;i<array.length;i++){
 System.out.print(array[i]+"");
    }
}
public int min(){
    if(array.length<0){
        throw new IllegalStateException("dizi boş en küçük değer bulunamaz.");

    }
int enKucuk=array[0];
for(int i=0;i<array.length;i++){
    if(array[i]< enKucuk){
    enKucuk=array[i];
    }
}
    return enKucuk;
}
public int linearSearch(int sayi){
    for(int i=0;i<array.length;i++){
        if(array[i]==sayi){
            return i;
        }
    }
return-1;
}
public void bubbleSort(){
    for(int i=0;i<array.length-1;i++){
        for(int j=0;j<array.length-1-j;j++){
            if(array[j]<array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
    }
}
public int binarySearch(int sayi){
    int sol=0;
    int sag=array.length-1;
    while (sol<=sag){
        int orta=(sol+sag)/2;
        if(array[orta]==sayi){
            return orta;
        }
        if (array[orta]<sayi){
            sol=orta+1;
            
        }else{
            sag=orta-1;

        }
    }
    return -1;
}




}