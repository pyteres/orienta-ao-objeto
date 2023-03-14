package estruturava.basica.objetos.mensagem;

import java.util.Scanner;

public class exercisioMensagem {
//Evolua o conceito do exercisio 3 crianado objetos da classe carro use os metodos set e get quando aplicaveis para definair os atrobitos e exibir estes valores get  passe uma mensagem para o calculo do total para encher o tanque.

public static void main(String[] args) {
 exercisioMensagem EM = new exercisioMensagem();
 EM.Carro();
}

 public void Carro() {
            Scanner scan = new Scanner(System.in);
            String cor;
            System.out.println("cor do carro");
            scan.nextLine();
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

