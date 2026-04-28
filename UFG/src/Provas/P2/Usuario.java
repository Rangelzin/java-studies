package Provas.P2;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Evento> eventos;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.eventos = new ArrayList<>();
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
    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public void adicionarEvento(Evento evento) {
        if (evento != null) {
            this.eventos.add(evento);
        }
    }

    @Override
    public String toString() {
        return "Usuario = " +
                "nome: " + nome + "| " +
                ", email: " + email + "| " +
                ", senha: " + senha + "| " +
                ", eventos: " + eventos +
                " |";
    }
}
