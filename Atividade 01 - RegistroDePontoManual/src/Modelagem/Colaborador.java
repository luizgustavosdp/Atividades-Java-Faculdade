package Modelagem;

public class Colaborador {
    
    private String nome; // Alterado para String
    private int matricula; // Alterado para int
    private String horarioEntrada; // Alterado para String
    private String horarioSaida; // Alterado para String
    private String dataDoRegistro; // Alterado para String

    // Métodos getters e setters para os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public String getDataDoRegistro() {
        return dataDoRegistro;
    }

    public void setDataDoRegistro(String dataDoRegistro) {
        this.dataDoRegistro = dataDoRegistro;
    }
}
