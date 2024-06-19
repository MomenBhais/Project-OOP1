/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expressionapp;

/**
 *
 * @author DELL
 */
public class Expression {
   private String exp;

    public Expression() {
    }

    
    public Expression(String exp) {
        this.exp = exp;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Expression:" + "exp=" + exp ;
    }
    
}
