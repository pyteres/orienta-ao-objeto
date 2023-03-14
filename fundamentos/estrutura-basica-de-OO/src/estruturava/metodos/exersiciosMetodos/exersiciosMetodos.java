package estruturava.metodos.exersiciosMetodos;

import java.util.Scanner;

public class exersiciosMetodos {
    //Pegando os nossos exersicios anteriores iremos complementalos. Agora iremos calcular o valor total para encher o tanque criando tambem  um parametro para a gasolina.
   
 public  static void main(String[] args) {
    exersiciosMetodos M = new exersiciosMetodos();
    M.carro();
}

public void carro() {
    Scanner scan = new Scanner(System.in);
    String cor;
    System.out.println("cor do carro");
    scan.next();
    String modelo;
    System.out.println("modelo do carro");
    scan.next();
    int capacidadeTanque = 4;
    System.out.println("capacidade tanque");
    int valorGasolina = 2;
    System.out.println("valor gasolina");
    int valorFinal;
    valorFinal = (capacidadeTanque / valorGasolina);
    System.out.println("valor final" + "=" + valorFinal); 
}
}