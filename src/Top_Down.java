public class Top_Down {

    static int preco[] = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
    static int B[] = new int[preco.length+1];

    public static void main(String[] args) {
        int comprimentoMaximo = preco.length;

        for(int i = 0; i < comprimentoMaximo; i++){
            System.out.print(" tamanho: " + (i+1));
            System.out.println(" preço: " + preco[i]);
        }

        System.out.println("O valor maximo obtido eh: " + corte(comprimentoMaximo, preco));
    }
    public static int corte(int n, int[] p){

        B[0] = 0;

        for(int i = 1; i <= n; i++){
            B[i] = -1;
        }

        return corteRecursivo(n, p);
    }

    public static int corteRecursivo(int n, int[] p){


        if(B[n] == -1){
            int lucro = -1;

            for(int i = 1; i <= n; i++){
                int valor = p[i-1] + corteRecursivo(n -i, p);
                if(valor > lucro){
                    lucro = valor;
                }
            }
            B[n] = lucro;
        }

        return B[n];
    }
}


