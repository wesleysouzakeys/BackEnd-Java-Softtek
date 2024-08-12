package Models;

public class Chamado {
    private static int contador = 0;
    private int idChamado;
    private String descricao;
    private Usuario usuario;
    private String solucao;

    public Chamado(String descricao, Usuario usuario) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public String getSolucao() {
        return solucao;
    }

    public void criarSolucao(String solucao) {
        this.solucao = solucao;
    }
}