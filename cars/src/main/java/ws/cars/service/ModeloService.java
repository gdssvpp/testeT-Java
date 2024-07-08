package ws.cars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ws.cars.entity.Carro;
import ws.cars.entity.Marca;
import ws.cars.entity.Modelo;
import ws.cars.repository.CarroRepository;
import ws.cars.repository.MarcaRepository;
import ws.cars.repository.ModeloRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloService {

    @Autowired
    private ModeloRepository modeloRepository;

    @Autowired
    private MarcaRepository marcaRepository;

    public List<Modelo> findAll() {
        return modeloRepository.findAll();
    }

    public Optional<Modelo> findById(Long id) {
        return modeloRepository.findById(id);
    }

    public Modelo save(Modelo modelo) {
        Marca marca = marcaRepository.findById(modelo.getMarca().getId()).orElseThrow(() -> new RuntimeException("Marca não encontrada"));
        modelo.setMarca(marca);
        return modeloRepository.save(modelo);
    }

    public void deleteById(Long id) {
        modeloRepository.deleteById(id);
    }

    public Modelo updateModelo(Long id, Modelo modelo) {
        Modelo modeloUpdate = modeloRepository.findById(id).orElse(null);
        Marca marca = marcaRepository.findById(modelo.getMarca().getId()).orElseThrow(() -> new RuntimeException("Marca não encontrada"));


        if (modeloUpdate != null) {
            modeloUpdate.setMarca(modelo.getMarca());
            modeloUpdate.setNome(modelo.getNome());
            modeloUpdate.setValorFipe(modelo.getValorFipe());
            modelo.setMarca(marca);
            modeloRepository.save(modeloUpdate);
        } else {
            return null;
        }
        return modeloUpdate;
    }
}
