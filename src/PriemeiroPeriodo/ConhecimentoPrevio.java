package PriemeiroPeriodo;

public class ConhecimentoPrevio {
    public static void main(String[] args) {
        //Esses seriam conhecimentos básicos para entender o código da atividade
        //Aqui é o início, tudo que tiver // ou /// antes é comentário

        ///variáveis primitivas

        int numInteiro = 100;
        boolean valorLogico = true;
        double numDecimal = 10.45;
        String texto = "String não é do tipo primitivo mas é um tipo de variável muito utilizado e" +
                "básica. Ela serve pra textos";

        ///operadores lógicos
        // && -> E
        // | -> OU
        // ! -> NOT (retorna o valor contrário, se for true = false, se for false = true)
        // == -> compara se é igual (um só "=" atribui o valor, dois "==" compara se é igual)
        //boolean é como se fosse : logico no VisuAlg
        boolean expressaQualquer = (numInteiro>2 && numInteiro<1000 || numDecimal == 10.00); //isso irá retornar false

        ///condicionais
        // if -> se
        // { } -> então seria a ação aqui dentro
        // else -> caso contrário

        ///coisas da linguagem
        /*
        precisa sempre colocar ponto e vírgula depois de tudo (ou quase tudo);
        essa estrutura "public class void mais..." que tem no início é pq essa linguagem é orientada a objeto, as classes
        são como se fossem esses objetos, em geral pra gente, não importa entender isso agora, mas
        pra funcionar o código tem que estar dentro dessa estrutura;
         */

        System.out.println("Isso é uma 'coisa' que eu estou chamando pra escrever algo");
        //é como se fosse o escreval(" ")


    }
}
