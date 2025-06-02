public class Voo {
    protected boolean[] assentos = new boolean[70];

    public Voo() {
    }
    
    public int getProximoAssentoLivre() {
        int assentoLivre = -1;

        for(int i = 0; i < assentos.length; i++) {
            if(assentos[i]) {
                assentoLivre = i + 1;
                break;
            }
        }

        return assentoLivre;
    }

    public boolean isAssentoLivre(int index) {
        boolean aux = false;

        if(assentos[index])
            aux = true;

        return aux;
    }

}
