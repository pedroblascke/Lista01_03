import java.util.Scanner;
    public class App {
        public static void main (String[] args){
        
        //3- Faça um Programa que peça dois números e imprima a soma.
        double numero, numero2;
        Scanner teclado;

        System.out.println("Escreva dois números quaisquer para que sejam somados");
        
        teclado = new Scanner(System.in);
        numero = teclado.nextDouble();
        numero2 = teclado.nextDouble();
        teclado.close();

        System.out.println("A somatória é de: " + (numero + numero2)); 
        }
}


