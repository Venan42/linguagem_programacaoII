public class VagaEstacionamento {
    private boolean ocupada;
    private String placaVeiculo;

    public VagaEstacionamento(boolean ocupada, String placaVeiculo) {
        this.ocupada = ocupada;
        this.placaVeiculo = placaVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public boolean getOcupacao(){
        return ocupada;
    }

    public void setPlacaVeiculo(String placaVeiculo){
        this.placaVeiculo = placaVeiculo;
    }

    public void setOcupacao(boolean ocupada){
        this.ocupada = ocupada;
    }
}
