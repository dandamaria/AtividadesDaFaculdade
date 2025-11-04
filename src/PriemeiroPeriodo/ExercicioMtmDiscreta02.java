package PriemeiroPeriodo;

public class ExercicioMtmDiscreta02 {
    public static void main(String[] args) {
        int n = 5;
        int e = 2;

        ExercicioMtmDiscreta02 operacao = new ExercicioMtmDiscreta02();

        operacao.SequenciaRecorrenteTpassos(n);
        System.out.println("fatorial de "+n+" é: "+operacao.fatorial(n));

        System.out.println("a potência de "+n+" é: "+operacao.potencia(5.9,e));
    }

    public int fatorial(int f){
        if(f==0){
            return 1;
        }else{
            f = f*fatorial(f-1);
            return f;
        }
    }

    public int SequenciaRecorrenteTpassos(int t){
        int c = t+1;
        if (t == 0) {
            return 1;
        } else {
            t = SequenciaRecorrenteTpassos(t-1) + 4;
            System.out.println("a sequência recorrente de "+(c-1)+" é "+t);
            return t;
        }
    }

    public double potencia(double base, int expoente){
        for (int i = 1; i < expoente; i++) {
            base *= base;
        }
        return base;
    }

}
