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
public class JavaString {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        
        int sum = A.length()+B.length();
        boolean isGreater = false;
        for(int i = 0; i < A.length() && i < B.length(); i++){
            if(A.charAt(i) > B.charAt(i)){
                isGreater = true;
                break;
            }
            else{
                isGreater = false;
                break;
            }
        }
        
        String a = A.toUpperCase();
        String b = B.toUpperCase();
        A = a.substring(0, 1)+A.substring(1);
        B = b.substring(0, 1)+B.substring(1);
        
        System.out.println(sum);
        if(isGreater){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(A+" "+B);
        
    }
    
}
