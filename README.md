# Exercícios de Estrutura de Dados

Este repositório contém a implementação de vários exercícios de estrutura de dados utilizando Java. Cada exercício está organizado em pacotes específicos de acordo com o tipo de estrutura de dados utilizado.

## Estrutura de Diretórios

A estrutura do projeto está organizada da seguinte forma:

```plaintext
ExerciciosEstruturaDeDados
├── .idea
├── .mvn
├── src
│   ├── main
│   │   ├── java
│   │   │   └── exerciciosestruturadedados
│   │   │       ├── filas
│   │   │       │   ├── processos
│   │   │       │   │   ├── Main.java
│   │   │       │   │   ├── Process.java
│   │   │       │   │   └── ProcessQueue.java
│   │   │       │   ├── impressoes
│   │   │       │   │   ├── Main.java
│   │   │       │   │   ├── PrintJob.java
│   │   │       │   │   └── PrintQueue.java
│   │   │       │   ├── atendimento
│   │   │       │   │   ├── BankQueue.java
│   │   │       │   │   ├── Customer.java
│   │   │       │   │   └── Main.java
│   │   │       ├── listas
│   │   │       │   ├── encadeadas
│   │   │       │   │   ├── texto
│   │   │       │   │   │   ├── Main.java
│   │   │       │   │   │   ├── TextEditor.java
│   │   │       │   │   │   └── TextNode.java
│   │   │       │   │   ├── cartas
│   │   │       │   │   │   ├── Card.java
│   │   │       │   │   │   ├── Main.java
│   │   │       │   │   │   └── PlayerHand.java
│   │   │       │   │   ├── reversao
│   │   │       │   │   │   ├── Action.java
│   │   │       │   │   │   ├── ActionHistory.java
│   │   │       │   │   │   └── Main.java
│   │   │       │   │   ├── tarefas
│   │   │       │   │   │   ├── Main.java
│   │   │       │   │   │   ├── Task.java
│   │   │       │   │   │   └── TaskManager.java
│   │   │       │   │   ├── navegacao
│   │   │       │   │       ├── BrowsingHistory.java
│   │   │       │   │       ├── Main.java
│   │   │       │   │       └── UrlNode.java
│   │   ├── resources
├── target
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml

```

## Lista Simplesmente Encadeada
1. Gerenciador de Tarefas
Um gerenciador de tarefas onde cada tarefa é um nó em uma lista simplesmente encadeada. Permite adicionar, remover e marcar tarefas como concluídas.

2. Histórico de Navegação
Simula o histórico de navegação de um navegador utilizando uma lista simplesmente encadeada. Permite adicionar novas URLs e remover URLs antigas quando a lista atinge um certo tamanho.

3. Controle de Reversão
Um sistema de controle de reversão (undo) para uma aplicação de edição de texto. Utiliza uma lista simplesmente encadeada para armazenar as ações realizadas e permite que o usuário desfaça as últimas ações.

## Lista Duplamente Encadeada
4. Editor de Texto com Undo/Redo
Um editor de texto simples onde as operações de desfazer (undo) e refazer (redo) são gerenciadas por uma lista duplamente encadeada.

5. Jogo de Cartas
Um jogo simples de cartas onde a mão do jogador é representada por uma lista duplamente encadeada. Permite que o jogador adicione, remova e reorganize as cartas na mão.

## Filas
6. Simulador de Fila de Atendimento
Simula uma fila de atendimento em um banco. Utiliza uma fila para gerenciar os clientes que aguardam atendimento e implementa a lógica para chamar o próximo cliente.

7. Gerenciamento de Impressões
Um sistema de gerenciamento de impressões onde os trabalhos de impressão são enfileirados e processados na ordem em que chegam. Utiliza uma fila para armazenar os trabalhos de impressão.

8. Fila de Processos
Uma fila que simula a fila de processos prontos para execução em um sistema operacional. Permite que novos processos sejam adicionados e que o processo mais antigo seja removido para execução.

## Como Executar
 Para executar qualquer um dos exercícios, navegue até o diretório correspondente e execute a classe Main.java usando seu IDE preferido ou a linha de comando.

 ```plaintext

javac com/example/exerciciosestruturadedados/{package_path}/Main.java
java com/example/exerciciosestruturadedados/{package_path}/Main


 ```

- Substitua {package_path} pelo caminho do pacote específico do exercício que deseja executar.

## Requisitos
 - Java 17

 - IntelliJ IDEA (ou outro IDE de sua preferência)

## Como Clonar e Executar o Projeto
1. Clone o repositório para o seu ambiente local:

   ```plaintext
   

   git clone https://github.com/teofilonicolau/lista_de_tarefas_seven_java_ed.git


    ```
   
2. Navegue até o diretório do projeto:
   
     ```plaintext
   

   cd lista_de_tarefas_seven_java_ed



    ```

 3. Abra o projeto no IntelliJ IDEA (ou outro IDE de sua preferência).

 4. Navegue até a classe Main.java do exercício que deseja executar e inicie a aplicação.    
   

   
