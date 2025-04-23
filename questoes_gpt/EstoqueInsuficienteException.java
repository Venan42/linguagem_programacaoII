public class EstoqueInsuficienteException extends Exception {

    public EstoqueInsuficienteException() {
        super("Estoque insuficiente.");
    }

    public EstoqueInsuficienteException(String message) {
        super(message);
    }
    
}
