/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Admin
 */
public class Mavenproject2 {

    public static void main(String[] args) {
    Carro carro1 = new Carro ("modelo","placa",1,3);
    Moto moto1 = new Moto ("modelo2","placa2",2,2);
    Veiculo v1 = new Veiculo("modelo3","placa3",3);
    carro1.exibirInfo();
    moto1.exibirInfo();
    v1.exibirInfo();
    }
}
