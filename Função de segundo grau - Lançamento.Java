public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double velocidade = velocidadeUsuario(in);
        double alturaMaxima = calculaAlturaMaxima(velocidade);
        double tempoPercorrido = calculaTempo(velocidade);
        
        System.out.println("");
        System.out.println("A altura que o objeto alcancou foi de: " +alturaMaxima + " metros");
        System.out.println("");
        System.out.println("O tempo percorrido foi de: " +tempoPercorrido +" segundos");
    }
    public static double velocidadeUsuario(Scanner in){
        System.out.println("ESSE PROGRAMA IRA CALCULAR A ALTURA MAXIMA DE UM OBJETO LANCADO E O SEU TEMPO");
        System.out.println("");
        
        System.out.print("Digite a velocidade inicial do objeto: ");
        double velocidadeInicial = in.nextDouble();
        
        return velocidadeInicial;
    }
    public static double calculaAlturaMaxima(double velocidadeInicial){
        double gravidade = 9.8;
        double hMaximo = (velocidadeInicial * velocidadeInicial) / (2 * gravidade);
        
        return hMaximo;
    }
    public static double calculaTempo(double velocidadeInicial){
        double gravidade = 9.8;
        double tempo = velocidadeInicial / gravidade;
        
        return tempo;
    }
}
