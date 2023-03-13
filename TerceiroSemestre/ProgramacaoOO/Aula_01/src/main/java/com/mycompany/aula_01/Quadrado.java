/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_01;

import java.util.Scanner;

/**
 *
 * @author wallace.waraujo
 */
public class Quadrado {
    
    double lado, area; 
    
    void entrarLado(){
        Scanner oT = new Scanner(System.in);
        
        System.out.print("Lado:");
        lado = oT.nextDouble();
        
    }
    
    void calcularArea(){
        entrarLado();
        area = lado * lado;
        System.out.print("Area:"+area);
        
    }
}
