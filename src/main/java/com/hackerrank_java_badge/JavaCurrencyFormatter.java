/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank_java_badge;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author User
 */
public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat f1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = f1.format(payment);
        
        NumberFormat f2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = f1.format(payment);
        
        String india = us;
        StringBuilder sb = new StringBuilder(india);
        sb.setCharAt(0, '.');
        sb.insert(0, "Rs");
        india = sb.toString();
        
        NumberFormat f3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = f3.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
}
