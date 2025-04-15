package lista02;

import java.util.Date;
//Questão 7

public class Voo {
    private int tamanho; // capacidade de assentos de cada voo
    // array para indicação de situação de cada assento (livre, se false, ou
    // ocupado, se true)
    protected boolean[] assentos;
    protected int numero; // número de voo
    protected Date dataHorario; // data e horário de voo

    public Voo(int numero, Date dataHorario, int tamanho) {
        // inicialização de array de valores boleanos de acordo com capacidade de
        // assentos
        this.assentos = new boolean[tamanho];
        this.tamanho = tamanho;
        this.numero = numero;
        this.dataHorario = dataHorario;
    }

    public int getNumero() {
        return numero;
    }

    public Date getDataHorario() {
        return dataHorario;
    }

    // obtenção de número de próximo assento livre (entre 1 e a capacidade do voo)
    public int getProximoAssentoLivre() {
        // consulta de situação de assentos de acordo com valores booleanos de array
        for (int i = 0; i < assentos.length; i++) {
            if (!assentos[i]) // se enésimo valor for false (assento livre)...
                return i + 1; // retorno de número de enésimo assento
        }
        return -1; // indicativo de ausência de assentos livres (se for o caso)
    }

    // obtenção de quantidade total de assentos livres
    public int getTotalAssentosLivres() {
        int qtd = 0; // inicialização de totalizador
        // consulta de situação de assentos de acordo com valores booleanos de array
        for (int i = 0; i < assentos.length; i++) {
            if (!assentos[i]) // se enésimo valor for false (assento livre)...
                qtd++; // incremento de totalizador em 1 (um) unidade
        }
        return qtd; // retorno de total de assentos livres
    }

    // obtenção de taxa de ocupação de assentos
    public double getTaxaOcupacao() {
        // obtenção de quantidade de assentos ocupados com base em assentos livres
        int assentosOcupados = assentos.length - getTotalAssentosLivres();
        // cálculo e retorno de percentual de ocupação considerando capacidade de cada
        // voo
        return assentosOcupados * 100.0 / assentos.length;
    }

    // retorno de true se assento indicado por parâmetro for livre (caso contrário,
    // false)
    public boolean isAssentoLivre(int n) throws Exception {
        if (n < 0 || n > tamanho) {
            throw new Exception("Assento não existe!");
        }
        // retorno de operação lógica de negação sobre enésimo valor booleano de array
        // se enésimo valor false, assento livre, caso contrário, assento não livre
        return !assentos[n - 1];
    }

    // reserva de assento com retorno de valor booleano de acordo com resultado da
    // operação
    public boolean ocuparAssento(int n) throws Exception{
        if(n < 0 || n > tamanho){
            throw new Exception("Assento não existe!");
        }
            boolean valor;
            if (!isAssentoLivre(n)) // se assento não estiver livre...
                valor = false; // retorno de false (reserva de assento não efetivada)
            else { // caso contrário...
                   // atualização de valor boleano em índice de array correspondente ao número de
                   // assento
                assentos[n - 1] = true;
                valor = true; // retorno de true (reserva de assento efetivada)
            }

        return valor;
    }

}
