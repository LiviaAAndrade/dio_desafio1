class Calculadora{
     
  public static void soma (double num1,double num2){
      
    double resultado= num1 + num2;
    System.out.println("a soma de "+ num1 + " e "+ num2 + " é igual a "+ resultado); 
  }

  public static void multiplica (double num1,double num2){
    
    double resultado= num1 * num2;
    System.out.println("a multiplicacao de "+ num1 + " e "+ num2 + " é igual a "+ resultado); 
  }

  public static void subtrai (double num1,double num2){
      
    double resultado= num1 - num2;
    System.out.println("a subtracao de "+ num1 + " e "+ num2 + " é igual a "+ resultado);
  }

  public static void divide (double num1,double num2){
      
    double resultado= num1 / num2;
    System.out.println("a divisao de "+ num1 + " e "+ num2 + " é igual a "+ resultado);
  } 
}


class Dia {

  public static void manha(int hora){
      
    if (hora >=5 && hora <=12){
      System.out.println("bom dia :) ");
    }
    else if (hora >=13 && hora <=17){
      System.out.println("boa tarde :) ");
    }
    else if (hora >=18 && hora <=24){
      System.out.println("boa noite :) ");
    }
    else{
       System.out.println("not found");
    }
  }
}


class Credito{


  public static double Taxa2(){
    return 0.3;
  }
  public static double Taxa3(){
    return 0.45;
  }
  public static double Taxa4(){
    return 0.50;
  }

  public static int par2(){
    return 2;
  }
  public static int par3(){
    return 3;
  }
  public static int par4(){
    return 4;
  }
  
  public static void Parse(double valor,int parcelas){

    if (parcelas==2){
      double valorFinal= valor+ (valor * Credito.Taxa2());

      System.out.println("o valor final para " + parcelas + " é " + valorFinal);
    }
    else if (parcelas==3){
      double valorFinal= valor+ (valor * Credito.Taxa3());

      System.out.println("o valor final para " + parcelas + " é " + valorFinal);
    }
    else if (parcelas==4){
      double valorFinal= valor+ (valor * Credito.Taxa4());

      System.out.println("o valor final para " + parcelas + " é " + valorFinal);
    }
    else{
      System.out.println("not found");
    }
  }
}

  
public class Main {
  public static void main(String[] args){

    //calculadora
    System.out.println("resultados calculadora:");
    Calculadora.soma(2,2);
    Calculadora.subtrai(2,2);
    Calculadora.divide(2,2);
    Calculadora.multiplica(2,2);

   //dia
   System.out.println("resultados dia:");
   Dia.manha(9);
   Dia.manha(14);
   Dia.manha(19);
   Dia.manha(1);
    
   //parcelas   
   System.out.println("resultados parcelas:");
   Credito.Parse(1000, Credito.par2());
   Credito.Parse(1000, Credito.par3());
   Credito.Parse(1000, Credito.par4());
   Credito.Parse(1000, 6);
  }
}