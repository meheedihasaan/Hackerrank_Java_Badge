/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hackerrank_java_badge;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author User
 */
public class JavaDateAndTime {
    
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.YEAR, year);
        String d = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
        return d.toUpperCase();
    }
    
    public static void main(String[] args) {
        System.out.println(findDay(2, 16, 2023));
    }
    
}
