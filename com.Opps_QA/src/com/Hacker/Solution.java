package com.Hacker;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        if(S.length()>=1 && S.length()<=100)
        {
            if(start>=0 &&end<=S.length())
            {
                char[] a=S.toCharArray();
                int count=0;
                for(int i=0;i<a.length;i++)
                {
                    if(a[i]>='a'&&a[i]<='z'&&a[i]>='A'&&a[i]<='Z')
                    {
                        count++;
                    }
                }
                if(count==S.length())
                {
                    System.out.println(S.substring(start,end));
                }
                
            }
        }
    }
}