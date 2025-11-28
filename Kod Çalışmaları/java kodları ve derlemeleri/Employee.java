
package com.mycompany.employee;
/**
 *
 * @author hceva
 */
public class Employee {
     private String name;
     public double salary;
     private int workHours,hireYear;
    
Employee(int hireYear,int workhours,double salary,String name){//constractor
   this.name=name;
   this.hireYear=hireYear;
   this.salary=salary;
   this.workHours=workHours;
}
public double tax(){
    if(this.salary>=1000){
        return 1000*0.03;
    }else{
        return 0.0;
    }
}


public double bonus(){
  int extrahours=this.workHours-40;
  if(extrahours>0){
      return 30*extrahours;
  }
}
public double increase(){
    int year=2025-this.hireYear;
    if(year<10){
        return salary*0.05;
    }else if(year>=10 && year<20){
        return salary*0.10;
    }else{
        return salary*0.15;
    }
}
public void toString(Employee emp){
      Employee emp1= new Employee(1985,45,2000.0,"Kemal");
        System.out.println("tax:"+emp1.tax());
        System.out.println("bonus:"+emp1.bonus());
        System.out.println("İncrease Salary:"+emp1.increase());
        double totalSalary=emp1.salary-emp1.tax()+emp1.bonus();
       System.out.println("Total salary with tax and bonus:"+totalSalary);
    System.out.println("Total salary with the raise of salary:"+(emp1.salary+emp1.increase()));
}
}