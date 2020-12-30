package metodos;

import java.util.Scanner;

public class maiorValor {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor1, valor2, valor3;

    System.out.print("Informe o primeiro valor --> ");
    valor1 = teclado.nextInt();
    System.out.print("Informe o primeiro valor --> ");
    valor2 = teclado.nextInt();
    System.out.print("Informe o primeiro valor --> ");
    valor3 = teclado.nextInt();

    int maior = teste(valor1, valor2, valor3); // automaticamente quando retorna ja põe, o nome da var antes do = nao importa
    System.out.println("\nO maior valor foi --> " + maior);
    
  }

  public static int teste(int val1, int val2, int val3) {

    if (val1 > val2 && val1 > val3) { // testando o valor 1
      return val1;
    } else if (val2 > 3) { // testando o valor 2
      return val2;
    } else {
      return val3;
    }

  }
}
