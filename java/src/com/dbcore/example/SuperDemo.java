package com.dbcore.example;

public class SuperDemo{
int a,b;
public SuperDemo(int x, int y){
a=x;
b=y;
System.out.println("Super class constructor called ");
}
}
 class SubDemo extends SuperDemo{
int a,b;
public SubDemo(int x, int y){
super(10,20);
a=x;
b=y;
System.out.println("Sub class constructor called ");
}
public static void main (String[] args) {
SubDemo obj= new SubDemo(1,2);
}
}