/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author Admin
 */
public class Mavenproject3 {

    public static void main(String[] args) {
       Funcionario func1 = new Funcionario("nome",1,2.0);
       Gerente g1 = new Gerente ("nome2",1,2.0,"departamento");
     Desenvolvedor ds1 = new Desenvolvedor("nome3",1,2.0,"jazv");
     ds1.exbirInfo();
     g1.exbirInfo();
     func1.exbirInfo();
    }
}
