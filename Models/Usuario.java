package Models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Chamado> chamados;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.chamados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean logar(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public void abrirChamado(String descricao) {
        Chamado chamado = new Chamado(descricao, this);
        chamados.add(chamado);
    }

    public List<Chamado> obterChamados() {
        return chamados;
    }
}