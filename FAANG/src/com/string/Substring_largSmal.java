package com.string;

import java.util.Scanner;

public class Substring_largSmal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

	private static String getSmallestAndLargest(String s, int k) {
		String largest="";
		String smallest="";
		String current_substr=s.substring(0, k);
		largest=current_substr;
		smallest=current_substr;
		
		for(int i=1;i<=s.length()-k;i++){
		 current_substr=s.substring(i, i+k);
		 if (current_substr.compareTo(smallest)<0){
			 smallest=current_substr;
		 }
		 
		 if(current_substr.compareTo(largest)>0){
			largest=current_substr; 
		 }
		}
		return smallest+"\n"+largest;
	}
}
