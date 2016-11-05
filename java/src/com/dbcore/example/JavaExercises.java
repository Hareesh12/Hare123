package com.dbcore.example;

public class JavaExercises { 
	public static void main(String[] args) {
		printCharacters(); 
		} 
	static void printCharacters(){ 
		int i =1;
		do {
			System.out.print((char)i+"\t");
if (i % 10 == 0)
	System.out.println("");
i++;
}while(i<=122);
		}
	}
