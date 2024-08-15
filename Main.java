import java.util.Scanner;

import Controllers.ChamadoController;
import Controllers.UsuarioController;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioController usuario = new UsuarioController("Nome", "email@example.com", "senha123");

        System.out.println("Digite seu email:");
        String email = scanner.nextLine();
        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();

        if (usuario.logar(email, senha)) {
            limpaTerminal();
            System.out.println("Login realizado com sucesso!");
            pulaLinha();

            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Abrir Chamado");
                System.out.println("2. Listar Chamados");
                System.out.println("3. Sair");
                System.out.print("Digite o número da opção desejada: ");

                String input = scanner.nextLine();

                // Validação da opção
                while (!isOpcaoValida(input)) {
                    limpaTerminal();
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida (1, 2 ou 3):");
                    input = scanner.nextLine();
                }

                int opcao = Integer.parseInt(input);

                if (opcao == 1) {
                    pulaLinha();
                    System.out.print("Digite a descrição do chamado: ");
                    String descricao = scanner.nextLine();
                    usuario.abrirChamado(descricao);
                    limpaTerminal();
                    System.out.println("Chamado aberto com sucesso!");
                } else if (opcao == 2) {
                    limpaTerminal();
                    System.out.println("Lista de Chamados:");
                    if (usuario.obterChamados().isEmpty()) {
                        System.out.println("Nenhum chamado encontrado.");
                        System.out.println("");
                        continue;
                    } else {
                        for (ChamadoController chamado : usuario.obterChamados()) {
                            System.out.println(
                                    "ID: " + chamado.getIdChamado() + ", Descrição: " + chamado.getDescricao());
                        }
                        pulaLinha();
                    }
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

    private static boolean isOpcaoValida(String input) {
        try {
            int opcao = Integer.parseInt(input);
            return opcao >= 1 && opcao <= 3;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void limpaTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    private static void pulaLinha() {
        System.out.println("");
    }
}