package com.dbcore.example;

import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
public static void main(String[] args) {
Random randomNumGenerator = new Random();
for (int idx = 1; idx <= 10; ++idx){
int randomInt = randomNumGenerator.nextInt(100);
System.out.println("Random Number= "+randomInt);
}}}
