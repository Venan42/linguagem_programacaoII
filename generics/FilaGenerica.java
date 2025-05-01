package generics;
public class FilaGenerica<E>{
    private E[] dados;
    private int qtd;

    public FilaGenerica() {

    }

    public FilaGenerica(int qtd) {
        this.dados = (E[]) new Object[qtd];
        this.qtd = 0;
    }

    public void adicionar(E elemento)throws Exception{
        if(qtd == dados.length)
            throw new Exception("Fila cheia!");

        dados[qtd] = elemento;
        qtd++;
    }

    public E remover()throws Exception{
        if(qtd == 0)
            throw new Exception("Fila vazia!");
        
        E aux = dados[qtd-1];
        qtd--;
        return aux;
    }

    public E[] removerVarios(int num)throws Exception{
        if(qtd - num < 0)
            throw new Exception("Quantidade inválida!");
        E[] aux = (E[]) new Object[num];
        System.arraycopy(dados, 0, aux, 0, num);
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < qtd-1; j++){
                dados[j] = dados[j+1];
            }
            qtd--;
        }
        return aux;
    }

    public E topo()throws Exception{
        if(qtd == 0)
            throw new Exception("Fila vazia!");
        
        return dados[qtd-1];
    }
    
    public String imprimir(){
        String aux = "[";
        for(int i = 0; i < qtd; i++){
            if(i==qtd-1){
                aux += dados[i];
            } else {
                aux += dados[i] + ", ";
            }
        }
        return aux + "]";
    }
}
