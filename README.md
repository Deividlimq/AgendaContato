# Sistema de Gerenciamento de Contatos

Este é um sistema simples de gerenciamento de contatos desenvolvido em Java, utilizando listas encadeadas. O sistema permite adicionar, buscar, remover e listar contatos por meio de uma interface de linha de comando (CLI). Ele foi projetado para ser funcional em qualquer ambiente que suporte a JVM (Java Virtual Machine), como Windows, Linux e macOS. O projeto é composto por quatro classes principais:

- **Contact**: Representa um contato com nome, telefone e email.
- **Node**: Implementa um nó da lista encadeada contendo um objeto `Contact`.
- **ContactList**: Gerencia a lista encadeada com métodos para adicionar, buscar, remover e listar contatos.
- **ContactManager**: Gerencia a interação do usuário por meio da CLI.

## Requisitos para Execução

- **Java JDK 8** ou superior.
- **Git** (opcional, para clonar o repositório).

## Como Executar o Projeto

1. Clone o repositório usando o comando:

    ```bash
    git clone https://github.com/usuario/gerenciamento-de-contatos.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd gerenciamento-de-contatos
    ```

3. Compile o código-fonte com o seguinte comando:

    ```bash
    javac src/*.java
    ```

4. Execute o programa com o comando:

    ```bash
    java src/ContactManager
    ```

Isso iniciará o sistema, exibindo um menu que permite ao usuário adicionar, buscar, remover e listar contatos.

## Funcionamento do Sistema

O sistema foi construído utilizando listas encadeadas para o gerenciamento dinâmico dos contatos. Cada nó da lista encadeada aponta para o próximo, permitindo inserção e remoção eficientes. O sistema realiza uma busca linear para encontrar contatos por nome ou número de telefone.


## Contribuição

O código está disponível publicamente no GitHub e está sob a licença MIT, permitindo sua livre modificação e distribuição. Para quem quiser contribuir, o repositório pode ser acessado no link abaixo:

[https://github.com/Deividlimq/AgendaContato.git
