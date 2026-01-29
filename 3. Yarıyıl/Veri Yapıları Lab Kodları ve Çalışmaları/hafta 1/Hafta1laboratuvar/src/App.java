public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    int [] bosDizi={};
    MyArray bosMyArray=new MyArray(bosDizi);
    try{
        bosMyArray.min();
    }catch(IllegalStateException e){
        System.out.println("Hata yakalandi:"+e.getMessage());
    } 
    int [] sayilar={5,2,8,1,9,3};
    MyArray myArray=new MyArray(sayilar);
//     MyArray.display;
//     System.out.println("en küçük sayı:"+MyArray.min());
// 
}
}
