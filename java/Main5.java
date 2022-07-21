import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String nome;
    int idade;
    int num;
    int maior = 0, menor = 0;
    float media = 0;
    int cont = 0;
    int num1 = 0;
    // lê nome e idade até receber nome=0
    while (true) {
      System.out.println("nome: ");
      nome = scan.next();
      if (nome.equals("0")) {
        break;
      }
      System.out.println("idade: ");
      idade = scan.nextInt();
    }
    System.out.println("saiu do laço");

    // lê numeros de 5 à 10, caso não estiver neste intervalo, o comando é repetido.
    while (true) {
      System.out.println("insira um numero valido de 5 à 10: ");
      num = scan.nextInt();

      if (num >= 5 && num <= 10) {
        break;
      } else {
        System.out.println("invalido.");
      }
    }
    System.out.println("saiu do laço");

    // do while, retornar o maior, menor e media dos valores
    do {
      System.out.println("Numero: ");
      num1 = scan.nextInt();
      if (num1 > maior) {
        maior = num1;
      }
      if (num1 < menor) {
        menor = num1;
      }
      media += (float) num1;
      cont++;
    } while (cont < 5);

    System.out.println("O maior numero é: " + maior);
    System.out.println("O menor numero é: " + menor);
    System.out.println("A media dos numeros é: " + media / 5);

  }
}