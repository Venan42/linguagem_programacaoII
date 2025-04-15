package atividade_aquecimento02;

import java.util.Random;

public class CandidatoMain {
    public static void main(String[] args) {
        Candidato c1 = new Candidato("Sérgio", 28, 'M', 42);
        Candidato c2 = new Candidato("Larissa", 21, 'f', 10);
        Candidato c3 = new Candidato("Horácio", 71, 'm', 17);
        Candidato c4 = new Candidato("Sandra", 35, 'F', 13);
        Candidato c5 = new Candidato("Quinho", 50, 'M', 55);
        Candidato[] candidatos = {c1, c2, c3, c4, c5};
        Random random = new Random();
        int index;
        for(int i = 0; i < 257784; i++){
            index = random.nextInt(5);
            candidatos[index].adicionarVoto();
        }
 
        System.out.println("A quantidade de votos de " + c1.getNome() +" é: " + c1.getVotos());
        System.out.println("A quantidade de votos de " + c2.getNome() +" é: " + c2.getVotos());
        System.out.println("A quantidade de votos de " + c3.getNome() +" é: " + c3.getVotos());
        System.out.println("A quantidade de votos de " + c4.getNome() +" é: " + c4.getVotos());
        System.out.println("A quantidade de votos de " + c5.getNome() +" é: " + c5.getVotos());

    }
    
}
