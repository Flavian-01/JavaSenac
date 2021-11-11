
package projeto.pkgswitch.pkg01;

import java.util.Scanner;


public class ProjetoSwitch01 {

   
    public static void main(String[] args) {
        
        Scanner imput = new Scanner (System.in);
        
        int number;
        
      
        System.out.println("--Menu de opções de times--");
        
        System.out.println("");
        
        System.out.println("1 - Grêmio");
        System.out.println("2 - Internacional");
        System.out.println("3 - Atlético Mineiro");
        System.out.println("4 - santos");
        System.out.println("5 - Flamengo");
        System.out.println("6 - Palmeiras");
        
        System.out.print("Digite o numero do time que deseja saber o Idolo: ");
        number = imput.nextInt();
        
        switch (number) {
            case  1:
                System.out.println("O idolo do seu time é Renato Gaúcho!!");
                break;
            case 2:
                System.out.println("O idolo do seu time é Fernandão!!");
                break;
            case 3:
                System.out.println("O idolo do seu time é Ronaldinho Gaúcho!!");
                break;
            case 4:
                System.out.println("O idolo do seu time é Pelé!!");
                break;
            case 5:
                System.out.println("O idolo do seu time é Zico!!");
                break;
            case 6:
                System.out.println("O idolo do seu time é Marcos!!"); 
                break;
            default:
                System.out.println("Você escolheu uma opção inválida!!");
                
        }
    }
    
}
