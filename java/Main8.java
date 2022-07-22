import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Main {
  public static void main(String[] args) {

    List<Double> notes = new ArrayList<>();
    notes.add(7d);
    notes.add(8d);
    notes.add(1.0);
    notes.add(9.7);
    notes.add(7.0);

    // posição dos elementos
    System.out.println(notes);
    System.out.println("imprime a posição de 1.0: " + notes.indexOf(1.0));

    // adicionar +1 elemento em uma posição ja ocupada
    notes.add(2, 4d);
    System.out.println("imprime a posição de 4: " + notes.indexOf(4d));
    System.out.println(notes.toString());

    // substituição de um elemento
    notes.set(notes.indexOf(4d), 90.0);
    System.out.println("substituição set: ");
    for (double nota : notes) {
      System.out.println(nota);
    }

    // se tem um elemento na lista
    System.out.println("contem tal elemento?: " + notes.contains(10.0));

    // busca elemento pela posição
    System.out.println("que elemento esta na posição 4?: " + notes.get(4));

    // exibe o menor numero
    System.out.println("menor elemento?: " + Collections.min(notes));

    // exibe o maior numero
    System.out.println("maior elemento?: " + Collections.max(notes));

    // soma todos os elementos
    Iterator<Double> inter = notes.iterator();
    double soma = 0d;
    while (inter.hasNext()) {
      double next = inter.next();
      soma += next;
    }
    System.out.println("soma dos elementos: " + soma);

    // média dos elementos.
    System.out.println("media dos elementos: " + (soma / notes.size()));

    // remove elementos.
    System.out.println("remove elemento 7d: " + notes.remove(7d));
    System.out.println("remove elemento na posição 0: " + notes.remove(0));
    System.out.println(notes);

    // condições
    Iterator<Double> inter1 = notes.iterator();
    while (inter1.hasNext()) {
      Double next1 = inter1.next();
      if (next1 > 50.0) {
        inter1.remove();
      }
    }
    System.out.println("elementos menores que 50: " + notes);

    // apaga toda a lista
    notes.clear();

    // confere se apagou
    System.out.println("lista vazia?:" + notes.isEmpty());

  }

}