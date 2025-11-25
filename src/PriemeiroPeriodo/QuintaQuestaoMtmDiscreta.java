package PriemeiroPeriodo;

public class QuintaQuestaoMtmDiscreta {
    public static void main(String[] args) {
        /*Escreva uma definição recursiva para definir a soma de uma progressão geométrica com
        termo inicial a e razão r.*/

        QuintaQuestaoMtmDiscreta obj = new QuintaQuestaoMtmDiscreta();

        System.out.println(obj.pg(4, 2, 3));



    }
    public int pg(int n, int a,int r){
        if(n==1){
            return a;
        }else{
            return r * pg(n-1, a, r);
        }
    }
}
