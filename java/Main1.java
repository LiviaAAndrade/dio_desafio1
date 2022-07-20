
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int i;
    int I;
    final int CONSTANTE= 1;
    i=5;
    I=10;

   System.out.println(i + I + CONSTANTE); //isso soma :(

    byte b1= 4;
    short s1= 100;
    int i1=0;
    long l1= 1234321L;
    float f1= 3.14f;
    double d1= 123.4321d;
    char c1= 't';
    String st1= "tamanhohihi";
    boolean bo1= true;
    
    System.out.println(st1+ "  " + bo1);

    i +=b1;
    System.out.println(i);
    i1++;
    System.out.println(i1);
    
    //convertendo float para int
    //downcast, ele transformou em 3.
    i1=(int) f1;
    System.out.println(i1);
    //upcast int para float, adicionou .0
    f1= i1;
    System.out.println(f1);
  }
}