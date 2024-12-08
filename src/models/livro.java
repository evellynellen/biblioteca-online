public package src.models;

class livro {
    private int id;
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponivel;

    public livro(int id, String tilulo, String autor, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponivel = true; // padrão todos os livros começam disponiveis
    }
    
    // getters e setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Categoria: " + categoria + ", Disponível: " + disponivel;
    }
}