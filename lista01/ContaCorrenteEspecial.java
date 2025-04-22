//Questão 05
public class ContaCorrenteEspecial extends ContaCorrente{
    public ContaCorrenteEspecial() {
        this(0);
    }

    public ContaCorrenteEspecial(double saldo) {
        super(saldo);
    }
    @Override
    public boolean registrarSaque(double valor) {
        boolean aux;
        double tarifa = valor * 0.001;
        if(valor <= 0 || valor + tarifa > saldo){
            aux = false;
        } else {
            aux = true;
            saldo -= valor + tarifa;      
        }

        return aux;
    }


}
