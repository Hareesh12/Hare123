package com.dbcore.example;

import java.util.Arrays;
import java.io.*;
public class AnagramCheck {
/* * To check if two Strings are anagram or not in Java * This method assumes that both word and anagram are not null and lowercase * @return true, if both Strings are anagram. */
public static boolean iAnagram(String word, String anagram)
{
char[] charFromWord = word.toCharArray();
char[] charFromAnagram = anagram.toCharArray();
Arrays.sort(charFromWord);
Arrays.sort(charFromAnagram);
return Arrays.equals(charFromWord, charFromAnagram);
}
public static void main(String[] args)
{
AnagramCheck anacheck=new AnagramCheck();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter first string");
String str1=br.readLine();
System.out.println("enter second string"); String str2=br.readLine();
if(anacheck.iAnagram(str1,str2))
System.out.println("Strings are Anagram ");
else
System.out.println("Strings are not Anagram");
}
}