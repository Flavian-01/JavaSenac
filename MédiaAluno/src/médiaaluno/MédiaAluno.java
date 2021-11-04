package médiaaluno;

import java.util.Scanner;

public class MédiaAluno {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Declarando variáveis
        String nome;
        double nota1, nota2, nota3;
        double media;
        
        //O que será mostrado para o usuário
        System.out.println("Digite o nome do Aluno: ");
            nome = input.nextLine();

        System.out.println("Digite a primeira nota de " + nome + ": ");
            nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota de " + nome + ": ");
            nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota de " + nome + ": ");
            nota3 = input.nextDouble();
            
        //Cálculo feito para mostrar a media 
        media = (nota1 + nota2 +nota3) / 3;
        
        //Mensagem final mostrando o resultado para o usuário
        System.out.println("A média de "+ nome+ " é: "+media);

    }

}
