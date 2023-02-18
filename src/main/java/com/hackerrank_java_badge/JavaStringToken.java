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
public class JavaStringToken {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        s = s.trim();
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        String arr[] = s.split("[-, .!?@'_]+");
        System.out.println(arr.length);
        for(String token : arr){
            System.out.println(token);
        }
        
        scan.close();
    }
    
}
