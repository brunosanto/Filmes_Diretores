package automacaoTeste.object;

public class DiretorFilmesObject {

    private String nomeDiretor;
    private String nomeFilme;

    public DiretorFilmesObject() {
    }

    public DiretorFilmesObject(String nomeDiretor, String nomeFilme) {
        this.nomeDiretor = nomeDiretor;
        this.nomeFilme = nomeFilme;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    @Override
    public String toString() {
        return "DiretorFilmesObject{" +
                "nomeDiretor='" + nomeDiretor + '\'' +
                ", nomeFilme='" + nomeFilme + '\'' +
                '}';
    }
}
