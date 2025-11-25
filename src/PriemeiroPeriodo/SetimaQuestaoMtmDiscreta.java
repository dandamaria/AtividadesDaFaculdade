package PriemeiroPeriodo;

import java.util.Random;
import java.util.Scanner;

public class SetimaQuestaoMtmDiscreta {
    public static void main(String[] args) {

        SetimaQuestaoMtmDiscreta obj = new SetimaQuestaoMtmDiscreta();
        Random num = new Random();
        Scanner condicao = new Scanner(System.in);
        boolean sair = false;

        for (int i = 0; i < 20; i++) {
            int n = num.nextInt(65);
            System.out.println("soma de 1 até "+n+": "+obj.somaNaturais(n));
        }


    }
    int somaNaturais(int n){
        if (n==1){
            return 1;
        }else {
            return (n+somaNaturais(n-1));
        }

    }
}
