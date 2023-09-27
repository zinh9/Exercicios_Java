public class Ordem {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {5, 2, 1, 3, 9, 7};
        
        for(int contador = 0; contador < numeros.length; contador++){
           for(int aux = contador + 1; aux < numeros.length; aux++){
               if(numeros[contador] > numeros[aux]){
                   numeros[aux] = numeros[contador];
               }
           }
        }    
    }
}
