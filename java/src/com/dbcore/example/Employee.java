package com.dbcore.example;

public class Employee {
String name;
int id;
public Employee(String name, int id){
this.name=name;
this.id=id;
}

public static void main(String[] args){
Employee[] emparray=new Employee[5];
emparray[0]=new Employee("Sandesh",1);
emparray[1]=new Employee("Sailesh",2);
emparray[2]=new Employee("Sairam",3);
emparray[3]=new Employee("Saikiran",4);
emparray[4]=new Employee("Sanath",5);
for(Employee employee:emparray){
System.out.println(employee.name+" "+employee.id);
}
}
}
