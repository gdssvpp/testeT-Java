package ws.cars.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "modelo")
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "modelo", cascade = CascadeType.ALL)
    private List<Carro> carros;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    private String nome;

    private Double valorFipe;

    public Modelo() {
    }

    public Modelo(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(Double valorFipe) {
        this.valorFipe = valorFipe;
    }
}
