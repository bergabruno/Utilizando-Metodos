package metodos;

import java.util.Random;

public class MatrizMaior {
  public static void main(String[] args) {

    int x[][] = new int[5][5];

    ler(x);
    imprimir(x);
    maior(x);
  }

  public static void ler(int x[][]) {
    Random gerador = new Random();

    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        x[i][j] = gerador.nextInt(30);
      }
    }
  }

  public static void imprimir(int x[][]) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        System.out.print(x[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public static void maior(int x[][]) {
   int maior = 0;
    
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x.length; j++) {
        if(x[i][j] > maior) {
          maior = x[i][j];
        }  
      }
      System.out.println("\n" + (i+1) + " Linha -- > " + maior);
      maior = 0;
    }
  }
}
