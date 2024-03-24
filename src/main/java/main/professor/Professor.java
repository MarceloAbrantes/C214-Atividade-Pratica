package main.professor;

public class Professor {

    private int Id;
    private String Nome;
    private String Horario;
    private String Periodo;
    private String Sala;
    private String Predio;

    public Professor( int id, String nome, String horario, String periodo, String sala, String predio){
        this.Id = id;
        this.Nome = nome;
        this.Horario = horario;
        this.Periodo = periodo;
        this.Sala = sala;
        this.Predio = predio;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String periodo) {
        Periodo = periodo;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String sala) {
        Sala = sala;
    }

    public String getPredio() {
        return Predio;
    }

    public void setPredio(String predio) {
        Predio = predio;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
