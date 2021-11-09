package aprovado.e.reprovado.pkgif.pkgelse;

import java.util.Scanner;

public class AprovadoEReprovadoIFELSE {

    public static void main(String[] args) {
        //Declarando imput (entrada)
        Scanner imput = new Scanner(System.in);

        //Declarando Variavel
        double media;
        
        //O que será mostrado ao usuário
        System.out.println("--Aprovado ou Reprovado--");
        
        System.out.println("Digite seu nome: ");
        String aluno = imput.nextLine();

        System.out.println("Olá "+aluno+" digite a sua Primeira nota:");
        //Variavel declarada de outra maneira
        double nota1 = imput.nextDouble();

        System.out.println("Digite a Segunda nota:");
        double nota2 = imput.nextDouble();

        System.out.println("Digite a Terceira nota:");
        double nota3 = imput.nextDouble();

        //Calculo para fazer a média
        media = ((nota1 + nota2 + nota3) / 3);

        //Condições para o aluno ser Aprovado
        if (media >= 6) {
            System.out.println("Parabéns, " +aluno+ " sua média é: "  +media+ "e você foi Aprovado!!!");
        } 
        else
        {
            System.out.println(aluno+"você foi Reprovadoe sua média é: "+media);
        }
        
        {
            
        }

    }

}
