/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4E03.Veiculo;

/**
 *
 * @author casa
 */
public class Veiculo {

    private int velocidade = 0;
    private final int velocidadeMax = 100;

    public int getVelocidade() {
        return this.velocidade;
    }

    public int getVelocidadeMax() {
        return this.velocidadeMax;
    }

    public void acelera(int incremento) {

            if (velocidade + incremento > velocidadeMax) {

                throw new RuntimeException("A Velocidade Permitido é 100");
            } else {
                velocidade += incremento;
            }

    }

    public void desacelera(int decremento) {

        if (velocidade - decremento < 0) {
         throw new RuntimeException("Menor que Zero não é permitida");

        } else {
            velocidade -= decremento;
        }
    }

}
