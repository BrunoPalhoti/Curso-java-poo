/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4E03;
import  P4E03.Veiculo.Veiculo;
/**
 *(P4E03) – Implemente tratamento de exceção na
classe Veiculo abaixo, lançando exceções quando a
velocidade estiver abaixo de zero ou acima do limite
máximos. Escreva um programa para testar esta classe.
 * @author casa
 */
public class P4E03 {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();

        try {
            System.out.println("Acelerar até o máximo");
            carro.acelera(99);
            carro.acelera(1);
            System.out.println("Velocidade Atual é: " + carro.getVelocidade());

            carro.acelera(1);
            System.out.println();
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            System.out.println("Desacelerar até o permitido");
            System.out.println("Velocidade Atual é: " + carro.getVelocidade());
            carro.desacelera(50);
            System.out.println("Velocidade Atual é: " + carro.getVelocidade());
            carro.desacelera(50);
            System.out.println("Velocidade Atual é: " + carro.getVelocidade());
            carro.desacelera(1);

            System.out.println("Velocidade Atual é: " + carro.getVelocidade());
            System.out.println();

        }catch(RuntimeException e){
            System.out.println(e.getMessage());

        }
        }
}

