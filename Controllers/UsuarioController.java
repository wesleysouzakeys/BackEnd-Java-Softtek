package Controllers;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private String nome;
    private String email;
    private String senha;
    private List<ChamadoController> chamados;

    public UsuarioController(String nome, String email, String senha) {
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
        ChamadoController chamado = new ChamadoController(descricao, this);
        chamados.add(chamado);
    }

    public List<ChamadoController> obterChamados() {
        return chamados;
    }
}