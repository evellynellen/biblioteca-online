package src.models;
import java.util.Date;

public class emprestimo {
    private livro livro;
    private usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " + usuario.getNome() + ",m Empréstimo: " + dataEmprestimo + ", Devolução: " + dataDevolucao;
    }
}
