package lista04.questao01;

import java.util.Objects;

public class Animais {
    private String nome;

    public Animais(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animais animais = (Animais) o;
        return Objects.equals(nome, animais.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
