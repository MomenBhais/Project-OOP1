/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expressionapp;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public abstract class   BooleanExpression implements ExpressionInterface {
    //الاب
    
     private Negation neg;
    private And and;
     private Or or;
    private Expression exp;
    private Variables var;
private static int count;
private int valueofexp;
    public BooleanExpression() {
    }

    public BooleanExpression(Negation neg, And and, Or or) {
        this.neg = neg;
        this.and = and;
        this.or = or;
    }

    public BooleanExpression(Expression exp, Variables var) {
        this.exp = exp;
        this.var = var;
    }

    public BooleanExpression(Expression exp) {
        this.exp = exp;
        count++;
    }
    

    public BooleanExpression(Negation neg, And and, Or or,Variables var,int valueofexp, Expression exp) {
        this.neg = neg;
        this.and = and;
        this.or = or;
        this.exp = exp;
        this.valueofexp= valueofexp;
    }

    

    public void setExp(Expression exp) {
        this.exp = exp;
    }

    public Expression getExp() {
        return exp;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BooleanExpression.count = count;
    }

    public int getValueofexp() {
        return valueofexp;
    }

    public void setValueofexp(int valueofexp) {
        this.valueofexp = valueofexp;
    }

    public Variables getVar() {
        return var;
    }

    public void setVar(Variables var) {
        this.var = var;
    }
    

    
    
    @Override
    public String toString() {
        return " expression: " +", exp=" + exp ;
    }

    @Override
    public boolean checker() {//from interface
       if (this.exp!=null)
           return true;
       else
           return true;
    }
    
    
   public  abstract boolean logic(int val);//abstract

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.exp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BooleanExpression other = (BooleanExpression) obj;
        return Objects.equals(this.exp, other.exp);
    }
    
    
    
     
    


   
}
