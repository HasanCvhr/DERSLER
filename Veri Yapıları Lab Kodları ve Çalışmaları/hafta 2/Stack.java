
public class Stack {
    private int [] values;
    private int top;
    public Stack(int size){
        this.values=new int[size];
        this.top=-1;
    }
    public int Size(){
        return this.values.length;
    }
    public void clear(){
        this.top=-1;
    }
    public boolean isFull(){
        return this.top==this.values.length-1;
    }
    public boolean isEmpty(){
        return this.top==-1;
    }
    public int pop() throws Exception{
        if(isEmpty())
            throw new Exception("stack is empty");
        else{
//            int temp=this.values[this.top];
//            this.top--;
//            return temp;
            return this.values[this.top--];
                    
        }
    }
    
    public void push(int val){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }else{
            this.top=this.top+1;
            this.values[this.top]=val;
        }
    }
    public int peek() throws Exception{
           if(isEmpty())
            throw new Exception("stack is empty");
        else{
            return this.values[this.top];
        } 
    }
    public void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }else{
            int temp=this.top;
            while(temp!=-1){
                System.out.println(this.values[temp]);
                temp--;
            }
          
        }
    }
    
    
}





