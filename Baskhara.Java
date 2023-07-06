public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int a;
        int b;
        int c;
        
        //O usuario digita o valor de A (que seria o valor de ax^2 em uma função ax^2 + bx + c
        System.out.print("Digite o valor de A: ");
        a = in.nextInt();
        
        //O usuario digita o valor de B (que seria o valor de bx em uma função ax^2 + bx + c
        System.out.print("Digite o valor de B: ");
        b = in.nextInt();
        
        //O usuario digita o valor de C (que seria o valor de C em uma função ax^2 + bx + c
        System.out.print("Digite o valor de C: ");
        c = in.nextInt();
        
        //É criado uma variavel que recebe uma função que vai calcular o valor de Delta (b^2 - 4 * a * c)
        int deltaResultado = delta(a, b, c);
        //O if verifica se o valor de Delta é menor que zero. Se for, o programa responde uma mensagem e encerra o programa
        if(deltaResultado < 0){
            System.out.println("Nao eh possivel calcular sua raiz.");
            System.exit(0);
        }
        
        //É criado uma variavel que recebe uma função que vai calcular a raiz quadrada de Delta
        int raizDeDelta = raiz(deltaResultado);
        //O if verifica se o valor de Delta é menor que zero. Se for, o programa responde uma mensagem e encerra o programa
        if(raizDeDelta < 0){
            System.out.println("A equacao nao possuira valores reais.");
            System.exit(0);
        }
        
        //É criado uma variavel que vai receber uma função que vai calcular o valor de Baskhara com o sinal POSITIVO (-b + raizDeDelta / 2 * a)
        double baskharaResultado1 = baskharaPositivo(raizDeDelta, a, b);
        
        //É criado uma variavel que vai receber uma função que vai calcular o valor de Baskhara com o sinal NEGATIVO (-b - raizDeDelta / 2 * a)
        double baskharaResultado2 = baskharaNegativo(raizDeDelta, a, b);
        
        System.out.println("O valor de delta eh: " +deltaResultado);
        System.out.println("O valor de x1 eh: " +baskharaResultado1);
        System.out.println("O valor de x2 eh: " +baskharaResultado2);
    }
    //Função para calcular o valor de Delta
    public static int delta(int a, int b, int c){
        //É criada uma variavel que recebe o valor de Delta usando a formula
        int resultado = (b * b) - 4 * a * c;
        
        //Retorna a variavel que recebeu o valor de Delta
        return resultado;
    }
    //Função para calcular qual é a raiz de Delta
    public static int raiz(int delta){
        boolean sair = false;
        int quadradoPerfeito = 0;
        int i = 1;
        
        //Laço de repetição que vai sempre multiplicando i até que seja igual a Delta. A variavel quadradoPerfeito recebe i que foi verificado
        while(!sair){
            int quadrado = i * i;
            
            if(quadrado == delta){
                quadradoPerfeito = i;
                sair = true;
            }
            
            i++;
        }
        //Retorna a raiz quadrada
        return quadradoPerfeito;
    }
    //Função para calcular Baskhara POSITIVO
    public static double baskharaPositivo(int raizDelta, int a, int b){
        //É criada uma variavel que recebe o valor de Baskhara POSITIVO
        double xPositivo = (-b + raizDelta) / (2 * a);
        
        //Retorna a variavel que recebeu o valor de Baskhara POSITIVO
        return xPositivo;
    }
    //Função para calcular Baskhara NEGATIVO
    public static double baskharaNegativo(int raizDelta, int a, int b){
        //É criada uma variavel que recebe o valor de Baskhara NEGATIVO
        double xNegativo = (-b -raizDelta) / (2 * a);
        
        //Retorna a variavel que recebeu o valor de Baskhara NEGATIVO
        return xNegativo;
    }
}
