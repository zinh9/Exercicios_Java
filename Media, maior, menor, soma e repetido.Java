public class Vetores1 {
    
    public static void main(String[] args){
        double[] numeros = {8, 7.2, 9, 15, 11.5, 17, 1, 14, 9, 1};
        
        double media = 0;
        double maior = numeros[0];
        double menor = numeros[0];
        double soma = 0;
        int repetido = 0;
        int contador = 0;
        
        //Laço de repetição para calcular a média
        while(contador < numeros.length){
            media = media + numeros[contador] / numeros.length; 
            contador++;
        }
        System.out.println("A media dos numeros eh: " +media);
        
        contador = 0;
        
        //Laço de repetição para calcular o maior numero dentro do vetor
        while(contador < numeros.length){
            if(numeros[contador] > maior){
                maior = numeros[contador];
            }
            contador++;
        }
        System.out.println("O maior numero eh: " +maior);
        
        contador = 0;
        
        //Laço de repetição para calcular o menor numero dentro do vetor
        while(contador < numeros.length){
            if(numeros[contador] < menor){
                menor = numeros[contador];
            }
            contador++;
        }
        System.out.println("O menor numero eh: " +menor);
        
        contador = 0;
        
        //Laço de repetição para calcular a soma dos numeros
        while(contador < numeros.length){
            soma = soma + numeros[contador];
            contador++;
        }
        System.out.println("A soma dos numeros eh: " +soma);
        
        contador = 0;
        
        //Laço de repetição para calcular quantos numeros são repetidos
        while(contador < numeros.length){
            int aux = numeros.length - contador;
            if(numeros[contador] == aux){
                repetido++;
            }
            contador++;
        }
        System.out.println(repetido +" numeros sao repetidos");
    }
}
//              {8, 7.2, 9, 15, 11.5, 17, 1, 14, 9, 1}
