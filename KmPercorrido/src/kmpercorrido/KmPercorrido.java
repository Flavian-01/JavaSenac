package kmpercorrido;

import java.util.Scanner;

public class KmPercorrido {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarando variáveis
        double kmInicial, kmFinal, kmTotal;
        double litros, consumo;

        //o que será mostrado para o usuário
        System.out.println("Digite a quilometragem inicial: ");
          kmInicial = input.nextDouble();

        System.out.println("Digite a quilometragem final: ");
          kmFinal = input.nextDouble();
        
        kmTotal = kmFinal - kmInicial;
        
        System.out.println("Informe a quantidade de litros consumido: ");
        litros = input.nextDouble();
        
        consumo = kmTotal / litros;
        
        System.out.println("Você percorreu o total de "+ kmTotal+"KM");
        System.out.println("A sua média de litros é: "+ consumo);

    }

}
