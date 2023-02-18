/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank_java_badge;

/**
 *
 * @author User
 */
public class JavaStringCompare {
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int start = 0;
        int end = k;
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        while(end <= s.length()){
            String sub = s.substring(start, end);
            if(smallest.compareTo(sub) > 0){
                smallest = sub;
            }
            
            if(largest.compareTo(sub) < 0){
                largest = sub;
            }
            start++;
            end++;
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        System.out.println(getSmallestAndLargest(s, k));
    }
    
}
