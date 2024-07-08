package ws.cars;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class CarroDTO {
    private Long id;
    private LocalDateTime timestampCadastro;
    private Long modeloId;
    private int ano;
    private String combustivel;
    private int numPortas;
    private String cor;
    private String nomeModelo;
    private double valor;

    public CarroDTO() {

    }

    public CarroDTO(Long id, LocalDateTime timestampCadastro, Long modeloId, int ano, String combustivel, int numPortas, String cor, String nomeModelo, double valor) {
        this.id = id;
        this.timestampCadastro = timestampCadastro;
        this.modeloId = modeloId;
        this.ano = ano;
        this.combustivel = combustivel;
        this.numPortas = numPortas;
        this.cor = cor;
        this.nomeModelo = nomeModelo;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimestampCadastro() {
        return timestampCadastro;
    }

    public void setTimestampCadastro(LocalDateTime timestampCadastro) {
        this.timestampCadastro = timestampCadastro;
    }

    public Long getModeloId() {
        return modeloId;
    }

    public void setModeloId(Long modeloId) {
        this.modeloId = modeloId;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
