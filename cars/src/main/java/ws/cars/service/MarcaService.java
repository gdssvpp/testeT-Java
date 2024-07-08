package ws.cars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ws.cars.entity.Carro;
import ws.cars.entity.Marca;
import ws.cars.repository.MarcaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> findAll() {
        return marcaRepository.findAll();
    }

    public Optional<Marca> findById(Long id) {
        return marcaRepository.findById(id);
    }

    public Marca save(Marca marca) {
        return marcaRepository.save(marca);
    }

    public void deleteById(Long id) {
        marcaRepository.deleteById(id);
    }

    public Marca updateMarca(Long id, Marca marca) {
        Marca marcaUpdate = marcaRepository.findById(id).orElse(null);

        if (marcaUpdate != null) {
            marcaUpdate.setMarca(marca.getMarca());
            marcaRepository.save(marcaUpdate);
        } else {
            return null;
        }
        return marcaUpdate;
    }
}
