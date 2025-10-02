import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        // Tarefa 12a: Adicionar Scanner no início
        Scanner scanner = new Scanner(System.in);

        // === TAREFAS 10-11: CRIAR E EXIBIR 6 PRODUTOS ===
        System.out.println("=== PRODUTOS PRÉ-DEFINIDOS ===");

        // Tarefa 10a: Dois produtos com construtor padrão
        Produto p1 = new Produto();
        p1.setNumeroItem(1);
        p1.setNomeProduto("CD Greatest Hits");
        p1.setUnidadesEstoque(25);
        p1.setPrecoUnitario(29.99);

        Produto p2 = new Produto();
        p2.setNumeroItem(2);
        p2.setNomeProduto("DVD Matrix");
        p2.setUnidadesEstoque(15);
        p2.setPrecoUnitario(39.90);

        // Tarefa 10b: Quatro produtos com construtor parametrizado
        Produto p3 = new Produto(3, "Software Windows 10", 8, 299.99);
        Produto p4 = new Produto(4, "Mouse Gamer", 30, 89.90);
        Produto p5 = new Produto(5, "Teclado Mecânico", 12, 199.99);
        Produto p6 = new Produto(6, "Monitor 24\"", 5, 799.90);

        // Tarefa 16: Definir ativo como falso para p1 ANTES de exibir
        p1.setAtivo(false);

        // Tarefa 11: Exibir detalhes de cada produto
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        // === TAREFAS 12-13: ENTRADA DO USUÁRIO ===
        System.out.println("\n=== ENTRADA DE DADOS DO USUÁRIO ===");

        // Tarefa 12b: Variáveis locais temporárias
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;

        // Tarefa 12c: Solicitar valores para p1 do usuário
        System.out.println("Digite os dados para o primeiro produto:");

        System.out.print("Número do item: ");
        tempNumber = scanner.nextInt();

        scanner.nextLine(); // Limpar buffer

        System.out.print("Nome do produto: ");
        tempName = scanner.nextLine();

        System.out.print("Quantidade em estoque: ");
        tempQty = scanner.nextInt();

        System.out.print("Preço unitário: ");
        tempPrice = scanner.nextDouble();

        // Tarefa 12d: Criar objeto p1 com construtor de 4 parâmetros
        Produto usuarioProduto1 = new Produto(tempNumber, tempName, tempQty, tempPrice);

        // Tarefa 13a: Solicitar valores para p2 do usuário
        scanner.nextLine(); // Tarefa 13c: Limpar buffer de entrada

        System.out.println("\nDigite os dados para o segundo produto:");

        System.out.print("Número do item: ");
        tempNumber = scanner.nextInt();

        scanner.nextLine(); // Limpar buffer

        System.out.print("Nome do produto: ");
        tempName = scanner.nextLine();

        System.out.print("Quantidade em estoque: ");
        tempQty = scanner.nextInt();

        System.out.print("Preço unitário: ");
        tempPrice = scanner.nextDouble();

        Produto usuarioProduto2 = new Produto(tempNumber, tempName, tempQty, tempPrice);

        // Tarefa 16: Definir usuarioProduto1 como descontinuado
        usuarioProduto1.setAtivo(false);

        // Tarefa 13d: Exibir produtos do usuário
        System.out.println("\n=== PRODUTOS DO USUÁRIO ===");
        System.out.println(usuarioProduto1);
        System.out.println(usuarioProduto2);

        // === TAREFAS 19-22: SISTEMA DE ARRAY ===
        System.out.println("\n=== SISTEMA DE ARRAY DE PRODUTOS ===");

        // Tarefa 19a: Variável maxSize
        int maxSize;

        // Tarefa 19b: Prompt para número de produtos
        // Tarefa 19c: Loop do-while para validação
        do {
            System.out.println("Insira o número de produtos que gostaria de adicionar:");
            System.out.println("Insira \"0\" (zero) se não quiser adicionar mais produtos:");
            maxSize = scanner.nextInt();

            if (maxSize < 0) {
                System.out.println("Valor incorreto inserido!");
            }
        } while (maxSize < 0);

        // Tarefa 20a: Tratar valor zero
        if (maxSize == 0) {
            System.out.println("Não há produtos!");
        } else {
            // Tarefa 20b: Criar array unidimensional
            Produto[] produtos = new Produto[maxSize];

            // Tarefa 21a: Loop for para preencher array
            for (int i = 0; i < maxSize; i++) {
                // Tarefa 21b: Limpar buffer de entrada
                scanner.nextLine();

                System.out.println("\nDigite os dados para o produto " + (i + 1) + ":");

                // Tarefa 21c: Obter entrada do usuário para todos os campos
                System.out.print("Número do item: ");
                tempNumber = scanner.nextInt();

                scanner.nextLine(); // Limpar buffer

                System.out.print("Nome do produto: ");
                tempName = scanner.nextLine();

                System.out.print("Quantidade em estoque: ");
                tempQty = scanner.nextInt();

                System.out.print("Preço unitário: ");
                tempPrice = scanner.nextDouble();

                // Tarefa 21d: Adicionar objeto ao array
                produtos[i] = new Produto(tempNumber, tempName, tempQty, tempPrice);
            }

            // Tarefa 22: Loop for each para exibir produtos
            System.out.println("\n=== TODOS OS PRODUTOS NO ARRAY ===");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }

        // Tarefa 13e: Fechar Scanner
        scanner.close();

        System.out.println("Programa finalizado!");
    }
}