# Sistema de Chamados

Este projeto é um sistema de gerenciamento de chamados, onde usuários podem criar e gerenciar chamados, além de fornecer soluções para os mesmos.

## Estrutura do Projeto
Controllers/ 
- ChamadoController.java 
- UsuarioController.java
Models/ 
- Chamado.java readme.md

Main.java 

### Controllers

- **ChamadoController.java**: Controlador responsável por gerenciar as operações relacionadas aos chamados.
- **UsuarioController.java**: Controlador responsável por gerenciar as operações relacionadas aos usuários.

### Models

- **Chamado.java**: Classe que representa um chamado no sistema.

### Main

- **Main.java**: Classe principal que contém o método [`main`](command:_github.copilot.openSymbolFromReferences?%5B%22main%22%2C%5B%7B%22uri%22%3A%7B%22%24mid%22%3A1%2C%22fsPath%22%3A%22c%3A%5C%5CUsers%5C%5Css1091316%5C%5CDesktop%5C%5CBackEnd-Java-Softtek%5C%5CMain.java%22%2C%22_sep%22%3A1%2C%22external%22%3A%22file%3A%2F%2F%2Fc%253A%2FUsers%2Fss1091316%2FDesktop%2FBackEnd-Java-Softtek%2FMain.java%22%2C%22path%22%3A%22%2FC%3A%2FUsers%2Fss1091316%2FDesktop%2FBackEnd-Java-Softtek%2FMain.java%22%2C%22scheme%22%3A%22file%22%7D%2C%22pos%22%3A%7B%22line%22%3A6%2C%22character%22%3A23%7D%7D%5D%5D "Go to definition") e a lógica de execução do sistema.

## Como Executar

1. Compile o projeto utilizando o comando:
    ```sh
    javac Main.java
    ```

2. Execute o projeto utilizando o comando:
    ```sh
    java Main
    ```

## Funcionalidades

- **Criar Chamado**: Permite a criação de um novo chamado.
- **Visualizar Chamados**: Permite visualizar todos os chamados existentes.
- **Adicionar Solução**: Permite adicionar uma solução a um chamado existente.

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lógica de execução do sistema
        scanner.close();
    }
}

## Diagrama de Classes

O diagrama de classes do projeto pode ser encontrado em Diagrama de Classes/ diagrama-classes-softtek.drawio.