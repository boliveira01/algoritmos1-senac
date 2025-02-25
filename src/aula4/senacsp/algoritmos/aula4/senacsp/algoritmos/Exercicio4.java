/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4.senacsp.algoritmos;

import java.util.Scanner;

/**
 *Dada a altura e o peso de uma pessoa, determinar seu grau de
obesidade. O grau de obesidade é determinado pelo índice da massa
corpórea (Massa = Peso / Altura2
) através da tabela abaixo:
 * @author bruno.moliveira28
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
  
        System.out.println("Informe a altura em cm");
        double altura = sc.nextFloat();
        
        System.out.println("Digite o peso em kg");
        double peso = sc.nextDouble();
        
        double  massa_corporea = altura / peso * 2;
        
        if (massa_corporea < 26) {
            System.out.println("Normal");
        }
        else if (massa_corporea >=26 && massa_corporea <=30) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obeso mórbito");
        }
           
    }
}

