
package brasileiro.ou.estrangeiro;

import java.util.Scanner;

public class BrasileiroOuEstrangeiro {

   
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        
        String nome, pais;
        
        System.out.println("Digite seu nome: ");
        nome = imput.nextLine();
        
        System.out.println("Digite em que pais você mora: ");
        pais = imput.nextLine();
        
        if  (pais.equals("Brasil") || pais.equals("brasil") )
        {
            System.out.println(nome+ " Você é brasileiro");
                       
        }
        else 
        {
            System.out.println(nome+ " Você é estrangeiro");
        }
        
    
    }
    
}
