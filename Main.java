import java.util.Scanner;
import Models.Usuario;
import Models.Chamado;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("Nome", "email@example.com", "senha123");

        System.out.println("Digite seu email:");
        String email = scanner.nextLine();
        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();

        if (usuario.logar(email, senha)) {
            System.out.println("Login realizado com sucesso!");

            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Abrir Chamado");
                System.out.println("2. Listar Chamados");
                System.out.println("3. Sair");
                System.out.print("Digite o número da opção desejada: ");

                String input = scanner.nextLine();

                // Validação da opção
                while (!isValidOption(input)) {
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida (1, 2 ou 3):");
                    input = scanner.nextLine();
                }

                int opcao = Integer.parseInt(input);

                if (opcao == 1) {
                    System.out.println("Abrindo chamado...");
                    // Lógica para abrir chamado
                } else if (opcao == 2) {
                    System.out.println("Listando chamados...");
                    // Lógica para listar chamados
                } else if (opcao == 3) {
                    System.out.println("Saindo...");
                    break;
                }
            }
        } else {
            System.out.println("Email ou senha incorretos.");
        }
        scanner.close();
    }

    private static boolean isValidOption(String input) {
        try {
            int opcao = Integer.parseInt(input);
            return opcao >= 1 && opcao <= 3;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}