package com.dbcore.example;

import java.io.*;
class magicno
{
public static void main(String[] args)throws Exception
{
int i,j;
magicno obj=new magicno();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a number");
i=Integer.parseInt(br.readLine());
while((j=obj.magic(i))!=10) {
i=j;
}

if ( j==1){
System.out.println("It is a magic number ");
}else{
System.out.println("Not a magic number");
}
}


int magic(int n)
{
if(n==10){
return n;}
else{
return n%10+ magic(n/10);
}
}
}