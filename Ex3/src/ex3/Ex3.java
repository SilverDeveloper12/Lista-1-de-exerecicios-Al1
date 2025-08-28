package ex3;
import java.util.Scanner;


public class Ex3{
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
    
    int n1,n2,pow1,pow2,result;
    
    System.out.print("Por favor digite o primeiro numero: ");
        n1 = input.nextInt();
    System.out.print("Agora, digite o segundo numero: ");
        n2 = input.nextInt();
        
    pow1 = n1 * n1;
    pow2 = n2 * n2;
    result = pow1 + pow2;
    
    System.out.println("A soma da potencia dos dois numeros é: " + result);
        
    }
}
 