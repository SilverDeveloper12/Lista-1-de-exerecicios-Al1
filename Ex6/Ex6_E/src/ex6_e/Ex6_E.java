package ex6_e;
import java.util.Scanner;

public class Ex6_E{
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
    int A,B,C;
   
        System.out.print("Digite o valor da base do retangulo: ");
          A = input.nextInt();
        System.out.print("Digite agora o valor da altura do retangulo: ");
          B = input.nextInt();
          
        C = A*B;
        
        System.out.println("A area do retangulo e: " + C);
    
    }
}