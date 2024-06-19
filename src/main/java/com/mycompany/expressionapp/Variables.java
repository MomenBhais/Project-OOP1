/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expressionapp;

/**
 *
 * @author DELL
 */
public class Variables {
char var;
    public Variables() {
    }

    public Variables(char var) {
        this.var = var;
    }

    public char getVar() {
        return var;
    }

    public void setVar(char var) {
        this.var = var;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.var;
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
        final Variables other = (Variables) obj;
        return this.var == other.var;
    }

    
    
    
    @Override
    public String toString() {
        return "Variables{" + "var=" + var + '}';
    }
    
}
