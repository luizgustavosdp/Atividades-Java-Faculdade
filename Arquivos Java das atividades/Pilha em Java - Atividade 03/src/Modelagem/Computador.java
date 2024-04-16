package Modelagem;

public class Computador {
	
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM;

    // Construtor para inicializar os atributos
    public Computador(String marca, String modelo, String processador, int memoriaRAM) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }

    // Métodos para acessar e modificar os atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    // Método para representar o objeto como String
    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", processador='" + processador + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                '}';
    }
	}