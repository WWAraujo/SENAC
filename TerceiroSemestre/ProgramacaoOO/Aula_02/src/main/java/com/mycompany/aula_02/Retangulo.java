/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_02;

import java.util.Scanner;

/**
 *
 * @author wallace.waraujo
 */
public class Retangulo {
    
    double base, altura, area; 
    
    void entrarBaseAltura(){
        Scanner oT = new Scanner(System.in);
        
        System.out.print("Base retangulo:");
        base = oT.nextDouble();
        
        System.out.print("Altura retangulo:");
        altura = oT.nextDouble();
    }
    
    void calcularRetangulo(){
        entrarBaseAltura();
        area = base * altura;    
        System.out.println("Area do retangulo: "+area);
    }
   
}
