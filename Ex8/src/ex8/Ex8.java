package ex8;
import java.util.Scanner;

public class Ex8{
    public static void main(String []args){
    Scanner input = new Scanner(System.in);    
    
    //declaração de variaveis;
    int n1,n2,n3,n4,result;
    
    //entrada de dados;
    System.out.println("Calculadora de media aritmetica (Four numbers edition)"); 
    System.out.println("------------------------------");
    System.out.print("Digite o primeiro numero: ");
        n1 = input.nextInt();
    System.out.print("Digite o segundo numero: ");
        n2 = input.nextInt();
    System.out.print("Digite o terceiro numero: ");
        n3 = input.nextInt();
    System.out.print("Digite o quarto numero: ");
        n4 = input.nextInt();
        
    //processamento

    result = (n1+n2+n3+n4)/4;
    
    //saída de dados;
    
    System.out.println("A media aritmetica dos 4 numeros e: "+result);
    }
}