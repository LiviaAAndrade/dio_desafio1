import java.util.List;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

class People implements Comparable<People> {

  private String nome;
  private String cor;
  private Integer idade;

  public People(String nome, String cor, Integer idade) {
    this.nome = nome;
    this.cor = cor;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public String getCor() {
    return cor;
  }

  public String toString() {
    return ("{" + "nome= '" + nome + '\'' + ", idade= '" + idade + '\'' + ", cor= '" + cor + '\'' + "}");
  }
  @Override
  public int compareTo(People People) {
    return this.getNome().compareToIgnoreCase(People.getNome());
  }
}

class Main {
  public static void main(String[] args) {

    List<People> pessoa = new ArrayList<>() {
      {
        add(new People("livia", "preto", 18));
        add(new People("lucas", "amarelo", 19));
        add(new People("leandro", "azul", 1));
        add(new People("leticia", "bronze", 110));
      }
    };

    Set<Double> notes = new HashSet<>(Arrays.asList(5d, 6d, 7d, 7d, 4d, 3d, 2d, 1d, 0d));
    Double soma = 0d;
    Iterator<Double> iter = notes.iterator();

    Set<Double> notes2 = new LinkedHashSet<>(Arrays.asList(5d, 6d, 7d, 4d, 3d, 2d, 1d, 0d));

    Set<Double> notes3 = new TreeSet<>(notes2);

    // imprime a lista de formas diferentes
    System.out.println("----ordem de inserção----");
    System.out.println(pessoa);
    System.out.println("  ");
    System.out.println("----ordem aleatória----");
    Collections.shuffle(pessoa);
    System.out.println(pessoa);
    System.out.println("  ");
    System.out.println("----ordem natural----");
    Collections.sort(pessoa);
    System.out.println(pessoa);

    // ultilizando Set
    System.out.println("");
    System.out.println("----Lista Set----");
    System.out.println(notes.toString());
    System.out.println("Contem o numero 0 na lista?:");
    if (notes.contains(0d) == true)
      System.out.println("tem na lista set");
    else
      System.out.println("não tem na lista set");

    System.out.println("maior numero: " + Collections.max(notes));
    System.out.println("menor numero: " + Collections.min(notes));
    while (iter.hasNext()) {
      Double next = iter.next();
      soma += next;
    }
    System.out.println("soma dos elementos da lista set: " + soma);
    System.out.println("media dos elementos da lista set: " + soma / notes.size());
    notes.remove(0d);
    System.out.println("contem o elemento 0 na lista?: " + notes.contains(0d));

    // ultilizando LinkedHashSet
    System.out.println("");
    System.out.println("");
    System.out.println("----Lista LinkedHashSet----");
    System.out.println(notes2);

    // ultilizando TreeSet para ordenar
    System.out.println("");
    System.out.println("----Lista TreeSet----");
    System.out.println(notes3);

    // apagando
    notes.clear();
    System.out.println("");
    System.out.println("a lista notes está livre?: " + notes.isEmpty());
  }
}