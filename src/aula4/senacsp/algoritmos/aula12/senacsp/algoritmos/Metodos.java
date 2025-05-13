package aula12.senacsp.algoritmos;

import java.util.Scanner;

public class Metodos {
    //criar uma matriz (mxn)
    public static int[][] CriarMatriz(int linha, int coluna) {
        System.out.println("*-- Criando Matriz --*");
        Scanner sc = new Scanner(System.in);

        //instanciando a maktriz
        int[][] matriz = new int[linha][coluna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d]", i, j);
                matriz[i][j] = sc.nextInt();

            }
        }
        return matriz;
    }

    public static void ImprimitMatriz(int[][] matriz) {
        System.out.println("*-- IMPRIMINDO A MATRIZ --*");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d]\n", i, j, matriz[i][j]);
            }

        }


    }

    public static int somatorio(int[][] matriz) {
        System.out.println("Somatorio");
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static int qtdeNegativos(int matriz[][]) {
        System.out.println("Quantidade de negativos");
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; i < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int[] definirTamanho() {
        System.out.println("DEFININDO TAMANHO DA MATRIZ");
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [2];

        System.out.println("Digite o tamanho de linhas da matriz");
        vetor[0] = sc.nextInt();

        System.out.println("Digite o tamanho de colunas da matriz");
        vetor[1] = sc.nextInt();

        return vetor;
    }


    public static void main(String[] args) {
        int [] v = definirTamanho();
        int [][] matriz = Metodos.CriarMatriz(v[0],v[1]);

        ImprimitMatriz(matriz);

        System.out.println("Somatorio: " + somatorio(matriz));

        System.out.println("Contador de negativos" + qtdeNegativos(matriz));





    }
}


