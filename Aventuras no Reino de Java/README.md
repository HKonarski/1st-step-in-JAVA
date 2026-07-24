Aventuras no Reino de
Java
Descrição do Jogo
Olá, aventureiros e programadores! Vamos embarcar em uma jornada mágica pelo
Reino de Java.
Neste projeto, você criará seu próprio herói, escolhendo entre as raças Humano e
Elfo, e as classes Guerreiro e Mago. Sua missão começa na Taverna, onde você
terá a oportunidade de comprar uma refeição e descobrir uma perigosa missão:
enfrentar um goblin que está ameaçando as plantações locais!
Conceitos de Programação Aplicados
Nesta aventura, vocês aplicarão conceitos conceitos como:
1. Estruturas Condicionais (if/else/switch): Utilizadas para tomada de decisões
na criação do personagem e durante o combate
2. Loops (while, do-while): Controle do sistema de batalha e interações do jogo
3. Geração de Números Aleatórios: Criação de um sistema de combate
dinâmico e imprevisível
4. Entrada de Dados: Interação com o jogador usando Scanner
5. Variáveis e Tipos de Dados: Armazenamento de atributos do personagem e
estado do jogo
Detalhes do Projeto
O jogador ao iniciar deve criar seu personagem. Todos os personagens começam
com os seguintes status:
Vida: 100;
Força: 10;
Magia: 10;
Ouro: 200;
O sistema deve solicitar:
Nome:
Raça: Haverão duas disponíveis, Humano e Elfo;
Humano: +5 de Força;
Elfo: +5 de Magia;
Classe: Haverão duas disponíveis: Guerreiro e Mago;
Guerreiro: +5 de Força;
Mago: +5 de Magia;
Deve ser feita a validação se a entrada de dados do usuário está incorreta, e o
sistema deve ficar em loop até que o usuário digite a opção correta.
Após a criação do usuário, o sistema deve imprimir as seguintes mensagens:
**nomeDoPersonagem** você é um **racaDoPersonagem** **classeDoPersona
Você é um bravo aventureiro que ao chegar na cidade, ouviu dizer que o taverne
Sem pensar duas vezes, você vai até sua taverna e encosta no balcão.
> Jogador: - Boa noite, ouvi dizer que você sabe de uma aventura.
> Taverneiro: - Posso lhe contar, mas primeiro beba ou coma algo.
Após isso, deve ser exibido ao usuário o menu da taverna, que consiste em:
Carne: 12 ouros
Cerveja: 5 ouros
O jogador deve obrigatoriamente fazer uma compra antes de avançar para a
missão. O jogo deve permitir que o usuário faça quantas compras quiser até que
tenha ouro, ou escolha ir para a missão.
Ao escolher ver a missão o sistema deve imprimir as seguintes mensagens:
Existe um goblin terrível acabando com as plantações dos fazendeiros da vila.
Derrote o goblin e receba 200 moedas de ouro. Você aceita?
Caso o usuário recuse, o jogo acaba com uma mensagem informativa. Ao aceitar
a missão o sistema deve imprimir as seguintes mensagens:
Você começa a caminhar até as terras do interior da vila.
Em uma das fazendas você encontra o goblin atacando.
O combate inicia. O sistema deve exibir a vida do jogador e a vida do goblin.
O jogador pode escolher entre defender e atacar.
Atacar: O ataque é calculado pelo status principal da classe dividido por 2,
mais um número inteiro randomico de 1 a 10 (tenham cuidado para evitar o
0 como random). O resultado do ataque diminui diretamente da vida do
goblin;
Ataque Goblin = numero randomico entre 1 e 8 + (forca do goblin / 2);
Logo a pós o jogador atacar é a vez do goblin.
O goblin deve possuir os seguintes status:
Vida: 100;
Força: 10;
O goblin vai atacar sempre com força e o calculo é o mesmo:
Ataque Guerreiro = numero randomico entre 1 e 10 + (forca do personagem
Ataque Mago = numero randomico entre 1 e 10 + (magia do personagem /
Defender: Ao escolher a defesa, o sistema vai gerar o ataque do Goblin
mas dividir pela metade.
Ao derrotar o goblin, o jogo acaba e o jogador recebe bonus exibidos em tela:
200 Peças de ouro
10 de força
10 de magia
100 de vida
Caso o personagem seja derrotado, o jogo acaba com uma mensagem
motivadora.
Estrutura de Desenvolvimento
1. Criação de personagem
2. Interação na taverna
3. Sistema de combate
4. Resultado final (vitória ou derrota)
Dicas para os Estudantes
Prestem atenção aos detalhes de implementação
Entendam como cada estrutura de controle funciona
Comentem o código para explicar sua lógica
Desafios Extras
Para os mais ambiciosos, algumas ideias de expansão:
Adicionar mais tipos de inimigos
Implementar um sistema de experiência
Criar mais opções de compra na taverna
Adicionar mais ações durante o combate
Critérios de Avaliação
Correta implementação da funcionalidade e conceitos de programação
Clareza e organização do código
Tratamento de casos de erro e entrada do usuário
Conclusão
Este projeto não é apenas um jogo, mas uma jornada de aprendizado. Cada linha
de código é um passo em sua aventura de programação!
Lembrem-se: na programação, assim como em uma batalha contra um goblin, a
persistência e a criatividade são suas maiores armas. Boa sorte, jovens
programadores! Que o código esteja com vocês! Estejam prontos para uma
aventura épica no Reino de Java! 🏰🐉🗡💻🧙‍♂️