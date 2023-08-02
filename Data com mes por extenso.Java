import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o dia da sua data de nascimento: ");
        int dia = in.nextInt();
        
        System.out.print("Digite o mes da sua data de nascimento: ");
        int mes = in.nextInt();
        
        System.out.print("Digite o ano da sua data de nascimento: ");
        int ano = in.nextInt();
        
        String mesPorExtenso = calcularMes(mes);
        
        System.out.println("Sua data de nascimento por extenso eh: " +dia +" de " +mesPorExtenso +" de " +ano);
    }
    public static String calcularMes(int mes){
        String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        
        String mesCalc = " ";
        
        for(int i = 1; i <= meses.length; i++){
            if(i == (mes - 1)){
                mesCalc = meses[i];
                break;
            }
        }
        
        return mesCalc;
    }
}
