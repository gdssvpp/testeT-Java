package ws.cars.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "carros")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;

    @Column(nullable = false)
    private int ano;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    @Column(nullable = false)
    private String combustivel;

    @Column(nullable = false)
    private int numPortas;

    @Column(nullable = false)
    private String cor;

    private LocalDateTime timestampCadastro;

    public Carro() {
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getTimestampCadastro() {
        return timestampCadastro;
    }

    public void setTimestampCadastro(LocalDateTime timestampCadastro) {
        this.timestampCadastro = timestampCadastro;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
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
}

