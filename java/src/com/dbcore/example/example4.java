package com.dbcore.example;

import java.util.Scanner;
public class example4 {
static int fact(int n){
if(n==1)
return 1;
else
return n*fact(n-1);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner src= new Scanner(System.in);
System.out.println("Enter the number for calculating factorial");
int x = src.nextInt();
System.out.println("Factorial of " +x +" is " +fact(x));
}
}
