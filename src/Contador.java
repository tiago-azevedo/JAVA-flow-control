import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);


        System.out.println("Primeiro valor: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Segundo valor: ");
        int parametroDois = terminal.nextInt();
        terminal.close();

         
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }            
          
            
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm>parametroDois){ 
            //System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            
        } else{
            int contagem = parametroDois - parametroUm;
            for(int i = 0; i <= contagem; i++) {
                System.out.println(i);
            }
        }
        
    
    }
}
