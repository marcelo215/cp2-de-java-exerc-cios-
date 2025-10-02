Informações do Aluno
Nome: Marcelo Affonso Fonseca

RM: 559790

Instituição: FIAP

Disciplina: Java Programming

Projeto: CheckPoint 2 (CP2) - Sistema de Inventário

📋 Descrição do Projeto
Sistema de gerenciamento de inventário desenvolvido em Java para controle de diversos tipos de produtos (CDs, DVDs, softwares, eletrônicos, etc.). O programa permite cadastrar, visualizar e gerenciar produtos com funcionalidades completas de controle de estoque.

🚀 Funcionalidades

✅ Cadastro de produtos com dados completos

✅ Controle de estoque e valores monetários

✅ Sistema de status (Ativo/Descontinuado)

✅ Entrada de dados via usuário

✅ Sistema dinâmico com arrays

✅ Validação de entradas

✅ Relatórios formatados

🏗️ Estrutura do Projeto
text
Inventario/
├── Produto.java          # Classe principal do produto
├── ProductTester.java    # Classe driver/main
└── README.md            # Este arquivo

📊 Classes e Métodos
Classe Produto
Atributos: numeroItem, nomeProduto, unidadesEstoque, precoUnitario, ativo

Construtores: Padrão e parametrizado

Métodos: Getters/Setters, getValorInventario(), toString()

Classe ProductTester
Método main: Controla todo o fluxo do programa

Funcionalidades: Menu interativo, entrada de dados, arrays dinâmicos

🎯 Requisitos Implementados
Tarefas 1-2: Planejamento
Lista de 6 produtos

Tabela com atributos e tipos de dados

Tarefas 3-9: Estrutura Base
Projeto "Inventario"

Classe Produto com campos privados

Construtores (padrão e sobrecarregado)

Métodos getter/setter

Método toString() formatado

Classe driver ProductTester

Tarefas 10-13: Produtos e Entrada
6 objetos Produto (2 padrão + 4 parametrizados)

Exibição no console

Scanner e variáveis temporárias

Entrada do usuário com tratamento de buffer

Tarefas 14-18: Funcionalidades Avançadas
Campo "ativo" booleano

Formatação "Ativo"/"Descontinuado"

Cálculo do valor do inventário

toString() atualizado com todas as informações

Tarefas 19-22: Sistema Dinâmico
Array unidimensional de produtos

Validação com loop do-while

Preenchimento dinâmico do array

Exibição com loop for-each

🖥️ Como Executar
Compilação:
bash
javac Produto.java ProductTester.java
Execução:
bash
java ProductTester

📝 Exemplo de Saída
text
Número do Item      : 1
Nome                : CD Greatest Hits
Quantidade em Estoque   : 25
Preço               : R$ 29.99
Valor do Estoque    : R$ 749.75
Status do Produto   : Descontinuado
