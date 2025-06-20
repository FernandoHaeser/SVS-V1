package Sistema.Models;

import Sistema.Interfaces.Autenticavel;

import javax.swing.*;
import java.util.ArrayList;

public class Paciente extends Usuario {

    private ArrayList<Vacina> vacinas;

    public Paciente(String primeiroNome, String ultimoNome, String cpf, String senha) {
        super(primeiroNome, ultimoNome, cpf);
        this.vacinas = new ArrayList<>();
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha);
            JOptionPane.showMessageDialog(null,"A senha precisa ser maior!");
    }

    public void adicionarVacina(Vacina vacina) {
        if (vacina != null) {
            vacinas.add(vacina);
        }
    }

    public String exibirHistoricoVacinas() {
        if (vacinas.isEmpty()) {
            return "Nenhuma vacina registrada.";
        }

        StringBuilder historico = new StringBuilder("Histórico de Vacinação:\n");
        for (Vacina vacina : vacinas) {
            historico.append(vacina.toString()).append("\n");
        }

        return historico.toString();
    }

    @Override
    public boolean autenticar(String senha) {
        return getSenha().equals(senha);
    }

    @Override
    public String mostrarInfos() {
        return  "Paciente:\n" +
                "Nome: " + getPrimeiroNome() + " " + getUltimoNome() + "\n" +
                "CPF: " + getCpf();
    }
}
