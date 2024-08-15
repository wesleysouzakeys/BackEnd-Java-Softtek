package Models;

import Controllers.UsuarioController;

public class Chamado {
    protected static int contador = 0;
    protected int idChamado;
    protected String descricao;
    protected UsuarioController usuario;
    protected String solucao;

    public Chamado(String descricao, UsuarioController usuario) {
        this.idChamado = ++contador;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public int getIdChamado() {
        return idChamado;
    }

    public String getDescricao() {
        return descricao;
    }

    public UsuarioController getUsuario() {
        return usuario;
    }

    public String getSolucao() {
        return solucao;
    }

    public void criarSolucao(String solucao) {
        this.solucao = solucao;
    }
}