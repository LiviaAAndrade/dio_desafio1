import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] vetor1 = { 0, 1, 2, 3, 4 };
    String[] consoantes = new String[5];
    int quantidadeConsoantes = 0, cont1 = 0;
    String letra;
    Random rand = new Random();
    int[] numAleatorios = new int[5];
    int num;
    int[][] M = new int[4][4];
    int linha, coluna;

    System.out.println("Vetor:");

    // imprime vetor
    for (int cont = 0; cont < vetor1.length; cont++) {
      System.out.println(vetor1[cont]);
    }

    System.out.println("Vetor de tras para frente:");
    // imprime vetor inversamente
    for (int i = vetor1.length - 1; i >= 0; i--) {
      System.out.println(vetor1[i]);
    }

    // ira contar a quantidade de consoantes
    do {
      System.out.println("Letra:");
      letra = scan.next();

      if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
          || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))) {

        consoantes[cont1] = letra;
        quantidadeConsoantes++;
      }
      cont1++;
    } while (cont1 < consoantes.length);

    System.out.println("Consoantes:");
    for (String i : consoantes) {
      if (i != null) {
        System.out.println(i);
      }
    }
    System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

    System.out.println("Array randomico: ");
    // gera um array de numeros randomicos
    for (int j = 0; j < numAleatorios.length; j++) {
      num = rand.nextInt(100);
      numAleatorios[j] = num;
    }
    for (int k : numAleatorios) {
      System.out.println(k);
    }

    // Matriz com numeros aleatorios
    for (linha = 0; linha < M.length; linha++) {
      for (coluna = 0; coluna < M[linha].length; coluna++) {
        M[linha][coluna] = rand.nextInt(9);
      }
    }
    System.out.println(" matriz:");
    for (int[] l1 : M) {
      for (int c1 : l1) {
        System.out.println(c1 + " ");
      }
    }
  }
}