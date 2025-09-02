package PriemeiroPeriodo;

public class ExercicioMtmDiscreta {
    public static void main(String[] args) {
        /*
        Uma loja concede desconto se:
        O cliente for estudante AND menor de 25 anos,
        OR se for idoso (≥ 60 anos),
        Mas NOT se ele já usou desconto na última compra.
         */

        boolean clienteEstudante = true;
        int idadeCliente = 20;
        boolean usadoDesconto = false;


        if (((clienteEstudante == true && idadeCliente < 25) || idadeCliente>=60) && !usadoDesconto){
            System.out.println("Então a loja concede desconto");
        }else{
            System.out.println("A loja não concede desconto");
        }
    }
}
