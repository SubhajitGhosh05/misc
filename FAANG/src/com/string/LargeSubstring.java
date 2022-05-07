package com.string;

public class LargeSubstring {
	public static void main(String[] args) {
		String str = longestWord("This is the bestii i see");
		System.out.println(str);
	}

	static String longestWord(String text) {
		String[] wordArray = text.split(" ");
		int maxLength = 0;
		String result = "";
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].length() > maxLength) {
				maxLength = wordArray[i].length();
				result = wordArray[i];
			}
		}
		return result;
	}

}

/*
 * 
 * public class HelloWorld{
 * 
 * public static void main(String []args){ String
 * str="Do you know what is d hizenbarg's principle?"; String
 * strArr[]=str.split(" "); String maxmin=MaxMin(strArr);
 * System.out.println(maxmin); }
 * 
 * static String MaxMin(String [] strArr){ int maxLen=0; int
 * minLen=strArr[0].length(); String maxStr="",minStr=""; for(int
 * i=0;i<strArr.length-1;i++){ if (strArr[i].length()>maxLen){
 * maxLen=strArr[i].length(); maxStr=strArr[i]; } if
 * (strArr[i].length()<minLen){ minLen=strArr[i].length(); minStr=strArr[i]; } }
 * return maxStr+"\n"+minStr; } }
 * 
 */