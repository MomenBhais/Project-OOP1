/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expressionapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ExpressionApp {

    public static void main(String[] args) {
 
         Scanner scanner = new Scanner(System.in);
        
        // استقبال العبارة المنطقية من المستخدم
        System.out.println("أدخل العبارة المنطقية (مثال: A+B.C~D):");
        String expression = scanner.nextLine().toUpperCase();
       
        
        Expression o= new Expression(expression);
        BooleanExpression m=new EvaluaterExpression(o);
        
        // استقبال قيم المتغيرات من المستخدم
        System.out.println("أدخل عدد المتغيرات:");
        int numVariables = scanner.nextInt();
        Map<String, Boolean> variables = new HashMap<>();
        
        for (int i = 0; i < numVariables; i++) {
            System.out.println("أدخل اسم المتغير " + (i + 1) + ":");
            String varName = scanner.next().toUpperCase();
            System.out.println("أدخل قيمة المتغير " + varName + " (0 لـ false / 1 لـ true):");
            int value = scanner.nextInt();
            variables.put(varName, value == 1);
        }
        
        // تقييم العبارة المنطقية وعرض النتيجة
        boolean result = evaluateExpression(expression, variables);
        System.out.println("النتيجة: " + (result ? 1 : 0));
        
        scanner.close();
    }
    
    // دالة لتقييم العبارة المنطقية
    public static boolean evaluateExpression(String expression, Map<String, Boolean> variables) {
        // تحليل العبارة المنطقية وتقييمها
        String[] tokens = expression.split("\\+");
        boolean result = false;
        
        for (String token : tokens) {
            boolean termResult = evaluateTerm(token, variables);
            result = result || termResult;
        }
        
        return result;
    }
     
    // دالة لتقييم العبارة الفردية (مثل A.B~C)
    public static boolean evaluateTerm(String term, Map<String, Boolean> variables) {
        boolean termResult = true;
        String[] factors = term.split("\\.");
        
        for (String factor : factors) {
            if (factor.startsWith("~")) {
                String variable = factor.substring(1);
                boolean value = !variables.getOrDefault(variable, false);
                termResult = termResult && value;
            } else {
                boolean value = variables.getOrDefault(factor, false);
                termResult = termResult && value;
            }
        }
        
        
        return termResult;
         
        
        
    }
    
}

    
    
    
    

