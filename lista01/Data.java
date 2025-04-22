public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    //Questão 01
    public String mostrarData() {
        String dataString = "";
        dataString += this.getDia() < 10 ? "0" + this.getDia() + "/" : this.getDia() + "/"; 
        dataString += this.getMes() < 10 ? "0" + this.getMes() + "/" : this.getMes() + "/" ;
        dataString += this.getAno();

        return dataString;
    }

    //Questão 2
    public int getDiasTerminoAno() {
        int dias = 0;
        int[] qtdDias;
        if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
            qtdDias = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        else 
            qtdDias = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for(int i = this.getMes() - 1; i < qtdDias.length; i++) {
            dias += qtdDias[i];
        }
        return dias - this.getDia();
    }

    public static void main(String[] args) {
        Data d1 = new Data(20, 11, 1998);

        System.out.println(d1.mostrarData() + "\nFaltam " + d1.getDiasTerminoAno() + " dias para acabar o ano");
    }

}
