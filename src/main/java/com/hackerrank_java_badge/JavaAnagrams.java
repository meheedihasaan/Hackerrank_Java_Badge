/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank_java_badge;

/**
 *
 * @author User
 */
public class JavaAnagrams {
    
    static boolean isAnagram(String a, String b){
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length()){
            return false;
        }
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0; i < a.length(); i++){
            freq1[a.charAt(i)-'a']++;
            freq2[b.charAt(i)-'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isAnagram("ANT", "NAT"));
    }
    
}
