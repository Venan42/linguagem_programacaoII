package atividade_aquecimento02;

public class Candidato {
    private int idade;
    private String nome;
    private char sexo;
    private int partido;
    private int votos;

    public Candidato(String nome, int idade, char sexo, int partido) throws IllegalArgumentException{
        if(idade < 21){
            throw new IllegalArgumentException(idade +" é uma idade inválida");
        } else if(Character.toLowerCase(sexo) != 'f' && Character.toLowerCase(sexo) != 'm') {
            throw new IllegalArgumentException(sexo + " é um caractere inválido!");
        } else if(partido < 0 || partido > 99) {
            throw new IllegalArgumentException(partido + " não é um partido válido!");
        }
        this.partido = partido;
        this.sexo = sexo;
        this.idade = idade;
        this.nome = nome;
        votos = 0;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getPartido() {
        return partido;
    }

    public int getVotos() {
        return votos;
    }

    public void adicionarVoto(){
        this.votos++;
    }
    
    
}
