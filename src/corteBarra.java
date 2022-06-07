public class corteBarra {

    public static void main(String[] args) {

        int preco[] = new int[]{1, 5, 8, 9, 10, 17, 17, 18};
        int comprimentoMaximo = preco.length;

        System.out.println("O valor maximo obtido eh: " + corte(comprimentoMaximo, preco));
    }


    public static int corte(int n, int[] p){

        int valor;

        if(n == 0){
            return 0;
        }
        int lucro = -1;

        for(int i = 0; i < n; i++){
            valor = p[i] + corte(n -(i+1), p);
            if(valor > lucro){
                lucro = valor;
            }
        }

        return lucro;
    }


}
