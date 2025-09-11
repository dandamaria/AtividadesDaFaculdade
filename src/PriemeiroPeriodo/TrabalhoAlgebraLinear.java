package PriemeiroPeriodo;

import java.util.Scanner;

public class TrabalhoAlgebraLinear {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] a = new int[2][2];
        double[][] b = new double[2][2];
        double[][] c = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = entrada.nextInt();
            }
        }

        System.out.println("---matriz inserida---");
        System.out.println(a[0][0] +" "+ a[0][1]);
        System.out.println(a[1][0] +" "+ a[1][1]);

        //determinate
        int det = (a[0][0]*a[1][1]) - (a[0][1]*a[1][0]);

        //determinate = 0 então a inversa não existe;
        if(det ==0) {
            System.out.println("a inversa dessa matriz não existe");
        }else{
            b[0][0] = a[1][1];
            b[0][1] = (-1) * a[0][1];
            b[1][0] = (-1) * a[1][0];
            b[1][1] = a[0][0];

            System.out.println("---matriz com as posições trocadas---");
            System.out.println(b[0][0] +" "+ b[0][1]);
            System.out.println(b[1][0] +" "+ b[1][1]);

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    c[i][j] = b[i][j]/det;
                }
            }

            System.out.println("---matriz inversa---");
            System.out.println(c[0][0] +" "+ c[0][1]);
            System.out.println(c[1][0] +" "+ c[1][1]);
        }
    }
}
