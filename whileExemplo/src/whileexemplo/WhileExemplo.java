
package whileexemplo;

import java.util.Scanner;


public class WhileExemplo {

    
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        
        int contador1, contador2;
        
        System.out.println("--Contagem de um numero até outro--");
        System.out.println("*O PRIMEIRO NUMERO DEVE MENOR QUE O SEGUNDO*");
        
        System.out.println("Digite o numero inicial");
        contador1 =imput.nextInt();
        
        System.out.println("Digite o numero final");
        contador2 = imput.nextInt();
        
        if (contador1 <= contador2) {
        while (contador1 <= contador2) {
          System.out.println("Numero: "+ contador1);
          contador1++;
        }    
        }else 
        {
            System.out.println("ERRO, Segundo numero menor que o primeiro!!");
        }
    }
    
}
