package Sistema.Models;

import java.util.Date;

public class Vacina {

    private String nomeVacina;
    private String marcaVacina;
    private String dataAplicacao;

    public Vacina (String nomeVacina, String marcaVacina, String dataAplicacao, String descVacina) {
        this.nomeVacina = nomeVacina;
        this.marcaVacina = marcaVacina;
        this.dataAplicacao = dataAplicacao;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getMarcaVacina() {
        return marcaVacina;
    }

    public void setMarcaVacina(String marcaVacina) {
        this.marcaVacina = marcaVacina;
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    @Override
    public String toString() {
        return "Vacina{" +
                "nomeVacina='" + nomeVacina + '\'' +
                ", marcaVacina='" + marcaVacina + '\'' +
                ", dataAplicacao=" + dataAplicacao +
                '}';
    }
}
