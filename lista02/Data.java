package lista02;

public class Data {
    private int dia; // dia (um inteiro entre 1 e, a depender do mês e ano, 28, 29, 30 ou 31)
    private int mes; // mês (um inteiro entre 1 e 12)
    private int ano; // ano (um inteiro de 4 dígitos)

    // Questão 5
    public Data(int dia, int mes, int ano) throws DataIncorretaException {
        if (ano < 1000 || ano >= 10000) {
            throw new DataIncorretaException("Ano inválido!");
        } else {
            this.ano = ano;
        }
        if (mes < 0 || mes > 12) {
            throw new DataIncorretaException("Mes inválido!");
        } else {
            this.mes = mes;
        }

        int[] qtdDias;
        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
            qtdDias = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        else
            qtdDias = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (dia <= 0 || dia > qtdDias[mes - 1]) {
            throw new DataIncorretaException("Dia inválido!");
        } else {
            this.dia = dia;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // retorno de string representativa da data encapsulada no formado DD/MM/AAAA
    public String mostrarData() {
        return (dia < 10 ? "0" : "") + dia + "/" + (mes < 10 ? "0" : "") + mes + "/" + ano;
    }

    // retorno de quantidade de dias restantes para o término do ano em que se situa
    // a data
    public int getDiasTerminoAno() {
        int diasRestantes = 0;
        // quantidade total de dias de cada mês do ano
        int[] qtdDias = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // alteração de quantidade total de dias do mês de fevereiro se data for de ano
        // bissexto
        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
            qtdDias[1]++;

        diasRestantes = qtdDias[mes - 1] - dia + 1;
        // contabilização de total de dias dos meses subsequentes (até alcançar
        // dezembro)
        for (int i = mes + 1; i <= 12; i++)
            diasRestantes += qtdDias[i - 1]; // acréscimo de total de dias do enésimo mês

        return diasRestantes; // retorno de total de dias restantes
    }
}
