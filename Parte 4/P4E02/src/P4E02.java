/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Funcionario.Funcionario;
import Funcionario.Chefe;
import java.util.Scanner;

/**
 *(P4E02) – Crie as classes Funcionario e Chefe, de
acordo com o diagrama de classe abaixo. Faça
construtores, getters e setters. O método aumento
acrescenta um valor ao salário. O método pagamento (que
não pode ser sobrecarregado – usar final) retorna 85% do
salario mensal (então está sendo descontado 15%). O
método pagamentoExtra retorna o valor do pagamento
mais contas, gastosExtras e adicionalChefia. Escreva um
programa para testar esta classe.
 * @author casa
 */
//Parte 4 pagina 42 ou  pagina 212
public class P4E02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String rgChefe;
        double SalarioChefe;
        double conta;
        double gastoExtra;
        double adicionalDoChefe;

        System.out.println("Criado um Funcionário padrão: Arlindo, 123123-X, 5000.00");
        Funcionario f = new Funcionario("Arlindo", "123123-X", 5000.00);
        System.out.println(f);

        System.out.println("Hora de Criarmos um Chefe!");
        System.out.print("Digite o nome do Chefe:");
        String nome = leitor.nextLine();
        System.out.print("Digite o RG do Chefe:");
        rgChefe = leitor.nextLine();
        System.out.print("Digite o salário Mensal do Chefe:");
        SalarioChefe = Double.parseDouble(leitor.nextLine());
        System.out.print("Digite a conta do Chefe:");
        conta = Double.parseDouble(leitor.nextLine());
        System.out.print("Digite o gasto extra Chefe:");
        gastoExtra = Double.parseDouble(leitor.nextLine());
        System.out.print("Digite o adicional do Chefe:");
        adicionalDoChefe = Double.parseDouble(leitor.nextLine());


        Chefe c = new Chefe(nome,rgChefe,SalarioChefe,conta,gastoExtra,adicionalDoChefe);


        System.out.println("Vamos visualizar o quanto já foi pago somente para o Chefe!");
        System.out.println("Com 15% de desconto " + c.pagamentoExtra());

        System.out.println("Hora de Acrescentar o salário");
        System.out.println("Digite o aumento do Arlindo");
        double aumentoFuncionario = Double.parseDouble(leitor.nextLine());
        f.aumento(aumentoFuncionario);
        System.out.println("Agora Digite o aumento do Chefe");
        double aumentoChefe = Double.parseDouble(leitor.nextLine());
        c.aumento(aumentoChefe);

        System.out.println("Os Valores Acrescidos ficaram assim:");
        System.out.println(f.getNome() + " Pagamento mensal de: " + f.getSalarioMensal() + "\n"
                + c.getNome() + " Pagamento mensal de: " + c.getSalarioMensal());

                leitor.close();
    }
    
}
