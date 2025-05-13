package aula12.senacsp.algoritmos;


public class Matriz {

    public static void main(String[] args) {
        //instanciando um array de forma direta
        int[][] matriz = {{1,-2,3},{4,-5,6},{7,-8,9}};

        float [][] salarios = new float[5][5];

        //acesso ao elemento
        System.out.println(matriz[2][2]);

        System.out.println(matriz);

        for (int i=0; i< matriz.length; i++) {
            for (int j=0; j < matriz[i].length;j++) {
                System.out.printf("matriz[%d][%d]: [%d]\n",i,j,matriz[i][j]);
            }
        }
        int soma = 0;
        //encontrar o somarotorio dos elementos da matriz
        for (int i=0;i < matriz.length; i ++) {
            for (int j=0;j<matriz[i].length;j++) {
                soma += matriz[i][j];

            }
        }
        System.out.println("somatório dos números = "+soma);

        int quantidade =0;
        for (int linha =0; linha < matriz.length; linha++) {
            for (int coluna=0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] <0) {
                    System.out.println("negativo" + matriz[linha][coluna]);
                    quantidade ++;
                }
            }
        }
        System.out.println("quantidade de negativos = "+ quantidade);

    }



}
