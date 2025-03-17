/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7.senacsp.algoritmos;

import java.util.Scanner;

/**
 *
 * @author bruno.moliveira28
 */
public class exer1_cond_for {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();

        if (inicio < fim) {
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = fim; i <= inicio; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }

            }
        }
    }
}
