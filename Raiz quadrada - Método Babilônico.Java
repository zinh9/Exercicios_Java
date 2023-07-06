import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite um numero para calcular a raiz quadrada: ");
        int n = in.nextInt();
        
        double x = maisProximo(n);
        double resultado = metodoBabilonico(n, x);
        
        System.out.print("A raiz quadrada do numero " +n +" eh: " +resultado);
    }
    public static int maisProximo(int num){
        boolean sair = false;
        int quadradoPerfeito = 0;
        int menor = 0;
        int quadrado = 0;
        int i = 1;
        
        while(!sair){
            quadrado = i * i;
            if(quadrado == num){
                sair = true;
                quadradoPerfeito = i;
            }else if(quadrado > num){
                sair = true;
                quadradoPerfeito = menor;
            }
            menor = i;
            i++;
        }
        return quadradoPerfeito;
    }
    public static double metodoBabilonico(int n, double x){
        double y = 1;
        double e = 0.0001;

        while(x - y > e){
            y = n / x;
            x = (x + y) / 2;
        }
        return x;
    }
}
