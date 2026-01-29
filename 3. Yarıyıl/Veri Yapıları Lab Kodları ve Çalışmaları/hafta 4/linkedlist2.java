public class linkedList < T extends Comparable<T>>
 {
    Node <T> head;
    public linkedList()
    {
        head = null;
    
}
public void addToFront ( T val)
{
    Node <T> newNode = new Node<>(val);
    newNode.next = head;
    head = newNode;
}
public void addafterHead ( T val)
{
Node <T> newNode= new Node <>(val);
if(head==null){
head =newNode;

}else{
    newNode.next=head.next;
    head.next=newNode;
}
 }
public void printList(){
    Node <T> current = head;
    while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
    }
    System.out.println();
}
/**
 * @param val
 */
public void deleteNode(T val){
    if(head==null) return;
    if(head.data.equals(val)){
        head=head.next;
        return;
    }
    Node <T> current = head;
    while(current.next!=null && !current.next.data.equals(val)){
        current=current.next;
    }
    if(current.next!=null){
        current.next=current.next.next;
    }
}
 }