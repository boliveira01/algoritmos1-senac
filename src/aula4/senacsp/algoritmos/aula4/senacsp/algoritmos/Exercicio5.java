/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4.senacsp.algoritmos;

import java.util.Scanner;

/**
 *Calcular a conta de consumo de energia elétrica de um consumidor, dado
o kWh consumido, de acordo com a tabela abaixo:
 * @author bruno.moliveira28
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double valor_kwh;
        double valor_da_conta;
        
        System.out.println("Digite o consumo em kWh");
        double consumo = sc.nextDouble();
        
        if (consumo <= 150) {
            valor_kwh = 0.20;
            valor_da_conta = valor_kwh * consumo;
            System.out.println("Valor da conta igual a R$ "+valor_da_conta);
            
        } else if (consumo >= 150 && consumo <500 ) {
            valor_kwh = 0.25;
            valor_da_conta = valor_kwh * consumo;
             System.out.println("Valor da conta R$:" + valor_da_conta);
        } else if (consumo >= 500) {
            valor_kwh = 0.30;
            valor_da_conta = valor_kwh * consumo;
             System.out.println("Valor da conta R$:" + valor_da_conta);
        }else {
            valor_kwh = 11.9;
            valor_da_conta = valor_kwh* consumo;
            System.out.println("Valor da conta R$:" + valor_da_conta);
           
            
        }
    }
}
