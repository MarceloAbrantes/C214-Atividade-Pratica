# Sistema de Gerenciamento de Professores

Este é um sistema de gerenciamento de professores que permite cadastrar, validar e salvar informações dos professores em arquivos JSON.

## Visão Geral

O sistema foi desenvolvido em Java e utiliza a biblioteca Gson para manipulação de objetos JSON. Ele oferece funcionalidades para validar dados de entrada, como nome, sala, período e horário, além de converter esses dados em formato JSON e salvar em arquivos.

## Requisitos do Sistema

- Java JDK 8 ou superior
- Biblioteca Gson (incluída no projeto)

## Main

- Na main é solicitada as informações do professor que são: ID, Nome, Dia da semana, Dia da semana, Horário de atendimento, Período, Sala.
- Com o Scanner é lida as informações pedida ao usuário
- As informações são validadas com a classe Autenticador
- Concatena o dia e horário
- É criado o Jason com as informações fornecidas pelo usuário

## Autenticador

- Tem como função validar as informações inseridas pelo usuário
- Exemplo: O método validaId verifica se o ID fornecido é um número positivo. Retorna true se o ID for maior que zero e false caso contrário.

## Classe Professor

- Nela está o objeto professor com todos os atributos que foram pedidos e é feito os getters e setters.

## Classe ProfessorBusca

- É responsável por buscar informações sobre um professor utilizando o service.
- São criados 2 métodos 'professorBusca(int id)' e 'professorExiste(int id)', o primeiro é responsável por buscar as informações de um professor com base no ID fornecido e retorna um JSON contendo as informações do professor. O segundo método verifica se um professor com o ID fornecido existe.

## Service

- É utilizado pela classe para os métodos: buscaProf e profExiste

## Jason

- Fornece métodos para criar representações JSON de objetos Professor e para salvar essas representações em arquivos.
- No Json é gerado o número do prédio seguindo a informação da sala dada pelo usuário e pela seguinte equação:
- numeroPredio = ((sala - 1) / 5) + 1;
- Vão ser dados 6 prédios já que o número das salas vão ir de 1 a 30

## Autores
[
Marcelo Henrique Souza Abrantes -1538
Gustavo Romos L. Torres -1539
]
