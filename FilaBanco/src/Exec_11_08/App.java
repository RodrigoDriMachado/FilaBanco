package Exec_11_08;

import java.util.Random;
import java.util.Scanner;

public class App {

    private static Cliente cliente;
    private static Atendimento atende;
    private static FilaCliente filaCliente;

    public static void main(String[] args) {

        String ope;
        int operacao;
        String nome;
        String retorno;
        int idade;
        int numCaixa;

        atende = new Atendimento();
        filaCliente = new FilaCliente();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a operação que deseja efetuar: ");
        System.out.println("1 - Solicitar Proximo Cliente ");
        System.out.println("2 - Registrar Chegada de Cliente ");
        System.out.println("3 - Quantidade de Pessoas nas Filas: ");
        System.out.println("4 - Sair: ");

        ope = entrada.next();
        operacao = Integer.parseInt(ope);

        while (operacao > 0 && operacao <=3) {

            switch (operacao) {
                case 1:
                	
                    Random random = new Random();
                    numCaixa = random.nextInt(11);
                    System.out.println("Caixa " + numCaixa + " Liberado");
                    atende.efetuaAtendimento(numCaixa);
                               
                    System.out.println("");
                    System.out.println("Digite a operação que deseja efetuar: ");
                    System.out.println("1 - Solicitar Proximo Cliente ");
                    System.out.println("2 - Registrar Chegada de Cliente ");
                    System.out.println("3 - Quantidade de Pessoas nas Filas: ");
                    System.out.println("4 - Sair: ");
                    
                    ope = entrada.next();
                    operacao = Integer.parseInt(ope);

                    break;
                case 2:
                	
                    System.out.println("Informe o nome do cliente!");
                    nome = entrada.next();
                    System.out.println("Informe a idade do cliente");
                    idade = entrada.nextInt();
                    
                    cliente = new Cliente(idade, nome);
                    filaCliente.addCliente(cliente);
                    
                    System.out.println("");
                    System.out.println("Digite a operação que deseja efetuar: ");
                    System.out.println("1 - Solicitar Proximo Cliente ");
                    System.out.println("2 - Registrar Chegada de Cliente ");
                    System.out.println("3 - Quantidade de Pessoas nas Filas: ");
                    System.out.println("4 - Sair: ");
                    
                    ope = entrada.next();
                    operacao = Integer.parseInt(ope);

                    break;

                case 3:
                	
                	System.out.println("Fila atual de atendimento: ");
                	
                    System.out.println("Normal: ");
                    System.out.println(atende.quantidadeNormal());
                    
                    System.out.println("Prioritaria: ");
                    System.out.println(atende.quantidadePrioritario());

                    System.out.println("");
                    System.out.println("Digite a operação que deseja efetuar: ");
                    System.out.println("1 - Solicitar Proximo Cliente ");
                    System.out.println("2 - Registrar Chegada de Cliente ");
                    System.out.println("3 - Quantidade de Pessoas nas Filas: ");
                    System.out.println("4 - Sair: ");
                    
                    ope = entrada.next();
                    operacao = Integer.parseInt(ope);
                    
                default:
                    break;
            }

        }

    }

}
