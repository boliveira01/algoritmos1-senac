/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4.senacsp.algoritmos;

import java.util.Scanner;

/**
 *
 * Dado um número, verificar se ele é maior que 100. Se for, o algoritmo
deve somar 150 a esse número. No final, imprimir o resultado da soma.
 * @author bruno.moliveira28
 */
public class Exercicio2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int numero = sc.nextInt();
        
        if (numero > 100) {
            System.out.println("Numero digitado =" + numero + "somando + 150 a ele  . . .");
            numero += 150;
            System.out.println("Resultado = "+numero);
        } else {
                    System.out.println("Numero menor que 100");
                         
                    }
            
        }
    }

