import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("*****************************************************");
            System.out.println("Menu principal: ");
            System.out.println("1 - Acessar menu de vendedor");
            System.out.println("2 - Acessar menu de comprador");
            System.out.println("*****************************************************");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Acessando menu de vendedor...");
                    break;
                case 2:
                    System.out.println("Acessando menu de comprador...");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}

