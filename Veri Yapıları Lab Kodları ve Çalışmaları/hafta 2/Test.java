
public class Test {

    public static void display(int [] sayilar){
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }
        sayilar[0]=9;
    }
    public static int findMin(int [] numbers){
        int min=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(min>numbers[i])
                min=numbers[i];
        }
        return min;
    }
    public static int findLastMinIndex(int [] numbers){
        int minIndex=0;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[minIndex]>=numbers[i])
                minIndex=i;
        }
        return minIndex;
    }
    public static Stack copyStack(Stack stk) throws Exception{
        Stack copyStk=new Stack(stk.Size());
        Stack tempStk=new Stack(stk.Size());
        while(!stk.isEmpty()){
            tempStk.push(stk.pop());
        }
        while(!tempStk.isEmpty()){
            copyStk.push(tempStk.pop());
        }
        
        return copyStk;
    }
    public static void main(String[] args) throws Exception {
         
        Stack myStack=new Stack(5);
        myStack.push(5);
        myStack.push(2);
        myStack.push(6);
        myStack.push(12);
        myStack.pop();
        myStack.pop();
        myStack.display();
        Stack copy=copyStack(myStack);
        copy.display();
        myStack.display();
 
        
        
        
        
        
        
        
//        Kitap [] kitaplar=new Kitap[3];
//        kitaplar[0]=new Kitap(2010, 100);
//        System.out.println(kitaplar[0].toString());
        
//        int [] numbers=new int[5];
//        numbers[0]=5;
//        numbers[2]=3;
//        numbers[numbers.length-1]=numbers[0]+numbers[2];
//        //display(numbers);
//        //System.out.println(numbers[0]);//9
//        System.out.println(findMin(numbers));
//        
        
//        int [] nums=numbers;
//        display(nums);
//        nums[1]=4;
//        display(numbers);
//        nums=new int[4];
//        display(nums);
//        display(numbers);

//        Kitap kitap1=new Kitap(2000, 100);
//        System.out.println(kitap1.toString());
//        Kitap kitap2=new Kitap(2020, 200);
//        System.out.println(kitap2.toString());
//        Kitap kitap3=kitap1;
//        System.out.println(kitap3.toString());
//        kitap3.yil=2015;
//        System.out.println(kitap1.toString());
//        kitap1=null;
//        System.out.println(kitap1.toString());
//        System.out.println(kitap3.toString());
//        kitap3=null;

        
    }

 
}
