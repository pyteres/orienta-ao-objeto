package estrutura.metodos.exersiciosMetodos;

import java.util.Scanner;

public class exersiciosMetodos {
    //Pegando os nossos exersicios anteriores iremos complementalos. Agora iremos calcular o valor total para encher o tanque criando tambem  um parametro para a gasolina.

 public static void main(String[] args) {
     class carro{
        carro(String cor, String modelo, int capacidadeTanque, int valorGaolina){
        Scanner scan = new Scanner(System.in);    
        System.out.println("cor do carro");
        cor = scan.next();
        System.out.println("modelo do carro");
        modelo = scan.next();
        System.out.println("capacidade do tanque");
        capacidadeTanque = scan.nextInt();
        System.out.println("valor gasolina");
        valorGaolina = scan.nextInt();
        }
    }
 }
}

