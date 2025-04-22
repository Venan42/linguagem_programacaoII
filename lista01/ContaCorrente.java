//Questão 04
public class ContaCorrente {
    protected double saldo;

    public ContaCorrente() {
        this(0);
    }

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean registrarDeposito(double valor){
        boolean aux;
        if(valor <= 0) {
            aux = false;
        } else {
            aux = true;
            saldo += valor;
        }
        return aux;
    }

    public boolean registrarSaque(double valor) {
        boolean aux;
        double tarifa = valor * 0.005;
        if(valor <= 0 || valor + tarifa > saldo){
            aux = false;
        } else {
            aux = true;
            saldo -= valor + tarifa;      
        }

        return aux;
    }

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(1000);


        c1.registrarDeposito(100);
        c1.registrarSaque(1100);

        System.out.println(c1.getSaldo());
    }
    
}
