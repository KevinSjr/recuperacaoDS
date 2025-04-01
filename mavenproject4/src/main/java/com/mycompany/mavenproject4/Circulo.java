/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author Admin
 */
public class Circulo extends Forma{
    double raio;

    public Circulo(String nome,double raio) {
        super(nome);
        this.raio = raio;
        
    }
    public void CalcularArea(){
    System.out.println("Area circulo: "+3.14*raio/2);
    }
}
