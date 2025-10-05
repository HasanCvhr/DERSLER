/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hceva
 */
public class Rectangle {
    private int longEdge;
    private int shortEdge;
    public Rectangle(int lEdge,int sEdge){
        if(lEdge>sEdge){
            setShortEdge(sEdge);
            setLongEdge(lEdge);
            }
        else{
            setLongEdge(sEdge);
            setShortEdge(lEdge);
        }
    }
public int perimeter(){
    return 2*(this.getShortEdge()+this.getLongEdge());
}
   public int area(){
       return(this.getShortEdge()*this.getLongEdge());
   }
    public int getLongEdge(){
    return longEdge;
}
public void setLongEdge(int longEdge){
    if(longEdge>=0){
        this.longEdge=longEdge;
        }
        this.longEdge=longEdge;
}
public int getShortEdge(){
    return  shortEdge;
}
public void setShortEdge(int shortEdge){
    if(shortEdge>0){
        this.shortEdge=shortEdge;
    }
     this.shortEdge=shortEdge;
}
}
