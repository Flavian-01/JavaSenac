
package projetofaixaetaria;

import java.util.Scanner;

public class ProjetoFaixaEtaria {


    public static void main(String[] args) {
       //Declado o imput (entrada)
       Scanner imput = new Scanner (System.in);
       
       //Declarando as variáveis
       String nome;
       int idade;
       
        //O que será mostrado ao usuário
        System.out.print("Digite seu nome: ");
        nome = imput.nextLine(); //Irá ler o que o usuário digitar
        
        System.out.print("Digite sua idade: ");
        idade = imput.nextInt();
        
        //Condições para saber qual a faixa etária de idade do usuário 
        if (idade < 0)
        {
            System.out.println("Idade Inválida!!"); //Mensagem que será mostrada com o resultado para o usuário
        }
        else if (idade <= 17)
        {
            System.out.println("Olá "+nome+" você tem, "+idade+" e é considerado Jovem!");
        }
        else if (idade <= 59)
        {
            System.out.println("Olá "+nome+" você tem, "+idade+" e é considerado Adulto!!");
        }
        else if (idade <= 110)
        {
            System.out.println("Olá "+nome+" você tem, "+idade+" e é considerado Idoso!!");
        }
      
        {
   
                
        }
    }
    
}
