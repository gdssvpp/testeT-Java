package ws.cars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ws.cars.CarroDTO;
import ws.cars.entity.Carro;
import ws.cars.entity.Marca;
import ws.cars.entity.Modelo;
import ws.cars.repository.CarroRepository;
import ws.cars.repository.MarcaRepository;
import ws.cars.repository.ModeloRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private ModeloRepository modeloRepository;

    @Autowired
    private MarcaRepository marcaRepository;

    public CarroDTO mapToDTO(Carro carro) {
        return new CarroDTO(
                carro.getId(),
                carro.getTimestampCadastro(),
                carro.getModelo().getId(),
                carro.getAno(),
                carro.getCombustivel(),
                carro.getNumPortas(),
                carro.getCor(),
                carro.getModelo().getNome(),
                carro.getModelo().getValorFipe()
        );
    }

    public List<CarroDTO> findAll() {
        List<Carro> carros = carroRepository.findAll();
        return carros.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public Optional<Carro> findById(Long id) {
        return carroRepository.findById(id);
    }

    public Carro save(Carro carro) {
        carro.setTimestampCadastro(LocalDateTime.now());
        Modelo modelo = modeloRepository.findById(carro.getModelo().getId()).orElseThrow(() -> new RuntimeException("Modelo não encontrado"));
        Marca marca = marcaRepository.findById(carro.getMarca().getId()).orElseThrow(() -> new RuntimeException("Marca não encontrada"));
        carro.setModelo(modelo);
        carro.setMarca(marca);
        return carroRepository.save(carro);
    }

    public void deleteById(Long id) {
        carroRepository.deleteById(id);
    }

    public Carro updateCarro(Long id, Carro carro) {
        Carro carroUpdate = carroRepository.findById(id).orElse(null);
        Modelo modelo = modeloRepository.findById(carro.getModelo().getId()).orElseThrow(() -> new RuntimeException("Modelo não encontrado"));
        Marca marca = marcaRepository.findById(carro.getMarca().getId()).orElseThrow(() -> new RuntimeException("Marca não encontrada"));


        if (carroUpdate != null) {
            carroUpdate.setMarca(carro.getMarca());
            carroUpdate.setModelo(carro.getModelo());
            carroUpdate.setAno(carro.getAno());
            carroUpdate.setTimestampCadastro(LocalDateTime.now());
            carroUpdate.setCombustivel(carro.getCombustivel());
            carroUpdate.setCor(carro.getCor());
            carroUpdate.setNumPortas(carro.getNumPortas());
            carro.setModelo(modelo);
            carro.setMarca(marca);
            carro.setTimestampCadastro(LocalDateTime.now());
            carroRepository.save(carroUpdate);
        } else {
            return null;
        }
        return carroUpdate;
    }
}
