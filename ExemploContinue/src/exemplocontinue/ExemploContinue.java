
package exemplocontinue;


public class ExemploContinue {

    public static void main(String[] args) {
       for (int contador=1;  contador<=100; contador++){
           if (contador%5!=0)
               continue;
           /*
           se o contador nao for multiplo de 5
           todo o código abaixo será ignorado
           e o loop continua com o proximo nr
           */
           System.out.println("Contador: "+ contador);
       }
    }
    
}
