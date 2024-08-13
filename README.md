# Projeto Heroi

## Descrição

Este projeto em Java define uma classe chamada `Heroi`, projetada para representar um herói em um jogo de aventura. A classe inclui informações básicas sobre o herói e um método que simula uma ação de ataque, com comportamento personalizado dependendo do tipo de herói.

## Funcionalidades

### Classe `Heroi`

* **Propriedades** :
* `nome`: Armazena o nome do herói (ex: "Gandalf", "Aragorn").
* `idade`: Armazena a idade do herói (ex: 1000, 35).
* `tipo`: Armazena o tipo de herói, que determina o estilo de ataque (ex: "mago", "guerreiro", "monge", "ninja").
* **Método `atacar()`** :
* Exibe uma mensagem indicando o tipo de ataque realizado pelo herói.
* O comportamento do ataque é baseado no valor da propriedade `tipo`:
  * **Mago** : "usou magia"
  * **Guerreiro** : "usou espada"
  * **Monge** : "usou artes marciais"
  * **Ninja** : "usou shuriken"
* A mensagem é formatada e exibida no console, fornecendo um feedback sobre a ação realizada pelo herói.

## Estrutura do Projeto

* **Heroi.java** : Contém a implementação da classe `Heroi`, incluindo:
* Definição das propriedades `nome`, `idade`, e `tipo`.
* Construtor para inicializar essas propriedades.
* Método `atacar()` que gera a mensagem apropriada com base no tipo de herói.
* Métodos getters e setters para acessar e modificar as propriedades.