
package convertwrappers;

public class ConvertWrappers {

   
    public static void main(String[] args) {
       //cria um objeto wrapper 
       Integer velocidade = new Integer (587);
       
       //converte a variável velocidade para tipo primitivo
       double total = velocidade.doubleValue();
       short total1 = velocidade.shortValue();
       byte total2 = velocidade.byteValue();
       
       Float pi = new Float(3.14f);
       int valorPI = pi.intValue();
       
        System.out.println("Valor de PI arredondado: "+ valorPI);
        System.out.println("total "+ total);
    }
    
}
