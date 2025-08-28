package ex6_f;
import java.util.Scanner;

public class Ex6_F{
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
    int A,B,C;
   
        System.out.print("Digite o valor da base do retangulo: ");
          A = input.nextInt();
        System.out.print("Digite agora o valor da altura do retangulo: ");
          B = input.nextInt();
          
        C = (A*A)+(B*B);
        
        System.out.println("O perimetro do retangulo e: " + C);
    
    }
}