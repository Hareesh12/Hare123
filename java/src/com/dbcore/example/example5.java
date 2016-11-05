package com.dbcore.example;

import java.util.Scanner;
public class example5 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner src= new Scanner(System.in);
System.out.println("Enter the number for calculating factorial");
int x = src.nextInt();
int fact=1;
for(int i=x;i>1;i--){
fact=fact*i;
}
System.out.println("Factorial of " +x +" is " +fact);
}
}