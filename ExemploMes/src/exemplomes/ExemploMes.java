
package exemplomes;


public class ExemploMes {


    public static void main(String[] args) {
        String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        int i;
        for (i=0; i<12; i++) {
            System.out.printf("%s, tem %d dias. \n", mes[i], diasMes[i]);
        }
    }
    
}
