package PriemeiroPeriodo;

import java.util.Scanner;

public class TrabalhoAlgebraLinear {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //declarção das variáveis (as matrizes)
        double[][] a = new double[2][2]; //matriz inicial
        double[][] b = new double[2][2]; //matriz adjunta
        double[][] c = new double[2][2]; //matriz inversa

        //ENTRADA DOS NÚMEROS QUE FORMAM A MATRIZ
        /*
        a[0][0] = entrada.nextInt();
        a[0][1] = entrada.nextInt();
        a[1][0] = entrada.nextInt();
        a[1][1] = entrada.nextInt();
         */

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = entrada.nextInt();
                //leia(a[i][j])
            }
        }

        System.out.println("---matriz inserida---");
        System.out.println(a[0][0] +" "+ a[0][1]);
        System.out.println(a[1][0] +" "+ a[1][1]);

        //determinate
        double det = (a[0][0]*a[1][1]) - (a[0][1]*a[1][0]);

        //determinate = 0 então a inversa não existe;
        if(det ==0) {
            System.out.println("a inversa dessa matriz não existe");
        }else{
            //cria a matriz adjunta
            b[0][0] = a[1][1];
            b[0][1] = (-1) * a[0][1];
            b[1][0] = (-1) * a[1][0];
            b[1][1] = a[0][0];

            System.out.println("---matriz adjunta---");
            System.out.println(b[0][0] +" "+ b[0][1]);
            System.out.println(b[1][0] +" "+ b[1][1]);

            //MATRIZ INVERSA = CADA ELEMENTO DA MATRIZ ADJUNTA / DETERMINANTE
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    c[i][j] = b[i][j]/det;
                }
            }

            /*
            c[0][0] = b[0][0]/det;
            c[0][1] = b[0][1]/det;
            c[1][0] = b[1][0]/det;
            c[1][1] = b[1][1]/det;
             */

            System.out.println("---matriz inversa---");
            System.out.println(c[0][0] +" "+ c[0][1]);
            System.out.println(c[1][0] +" "+ c[1][1]);
        }
    }
}
