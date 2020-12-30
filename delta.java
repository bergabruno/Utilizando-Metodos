package metodos;

import java.util.Scanner;

public class delta {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double a, b, c;

    System.out.print("Informe o valor de a --> " );
    a = teclado.nextDouble();
    if (a == 0) {
      System.out.println("não é uma equação do 2o grau");
    } else {
      System.out.print("Informe o valor de b --> ");

      b = teclado.nextDouble();
      System.out.print("Informe o valor de c --> ");

      c = teclado.nextDouble();
      double vdelta = calcdelta(a, b, c);
      if (vdelta < 0) {
        System.out.println("A equação não tem raíz real");
      } else {
        double[] x = calcularRaiz(a, b, vdelta);
        System.out.println("x1 = " + x[0] + "\nx2 = " + x[1]);
      }
    }
  }

  public static double calcdelta(double a, double b, double c) {
    return (b * b - 4 * a * c);
  }

  public static double[] calcularRaiz(double a, double b, double vdelta) {
    double[] x = new double[2];
    x [0] = (-b + Math.sqrt(vdelta)) / (2 * a);
    x [1] = (-b - Math.sqrt(vdelta)) / (2 * a);
    return x;
  }

}
