package PriemeiroPeriodo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrabalhoMtmDiscreta {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in); //objeto para chamar a função leitura da entrada de dados

        //objeto para chamar a função: operacao
        //como se fosse um "+" para chamar a função "soma"
        TrabalhoMtmDiscreta obj = new TrabalhoMtmDiscreta();

        //associando o valor da leitura com uma variável "limite"
        //como se fosse um leia(numero)
        int numero = valor.nextInt();

        //mostrando o resultado da função "operação" passando o valor numero que foi digitado como parâmetro
        System.out.println(obj.conjecturaCollatz(numero));

    }

    //função que realiza o algoritmo da conjectura de collatz de forma recursiva

    public int conjecturaCollatz(int n){
        if (n == 1){ //quando n é 1
            System.out.println("valor atual: 1");
            return 1;
        } else{
                if (n%2 == 0) { //quando n é par
                    System.out.println("valor atual: "+n);
                    System.out.println(n+" é par, então o programa irá fazer: "+n+"/2");
                    n = conjecturaCollatz(n/2); //chama a função dnv com o resultado (recursividade)
                    return n;
                } else { //quando n é ímpar
                    System.out.println("valor atual: "+n);
                    System.out.println(n+" é ímpar, então o programa irá fazer: "+n+"x3+1");
                    n = conjecturaCollatz(n*3+1); //chama a função dnv com o resultado (recursividade)
                    return n;
                }
        }
    }
}
