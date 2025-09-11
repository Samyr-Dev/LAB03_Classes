package Classes_Atributos_Metodos.Exer1;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos() {
        this.nome = "";
        this.preco = 0;
        this.quantidade = 0;
    }

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorEstoque(){
        return (preco*quantidade);
    }

    public int adicionarEstoque(int qtd){

        if (qtd > 0){
            this.quantidade = quantidade + qtd;
        }

        return quantidade;
    }
}
