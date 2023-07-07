import java.util.Scanner;

public class JavaApplication45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] numerosUsuario = numeros(in);
        
        boolean sair = false;
        boolean div = false;
        int primo = 2;
        int contador = 0;
        int mmc = 1;
        
        while(!sair){
            contador = 0;
            for(int i = 1; i <= primo; i++){
                if(primo % i == 0){
                    contador++;
                }    
            }
            
            if(contador == 2){
                div = divisivel(numerosUsuario, primo);
                
                if(div == true){
                    for(int i = 0; i < numerosUsuario.length; i++){
                        System.out.print(numerosUsuario[i]);
                        System.out.print(" ");
                        
                        if(i == numerosUsuario.length-1){
                            System.out.print("|" + primo);
                            System.out.println();
                        }
                    }
                    numerosUsuario = divide(numerosUsuario, primo);
                    sair = tudoUm(numerosUsuario);
                }
            }
            if(div == true){
                mmc = mmc * primo;
                primo = 2;
            }else{
                primo++;
            }
        }
        for(int i = 0; i < numerosUsuario.length; i++){
            System.out.print(numerosUsuario[i]);
            System.out.print(" ");
            
            if(i == numerosUsuario.length - 1){
                System.out.print("|");
                System.out.println();
            }
        }
        System.out.println("O MMC eh: " +mmc);
    }
    public static int[] numeros(Scanner in){
        System.out.print("Digite a quantidade de numeros que deseja: ");
        int quantidade = in.nextInt();
        
        int[] numeros = new int[quantidade];
        
        for(int i = 0; i < quantidade; i++){
            System.out.print("Digite o " +(i + 1) +" numero: ");
            numeros[i] = in.nextInt();
        }
        
        return numeros;
    }
    public static boolean divisivel(int[] numeros, int primo){
        boolean divisivel = false;
        
        for(int i = 0; i <= numeros.length - 1; i++){
            if(numeros[i] % primo == 0){
                divisivel = true;
                break;
            }else{
                divisivel = false;
            }
        }
        return divisivel;
    }
    public static int[] divide(int[] numeros, int primo){
        for(int i = 0; i <= numeros.length - 1; i++){
            if(numeros[i] % primo == 0){
                numeros[i] = numeros[i] / primo;
            }
        }
        return numeros;
    }
    public static boolean tudoUm(int[] numeros){
        int contador = 0;
        
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == 1){
                contador++;
            }
        }
        if(contador == numeros.length){
            return true;
        }else{
            return false;
        }
    }
}
