class Estacoes{

  public static void data(int dia, String mes){

    if(dia>31 || dia<1){
      System.out.println("not found");
      return;
    }

    switch(mes){

      case "janeiro":
        System.out.println("é verão!");
      break;
      case "fevereiro":
        System.out.println("é verão!");
      break;
      case "março":
        if( dia >=20){
          System.out.println("o verão acabou! agora estamos no outono!");
        }
        else{
          System.out.println("é verão!");
        }
      break;
    
      case "abril":
        System.out.println("é outono!");
      break;
      case "maio":
        System.out.println("é outono!");
      break;
      case "junho":
  
        if( dia >=20){
          System.out.println("é inverno!");
        }
        else{
          System.out.println("é outono!");
        }
      break;
      
      case "julho":
        System.out.println("é inverno!");
      break;
    
      case "agosto":
        System.out.println("é inverno!");
      break;
      
      case "setembro":
        if( dia >=22){
          System.out.println("o inverno acabou! agora estamos na primavera!");}
        else{
          System.out.println("é inverno!");
        }
      break;
          
      case "outubro":
        System.out.println("é primavera!");
      break;
      
      case "novembro":
        System.out.println("é primavera!");
      break;
        
      case "dezembro":
        if( dia >=21){
          System.out.println("a primavera acabou! agora estamos no verão!");}
        else{
          System.out.println("é primavera!");
        }
      break;
      default:
        System.out.println("not found");
      break;
    }
  } 
}

class Main {
  public static void main(String[] args) {
    //data
    Estacoes.data(20,"julho");
  }
}