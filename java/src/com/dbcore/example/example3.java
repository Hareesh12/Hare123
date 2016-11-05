package com.dbcore.example;

public class example3 {
public static void main(String[] args) {
// TODO Auto-generated method stub
for (int i=1; i<10; i += 2)
{
for (int k=0; k < (4 - i / 2); k++)
{
System.out.print(" ");
}
for (int j=0; j<i; j++)
{
System.out.print("*");
}
System.out.println("");
}
}
}
