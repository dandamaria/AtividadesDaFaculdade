package PriemeiroPeriodo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioMtmDiscreta {
    public static void main(String[] args) {
        /*
        Uma loja concede desconto se:
        O cliente for estudante e menor de 25 anos,
        ou se for idoso (≥ 60 anos),
        Mas em nenhum caso se ele já usou desconto na última compra.*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Você é estudante? (true/false)");
        boolean clienteEstudante = entrada.nextBoolean();
        System.out.println("Qual sua idade?");
        int idadeCliente = entrada.nextInt();
        System.out.println("Você já usou o desconto antes? (true/false)");
        boolean usadoDesconto = entrada.nextBoolean();

        if (((clienteEstudante && idadeCliente < 25) || idadeCliente>=60) && !usadoDesconto){
            System.out.println("Então a loja concede desconto");
        }else{
            System.out.println("A loja não concede desconto");
        }
    }
}
