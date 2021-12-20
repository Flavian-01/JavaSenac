
package imc;

import java.util.Scanner;


public class IMC {
    
    public static float IMC(float peso, float altura){
        float imc;
        imc = peso / (altura*altura);
        return imc;
    } 

   
    public static void main(String[] args) {
      float peso, altura, imc;
      Scanner input = new Scanner (System.in);
      
        System.out.println("Entre co mseu peso, em kilos: ");
        peso = input.nextFloat();
        System.out.println("Entre com sua altura, em metros: ");
        altura =  input.nextFloat();
        
        imc = IMC(peso, altura);
        
        System.out.printf("Seu IMC vale: %.2f", imc);
    }
    
}
