package metodos;

import java.util.Random;

public class VetorMedia {

  public static void main(String[] args) {
    int v[] = new int[10];

    preencher(v);
    imprimir(v);
    double media = media(v);
    System.out.println("\nMédia = " + media);
    double desvio = calculardesvio(v);
    System.out.println("Desvio padrão = " + desvio);
  }

  public static void preencher(int[] v) {
    Random gerador = new Random();
    for (int i = 0; i < v.length; i++) {
      v[i] = i +1; 
    }
  }

  public static void imprimir(int v[]) {
    for (int i = 0; i < v.length; i++) {
      System.out.print(v[i] + "\t");
    }
    System.out.println();
  }

  public static double media(int v[]) {
    double media = 0;
    for (int i = 0; i < v.length; i++) {
      media += v[i];
    }
    media /= v.length; // para deixar automatico.
    return media;
  }

  public static double calculardesvio(int v[]) {
    
    double media = media(v);
    double d = 0;
    for (int i = 0; i < v.length;i++) {
      d += Math.pow(v[i] - media,2);
    }
    d = Math.sqrt(d / (v.length - 1));
    return d;
  }

}
