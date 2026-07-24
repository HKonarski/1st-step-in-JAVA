# 🏰 Aventuras no Reino de Java

> Um jogo de RPG desenvolvido em Java para praticar lógica de programação, estruturas de controle, validação de entradas e interação com o usuário.

## 📖 Sobre o projeto

**Aventuras no Reino de Java** é um jogo de RPG executado no terminal. Nele, o jogador cria seu próprio herói, visita uma taverna e recebe a missão de enfrentar um goblin que está ameaçando as plantações da vila.

O projeto foi desenvolvido com o objetivo de colocar em prática os fundamentos da linguagem Java por meio de uma experiência interativa.

## 🎮 História

Ao chegar à cidade, o aventureiro descobre que o taverneiro conhece uma missão perigosa. Antes de revelar os detalhes, porém, ele exige que o jogador compre uma refeição ou bebida.

Depois da compra, o jogador poderá aceitar a missão de enfrentar um goblin. Durante o combate, será necessário escolher entre atacar e defender até que um dos personagens seja derrotado.

## 🧙 Criação do personagem

Todos os personagens começam com os seguintes atributos:

| Atributo | Valor inicial |
|---|---:|
| Vida | 100 |
| Força | 10 |
| Magia | 10 |
| Ouro | 200 |

O jogador deve informar seu nome e escolher uma raça e uma classe.

### Raças

| Raça | Bônus |
|---|---|
| Humano | +5 de Força |
| Elfo | +5 de Magia |

### Classes

| Classe | Bônus |
|---|---|
| Guerreiro | +5 de Força |
| Mago | +5 de Magia |

As entradas são validadas, e o programa continua solicitando uma opção até que o jogador informe um valor válido.

## 🍖 Taverna

Antes de receber a missão, o jogador precisa comprar pelo menos um item:

| Item | Preço |
|---|---:|
| Carne | 12 moedas de ouro |
| Cerveja | 5 moedas de ouro |

Após a primeira compra, o jogador poderá continuar comprando enquanto possuir ouro ou seguir para a missão.

## ⚔️ Sistema de combate

O goblin possui os seguintes atributos:

| Atributo | Valor |
|---|---:|
| Vida | 100 |
| Força | 10 |

A cada rodada, o jogador escolhe entre duas ações:

- **Atacar:** causa dano com base no atributo principal da classe e em um número aleatório.
- **Defender:** reduz pela metade o dano causado pelo próximo ataque do goblin.

### Cálculo dos ataques

```text
Ataque do Guerreiro = número aleatório de 1 a 10 + (força / 2)

Ataque do Mago = número aleatório de 1 a 10 + (magia / 2)

Ataque do Goblin = número aleatório de 1 a 8 + (força / 2)
```

Depois do ataque do jogador, o goblin realiza seu turno. O combate continua até que a vida do jogador ou do goblin chegue a zero.

## 🏆 Recompensas

Ao derrotar o goblin, o personagem recebe:

| Recompensa | Valor |
|---|---:|
| Ouro | +200 |
| Força | +10 |
| Magia | +10 |
| Vida | +100 |

Caso o jogador seja derrotado ou recuse a missão, o jogo é encerrado com uma mensagem correspondente.

## 🧠 Conceitos aplicados

- Variáveis e tipos de dados
- Estruturas condicionais com `if`, `else` e `switch`
- Laços de repetição com `while` e `do-while`
- Entrada de dados com `Scanner`
- Validação das entradas do usuário
- Geração de números aleatórios
- Operadores aritméticos e relacionais
- Controle do fluxo da aplicação
- Organização da lógica em diferentes etapas

## 🧩 Etapas do jogo

1. Criação e configuração do personagem
2. Interação e compras na taverna
3. Aceitação ou recusa da missão
4. Combate contra o goblin
5. Exibição do resultado e das recompensas

## 🛠️ Tecnologias utilizadas

- Java
- Git
- GitHub

## ▶️ Como executar

### Pré-requisitos

Para executar o projeto, é necessário ter o **JDK** instalado.

### Execução pelo terminal

1. Clone o repositório:

```bash
git clone [github.com](https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git)
```

2. Entre na pasta do projeto:

```bash
cd SEU-REPOSITORIO
```

3. Compile o arquivo principal:

```bash
javac NomeDaClassePrincipal.java
```

4. Execute o jogo:

```bash
java NomeDaClassePrincipal
```

> Substitua `SEU-USUARIO`, `SEU-REPOSITORIO` e `NomeDaClassePrincipal` pelos dados reais do projeto.

## 🚀 Possíveis melhorias

- Adicionar novos inimigos
- Implementar um sistema de experiência e níveis
- Criar mais raças e classes
- Adicionar novas opções de compra na taverna
- Criar habilidades especiais para cada classe
- Adicionar poções e equipamentos
- Implementar novas ações durante o combate
- Salvar e carregar o progresso do jogador

## 🎯 Objetivo de aprendizagem

Este projeto demonstra a aplicação prática dos fundamentos da linguagem Java, com destaque para **lógica de programação, validação de dados, estruturas de decisão, laços de repetição e interação pelo terminal**.

Além do funcionamento do jogo, o desenvolvimento busca valorizar a clareza, a organização e a legibilidade do código.

---

## 🌎 English

### About the project

**Adventures in the Java Kingdom** is a terminal-based RPG developed to practice Java fundamentals and programming logic.

The player creates a hero by selecting a race and a class, visits a tavern, purchases an item, and receives a mission to defeat a goblin threatening the village's farms.

### Main features

- Character creation
- Human and Elf races
- Warrior and Mage classes
- Attribute and bonus system
- Tavern purchasing system
- User input validation
- Randomized turn-based combat
- Attack and defense actions
- Victory rewards
- Different game outcomes

### Concepts applied

- Variables and data types
- Conditional statements using `if`, `else`, and `switch`
- Loops using `while` and `do-while`
- User input with `Scanner`
- Input validation
- Random number generation
- Arithmetic and relational operators
- Application flow control

### Learning purpose

This project demonstrates the practical application of Java fundamentals, especially **programming logic, input validation, decision structures, loops, and terminal-based user interaction**.

It also reflects my progress in writing clearer, more organized, and readable code.
