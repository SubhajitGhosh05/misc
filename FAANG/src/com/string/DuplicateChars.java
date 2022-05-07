package com.string;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateChars {
public static void main(String[] args) {
	System.out.println("Enter the String:: ");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char []ch=str.toCharArray();
 dupchar(str,ch);
}
 static  void dupchar(String str, char [] ch) {
HashSet<Character> hs= new HashSet<>();
for(Character x:ch){
	if(!hs.add(x)){
		System.out.println("Duplicate char is "+x );
	}
}
		
}
 
}
