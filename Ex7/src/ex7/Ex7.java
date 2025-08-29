package ex7;
import java.util.Scanner;

public class Ex7{
    public static void main(String []args){
    
    //declaração de variaveis    
    Scanner input = new Scanner(System.in); 
    double A,B,hip;  
   
    //entrada de dados
    
    System.out.print("Digite o valor do cateto adjascente: ");
        A = input.nextDouble();
    System.out.print("Agora digite o valor do cateto oposto: ");
        B = input.nextDouble();
     
     //processamento de dados
     
    hip = Math.sqrt((A*A) + (B*B));
    
     //saída de dados
     
    System.out.println("O valor da hipotenusa do triangulo retangulo e: " + hip);
    }
}