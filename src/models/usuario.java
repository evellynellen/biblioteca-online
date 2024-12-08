package src.models;
import java.util.ArrayList;

public class usuario {
    private int id;
    private String nome;
    private String email;
    private ArrayList<emprestimo> emprestimos; // historico de emprestimos

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.emprestimos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Emprestimo> gEmprestimos() {
        return emprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
    }

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Email: " + email;
    }
}
