import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int quantNumero, num = 0;
    int cont = 0, contPar = 0, contImpar = 0;
    int num1;
    int fatorial = 0, multiplicacao = 1;
    System.out.println(" Quantidade de numeros: ");
    quantNumero = scan.nextInt();
    // conta a quantidade de numeros pares e impares inseridos
    do {
      System.out.println("Numero: ");
      num = scan.nextInt();

      if (num % 2 == 0) {
        contPar++;
      } else {
        contImpar++;
      }
      cont++;
    } while (cont < quantNumero);
    System.out.println(" Quantidade de pares: " + contPar);
    System.out.println(" Quantidade de impares: " + contImpar);

    System.out.println(" tabuada do: ");
    num1 = scan.nextInt();
    // calcula a tabuada desejada
    for (cont = 1; cont < 11; cont++) {

      System.out.println(num1 + " x " + cont + " = " + (num1 * cont));
    }
    // fatora numeros
    System.out.println(" Numero a ser fatorado: ");
    fatorial = scan.nextInt();

    for (int i = fatorial; i >= 1; i--) {
      multiplicacao *= i;
    }
    System.out.println(fatorial + "! = " + multiplicacao);

  }
}