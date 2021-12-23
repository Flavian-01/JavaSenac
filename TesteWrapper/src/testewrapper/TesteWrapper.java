
package testewrapper;


public class TesteWrapper {

   
    public static void main(String[] args) {
       String numInt = "9822";
       
       //Representação em String do tipo que está sendo criado
       
       Float fNum1 = new Float("500.50");
       Integer iNum1 = new Integer(numInt);
       Double dNum1 = new Double ("512.22");
       
       //o argumento somente aceita tipo char, por isso que é usado aspas simples
       
       Character cNum = new Character ('a');
       
       //Criação do primitivo natural
       
       Float fNum2 = new Float (500.50);
       Integer iNum2 = new Integer (2800);
       Double dNum2 = new Double (512.22);
       
        System.out.println("Float representado por String "+fNum1);
        System.out.println("Float natural "+fNum2);
        System.out.println("Integer representado por string "+iNum1);
        System.out.println("Char "+cNum);
       
    }
    
}
