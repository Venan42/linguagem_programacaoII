public class Produto {
    private String nome;
    private int quantidadeEstoque;

    public Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void retirarEstoque(int quantidade) throws EstoqueInsuficienteException{
        if(quantidade > quantidadeEstoque)  {
            throw new EstoqueInsuficienteException();
        }
        quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade) throws Exception{
        if(quantidade <= 0){
            throw new Exception("Valor inválido!");
        }

        quantidadeEstoque += quantidade;
    }
}
