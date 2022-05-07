package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {
    static boolean isAnagram(String a, String b) {
        char [] inp1=a.toUpperCase().toCharArray();
        Arrays.sort(inp1);
        char [] inp2=b.toUpperCase().toCharArray();
        Arrays.sort(inp2);
      if ( Arrays.equals(inp1, inp2))
        return true;

		return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

