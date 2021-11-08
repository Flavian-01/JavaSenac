
package exercicio.pkgif.pkgelse;

import java.util.Scanner;


public class ExercicioIfElse {

   
    public static void main(String[] args) {
        Scanner  imput = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite sua idade: ");
        idade = imput.nextInt();
        
        if (idade >= 18  )
        {
            System.out.println("Você é maior de idade!");
        }
        else if ( idade <= 0)
        {
            System.out.println("Idade invalida!");
        }
        else
        {
            System.out.println("valor é menor de idade!");
        }    
    }
    
}
