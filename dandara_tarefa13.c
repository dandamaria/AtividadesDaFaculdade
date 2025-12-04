#include <stdio.h>
#define TAM 8
/** Exemplo 11
Desenvolva um programa que registre informações de 8 pessoas, utilizando arrays. 
Para cada pessoa, devem ser armazenados: 
CPF composto por 4 números inteiros (ex.: 1234, 5678);
Sexo (1 = F, 2 = M);
Idade; 
Estado civil (1 = S, 2 = C)
Salário. 
Durante o cadastro, o programa deve impedir que o usuário digite:
valores inválidos para sexo (somente 1 ou 2); 
valores inválidos para estado civil (somente 1 ou 2);
idade negativa; 
salário acima ou igual ao salário mínimo; 
CPF já cadastrado (opcional, mas recomendável).
Se o usuário digitar algo inválido, o programa deve pedir novamente até estar correto.

O programa deve apresentar o menu a seguir:
1) Cadastrar pessoas
2) Listar todas as pessoas cadastradas
3) Quantidade de mulheres idosas e solteiras que tenham salário maior que R$ 3.800,00.
4) Média salarial dos homens casados que tenham idade entre 18 e 30 anos
5) Idade da pessoa com o maior salário entre todas
6) Procurar uma pessoa pelo CPF e exibir seus dados, caso o CPF exista
7) Editar os dados de uma pessoa pelo CPF
8) Excluir uma pessoa pelo CPF
999) Sair
*/

