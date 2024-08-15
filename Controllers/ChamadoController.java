package Controllers;

import Models.Chamado;

public class ChamadoController extends Chamado {
    public ChamadoController(String descricao, UsuarioController usuario) {
        super(descricao, usuario);
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