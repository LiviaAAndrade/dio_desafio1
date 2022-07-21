
class Quadrado {

  public static void area(double lado) {

    System.out.println("área do quadrado: " + (lado * 2));

  }

  public static void area(double lado1, double lado2) {

    System.out.println("área do retângulo: " + (lado1 * lado2));

  }

  public static void area(double maior, double menor, double altura) {

    System.out.println("área do trapézio: " + ((maior + menor) * altura) / 2);

  }

  public static void area(float diag1, float diag2) {

    System.out.println("área do losango: " + (diag1 * diag2) / 2);

  }
}

class Main {
  public static void main(String[] args) {
    // calculos
    System.out.println("resultados quadriláteros:");
    Quadrado.area(3);
    Quadrado.area(5d, 5d);
    Quadrado.area(7, 8, 9);
    Quadrado.area(5f, 5f);
  }
}