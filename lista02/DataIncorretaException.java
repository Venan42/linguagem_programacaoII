package lista02;
public class DataIncorretaException extends Exception {
    public DataIncorretaException(){
        super("Data inválida!");
    }

    public DataIncorretaException(String mensagem){
        super(mensagem);
    }

}
