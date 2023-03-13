/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_03;

/**
 *
 * @author wallace.waraujo
 */
public class Equacao2Grau {
    
    boolean continuar = true;
    double a, b, c, delta, x1, x2;
    
    void calcularDelta (double pa, double pb, double pc){
        
        a = pa;
        b = pb;
        c = pc;
        
        delta = Math.pow(-b, 2) - 4 * a *c;
    }
    
    void calcularRaiz() {
        if(delta >= 0){
            x1 = (-b  + Math.sqrt(delta)) / 2 * a;
            x2 = (-b  - Math.sqrt(delta)) / 2 * a;
            System.out.printf("X1: %.2f. \nX2: %.2f",x1, x2);
        }else{
            System.out.println("Não existem raizer reais");
        }
    }
    
}
