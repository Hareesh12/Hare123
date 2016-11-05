package com.dbcore.example;

import java.util.Scanner;
public class example6 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner src= new Scanner(System.in);
System.out.println("Enter total number of element");
int x = src.nextInt();
int f1=0,f2=1,f3;
System.out.print(f1 + " ");
System.out.print(f2 + " ");
for(int i=3;i<=x;i++){
f3=f1+f2;
System.out.print(f3 + " ");
f1=f2;
f2=f3;
}
}
}
