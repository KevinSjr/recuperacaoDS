/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author Admin
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo ("circulo",4.0);
       Quadrado q1 = new Quadrado("nome",2.0,2.0,2.0);
         Retangulo r1 = new Retangulo ("circulo",2.0,2.0);
       q1.CalcularArea();
       c1.CalcularArea();
       r1.CalcularArea();
    }
    
}