int main() {

    int sexo[TAM], idade[TAM], estCivil[TAM], cpfs[TAM];
    float salario[TAM];
    int opcao, sair=0;
    int i = 0;
    do {
        printf("\n1 - Cadastrar.");
        printf("\n2 - Listar Pessoas.");
        printf("\n3 - Qtd de idosas solteiras que tenham salário maior que R$ 3.800,00.");
        printf("\n4 - Media salarial dos homens casados que tenham idade entre 18 e 30 anos.");
        printf("\n5 - Idade da pessoa com o maior salário entre todas.");
        printf("\n6 - Exibir os dados de uma pessoa pelo CPF.");
        printf("\n7 - Editar os dados de uma pessoa pelo CPF.");
        printf("\n8 - Excluir uma pessoa pelo CPF.");
        printf("\n999 - Sair");
        printf("\n\t>>> ");
        scanf("%d", &opcao);
        if (opcao == 1) { ///cadastrar
            if (i <= TAM-1) {
                printf("\nPessoa %d. \n", i+1);

                printf("\nSexo: 1 - M ou 2 - F: ");
                scanf("%d", &sexo[i]);
                while(sexo[i]!=1 && sexo[i]!=2){
                    printf("\nsexo invalido, digite novamente 1(M) ou 2(F): ");
                    scanf("%d", &sexo[i]);
                }

                printf("\nIdade: ");
                scanf("%d", &idade[i]);
                while(idade[i]<0){
                    printf("\nidade invalida, digite um valor positivo: ");
                    scanf("%d", &idade[i]);
                }

                printf("\nEstado Civil: 1 - S ou 2 - C: ");
                scanf("%d", &estCivil[i]);
                while(estCivil[i]!=1 && estCivil[i]!=2){
                    printf("\ninforme um estado civil valido 1(Solteiro) ou 2(Casado): ");
                    scanf("%d", &estCivil[i]);
                }


                printf("\nSalario:  ");
                scanf("%f", &salario[i]);
                while(salario[i]<1518.00){
                    printf("\nsalario invalido, digite um valor maior ou igual ao salario minimo: ");
                    scanf("%f", &salario[i]);
                }

                printf("\nCpf:  ");
                scanf("%d", &cpfs[i]);
                while(cpfs[i]<1000){
                    printf("\ncpf invalido, digite um valor com 4 digitos: ");
                    scanf("%d", &cpfs[i]);
                }

                i++;
            } else {
               printf("\nNao tem mais espaco!!!");
            }
        } else if (opcao == 2) { ///listar
             if (i > 0) {
                for (int a=0; a < i; a++) {
                    printf("\nPessoa %d :", (a+1));
                    printf("\tSexo: %d", sexo[a]);
                    printf("\tIdade: %d", idade[a]);
                    printf("\tEstado Civil: %d", estCivil[a]);
                    printf("\tSalario: %.2f", salario[a]);
                    printf("\tCPF: %d", cpfs[a]);
                }
             } else {
                printf("\nNao existem Pessoas cadastradas!");
             }
        } else if(opcao == 3){
            int qtdCondicao1 = 0;

            if (i > 0) {
                for (int a=0; a < i; a++) {
                    if(estCivil[i]==1 && idade[i]>60 && sexo[i]==1 && salario[i]>3800){
                        qtdCondicao1 += 1;
                    }
                }
                printf("\nquantidade de idosas solteiras que ganham mais que 3800: %d",qtdCondicao1);
            } else {
                printf("\nNao existem Pessoas cadastradas!");
            }

        } else if(opcao == 4){
            int qtdCondicao2=0, somaSalarioCondicao2=0;
            
            if (i > 0) {
                for (int a=0; a < i; a++) {
                    if(estCivil[i]==2 && sexo[i]==2 && idade[i]>18 && idade[i]<30){
                        somaSalarioCondicao2 += salario[i];
                        qtdCondicao2+=1;
                    }
                }
                if(qtdCondicao2>0){
                    float mediaCondicao2 = somaSalarioCondicao2/qtdCondicao2;
                    printf("\nmedia do salario dos homens casados (18 a 30 anos): %.2f", mediaCondicao2);
                }else{
                    printf("\nnao tem homens casados com idade entre 18 e 30 anos na lista");
                }
            } else {
                printf("\nNao existem Pessoas cadastradas!");
            }   

        } else if(opcao == 5){
            //Idade da pessoa com o maior salário entre todas
            float maiorSal = salario[0];
            int idadeMaiorSalario;

            if (i > 0) {
                for (int a=0; a < i; a++) {
                    if(salario[a]>maiorSal){
                    maiorSal = salario[a];
                    idadeMaiorSalario = idade[a];
                    }
                }
                printf("\nidade da pessoa com maior salario: %d",idadeMaiorSalario);
            } else {
                printf("\nNao existem Pessoas cadastradas!");
            }

        } else if(opcao == 6){
            int cpf_busca;
            //Procurar uma pessoa pelo CPF e exibir seus dados, caso o CPF exista
            printf("\ninforme o cpf da pessoa que deseja ver os dados: ");
            scanf("%d", &cpf_busca);
            if (i > 0) {
                for (int a=0; a < i; a++) {
                    if(cpf_busca==cpfs[a]){
                        //mostra os dados dessa pessoa
                        printf("voce buscou pela pessoa %d, os dados dela: ",a+1);
                        printf("\tSexo: %d", sexo[a]);
                        printf("\tIdade: %d", idade[a]);
                        printf("\tEstado Civil: %d", estCivil[a]);
                        printf("\tSalario: %.2f", salario[a]);
                        printf("\tCPF: %d", cpfs[a]);
                    }else{
                        printf("\no cpf que voce digitou nao esta cadastrado");
                    }
                }
            } else {
                printf("\nNao existem Pessoas cadastradas!");
            }

        } else if(opcao == 7){
            //Editar os dados de uma pessoa pelo CPF
            int cpf_edita, resp;
            printf("\ninforme o cpf da pessoa que deseja editar os dados: ");
            scanf("%d", &cpf_edita);
            if (i > 0) {
                for (int a=0; a < i; a++) {
                    if(cpf_edita==cpfs[a]){
                        printf("\ndeseja editar a idade? 1-sim, 2-nao");
                        scanf("%d", &resp);
                        if(resp==1){
                            printf("informe a idade: ");
                            scanf("%d",&idade[a]);
                        }

                        printf("\ndeseja editar o sexo? 1-sim, 2-nao");
                        scanf("%d", &resp);
                        if(resp==1){
                            printf("\ninforme o novo Sexo: 1 - M ou 2 - F: ");
                            scanf("%d", &sexo[a]);
                            while(sexo[a]!=1 && sexo[a]!=2){
                                printf("\nsexo invalido, digite novamente 1(M) ou 2(F): ");
                                scanf("%d", &sexo[a]);
                            }
                        }

                        printf("\ndeseja editar o estado civil? 1-sim, 2-nao");
                        scanf("%d", &resp);
                        if(resp==1){
                            printf("\nEstado Civil: 1 - S ou 2 - C: ");
                            scanf("%d", &estCivil[a]);
                            while(estCivil[a]!=1 && estCivil[a]!=2){
                                printf("\ninforme um estado civil valido 1(Solteiro) ou 2(Casado): ");
                                scanf("%d", &estCivil[a]);
                            }
                        }

                        printf("\ndeseja editar o salario? 1-sim, 2-nao");
                        scanf("%d", &resp);
                        if(resp==1){
                            printf("\nSalario:  ");
                            scanf("%f", &salario[a]);
                            while(salario[a]<1518.00){
                                printf("\nsalario invalido, digite um valor maior ou igual ao salario minimo: ");
                                scanf("%f", &salario[a]);
                            } 
                        }   

                    }else{
                        printf("\no cpf que voce digitou nao esta cadastrado");
                    }
                }
            } else {
                printf("\nNao existem Pessoas cadastradas!");
            }

        } else if(opcao == 8){
            //Excluir uma pessoa pelo CPF
            int cpf_excluir;
            printf("\ninforme o cpf da pessoa que deseja excluir os dados: ");
            scanf("%d", &cpf_excluir);

            if (i > 0) {
                for (int a=0; a < i; a++) {
                    if(cpf_excluir==cpfs[a]){
                        //excluir os dados dessa pessoa
                        sexo[a] = 0;
                        idade[a] = 0;
                        estCivil[a] = 0;
                        salario[a] = 0;
                        cpfs[a] = 0;

                    }else{
                        printf("\no cpf que voce digitou nao esta cadastrado");
                    }
                }
            } else {
                printf("\nNao existem Pessoas cadastradas!");
            }

            

        } else if (opcao == 999) {
            sair = 1;
        } else {
            printf("\nOpcao Invalida!!!");
        }
    } while(sair != 1);


    return 0;
}





