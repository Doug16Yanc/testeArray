import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean valor = true;
        int tipoClasse, opcao, assento, assento1;
        int [] economico = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] executivo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int econ[] = new int[10];
        int exec[] = new int[10];


        System.out.println("Bem-vindo(a) ao nosso sistema rodoviário de transporte.\n");
        System.out.println("Nossas opções de poltrona para viagem.\n");

        System.out.println("Classe econômica:\n");

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("%n%s\n", economico[i]);
        }

        System.out.println("Classe executiva:\n");

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("%n%s\n", executivo[i]);
        }

        while(valor)
        {
            System.out.printf("\nDigite uma opção para darmos continuidade!\n1-Vender passagem\n2-Mostrar mapa de ocupação\n3-Encerrar\n");
            opcao = scanner.nextInt();

            if (opcao == 1)
            {
                System.out.println("Você escolheu vender passagem!\n");
                System.out.printf("Digite a alternativa de classe do cliente:\n1-Classe econômica\n2-Classe executiva\n");
                tipoClasse = scanner.nextInt();

                if (tipoClasse == 1)
                {
                    System.out.println("Classe econômica escolhida com sucesso!\n");

                    System.out.printf("Digite a opção de assento:\n");
                    assento = scanner.nextInt();

                    if (econ[assento - 1] == 0)
                    {
                        System.out.println("Venda efetivada com sucesso, faça uma feliz viagem!");

                        econ[assento - 1] = 1;
                    }
                    else
                    {
                        System.out.println("Essa poltrona já está ocupada.");
                    }
                }
                else if (tipoClasse == 2)
                {
                    System.out.println("Classe executiva escolhida com sucesso!\n");

                    System.out.printf("Digite a opção de assento:\n");
                    assento1 = scanner.nextInt();

                    if (exec[assento1 - 1] == 0)
                    {
                        System.out.println("Venda efetivada com sucesso, faça uma feliz viagem!\n");

                        exec[assento1 - 1] = 1;
                    }
                    else
                    {
                        System.out.println("Essa poltrona já está ocupada.\n");
                    }
                }
            }
            else if (opcao == 2) {
                System.out.println("Você escolheu mostrar mapa de ocupação do ônibus!\n");
                System.out.println("\nClasse econômica:\n");

                for (int j = 0; j < 10; j++) {
                    if (econ[j] == 0) {
                        System.out.printf("%n%s-Livre\t", j + 1);

                    } else {
                        System.out.printf("%n%s-Ocupada\t", j + 1);
                    }
                }
                System.out.println("\n");

                System.out.println("\nClasse executiva:\n");

                for (int k = 0; k < 10; k++) {
                    if (exec[k] == 0) {
                        System.out.printf("%n%s-Livre\t", k + 1);

                    } else {
                        System.out.printf("%n%s-Ocupada\t", k + 1);
                    }

                }
            }
            else if (opcao == 3)
            {
                System.out.println("Operação encerrada com sucesso. Nosso sistema agradece sua interação.");

                break;
            }
        }




    }
}