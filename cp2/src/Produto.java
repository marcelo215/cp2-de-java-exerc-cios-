public class Produto {
    // Tarefa 5: Campos de instância privada
    private int numeroItem;
    private String nomeProduto;
    private int unidadesEstoque;
    private double precoUnitario;

    // Tarefa 14a: Campo booleano Ativo
    private boolean ativo;

    // Tarefa 6a: Construtor padrão
    public Produto() {
        // Tarefa 14a: Valor padrão "true"
        this.ativo = true;
    }

    // Tarefa 6b: Construtor com parâmetros
    public Produto(int numeroItem, String nomeProduto, int unidadesEstoque, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.nomeProduto = nomeProduto;
        this.unidadesEstoque = unidadesEstoque;
        this.precoUnitario = precoUnitario;
        // Tarefa 14a: Valor padrão "true"
        this.ativo = true;
    }

    // Tarefa 7: Métodos getter/setter
    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getUnidadesEstoque() {
        return unidadesEstoque;
    }

    public void setUnidadesEstoque(int unidadesEstoque) {
        this.unidadesEstoque = unidadesEstoque;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    // Tarefa 14b: Métodos getter/setter para Ativo
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    // Tarefa 17: Método para valor do inventário
    public double getValorInventario() {
        return precoUnitario * unidadesEstoque;
    }

    // Tarefa 8, 14c, 15, 18: Método toString() evoluído
    @Override
    public String toString() {
        // Tarefa 15: Converter true/false para "Ativo"/"Descontinuado"
        String status = ativo ? "Ativo" : "Descontinuado";

        return "Número do Item\t\t: " + numeroItem + "\n" +
                "Nome\t\t\t: " + nomeProduto + "\n" +
                "Quantidade em Estoque\t: " + unidadesEstoque + "\n" +
                "Preço\t\t\t: R$ " + String.format("%.2f", precoUnitario) + "\n" +
                "Valor do Estoque\t: R$ " + String.format("%.2f", getValorInventario()) + "\n" +
                "Status do Produto\t: " + status + "\n";
    }
}