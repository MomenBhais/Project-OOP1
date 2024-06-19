/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expressionapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EvaluaterExpression extends BooleanExpression {
    //الابن
    private static int count;
    
    
    
    public EvaluaterExpression(){
        
    } 

    public EvaluaterExpression(Expression exp, Variables var) {
        super(exp, var);
    }

    public EvaluaterExpression(Expression exp) {
        super(exp);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        EvaluaterExpression.count = count;
    }

    @Override
    public void setValueofexp(int valueofexp) {
        super.setValueofexp(valueofexp); 
    }

    @Override
    public int getValueofexp() {
        return super.getValueofexp(); 
    }
    
    

   @Override
    public boolean checker() {//from interface
       if (super.getExp()!=null)
           return true;
       else
           return false;
    }

    @Override
    public boolean logic(int val ) {// from abstract
      if(super.getValueofexp()==1)
          return true;
      else
          return false; 
}

    @Override
    public String toString() {
        return "EvaluaterExpression:"+ super.getExp()+"="+getValueofexp() ;
    }
    
    
    
    
}