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
public class JavaSubstring {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String ans = S.substring(start, end);
        System.out.println(ans);
    }
    
}
