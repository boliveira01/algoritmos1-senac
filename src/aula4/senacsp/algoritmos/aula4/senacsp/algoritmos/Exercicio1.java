
package aula4.senacsp.algoritmos;

import java.util.Scanner;

/**
 *
 * @author bruno.moliveira28
 */
public class Exercicio1 {
    public static void main(String[] args) {
       /* Cria objeto da classe Scanner chamado sc */
        Scanner sc = new Scanner(System.in);
        float p1=0.2f, p2=0.3f, p3=0.5f;
        int limite_de_faltas = 15;
        boolean status;
                
       
       System.out.println(" ++ CALCULA A MÉDIA ++ ");
       
       System.out.println("Nome: ");
       String nome = sc.next();
       
       System.out.println("Digite o valor da nota 1");
       float n1 = sc.nextFloat();
               
       System.out.println("Digite o valor da nota 2");
       float n2 = sc.nextFloat();
              
       System.out.println("Digite o valor da nota 3");
       float n3 = sc.nextFloat();
       
        System.out.println("Digite  a quantidade de faltas do aluno");
       
       float media = ((n1*p1)+(n2*p2)+ (n3*p3));
               
        System.out.printf("%s, \nsua média foi : %.1f \n", nome ,media);
        
        if ((media >= 6) && (limite_de_faltas<=18)) {
            System.out.println("Aluno [APROVADO] por falta e nota!");
            status = true;
        } else if ((media<=6 && limite_de_faltas <=18)){
            System.out.println("Aluno [REPROVADO] por NOTA e aprovado por falta ! Segue para recuperação de matéria");
            status = false;
        }  else {
            System.out.println("ALUNO REPROVADO POR FALTA!");
            status = false;
        }
    }
}
