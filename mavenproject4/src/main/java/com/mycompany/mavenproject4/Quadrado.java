/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author Admin
 */
public class Quadrado extends Retangulo{
    double lado;

    public Quadrado(String nome, double largura, double altura,double lado) {
        super(nome, largura, altura);
        this.lado = lado;
        
    }
    
    @Override
    public void CalcularArea(){
    System.out.println("area ="+lado*lado);
    }
 
}
