/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4.senacsp.algoritmos;

import java.util.Scanner;

/**
 *
 * Dados dois números, verificar se a divisão do primeiro número pelo
segundo é exata (o resto da divisão deve ser igual a 0). Se for, o
algoritmo deve imprimir a mensagem “A divisão de (número 1) por
(número 2) é exata”.
 * @author bruno.moliveira28
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
          System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();
        
        if (num1 % 2 == 0) {
            System.out.println("“A divisão de" +num1 +" por\n" +
num2+" é exata.");
        }else {
            System.out.println("A divisão não é exata");
        }
        
    }
}
