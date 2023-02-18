/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank_java_badge;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaStringReverse {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = true;
        for(int i = 0; i <= A.length()/2; i++){
            if(A.charAt(i) != A.charAt(A.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        
        if(isPalindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
