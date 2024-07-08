package ws.cars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ws.cars.CarroDTO;
import ws.cars.entity.Carro;
import ws.cars.service.CarroService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/carros")
@CrossOrigin(origins = "*")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public Map<String, List<CarroDTO>> getAllCarros() {
        List<CarroDTO> carros = carroService.findAll();
        Map<String, List<CarroDTO>> response = new HashMap<>();
        response.put("carros", carros);
        return response;
    }

    @GetMapping("/{id}")
    public Carro getCarroById(@PathVariable Long id) {
        return carroService.findById(id).orElse(null);
    }

    @PostMapping
    public CarroDTO createCarro(@RequestBody Carro carro) {
        Carro savedCarro = carroService.save(carro);
        return carroService.mapToDTO(savedCarro);
    }

    @PutMapping("/{id}")
    public Carro updateCarro(@PathVariable Long id, @RequestBody Carro carro) {
        return carroService.updateCarro(id, carro);
    }

    @DeleteMapping("/{id}")
    public void deleteCarro(@PathVariable Long id) {
        carroService.deleteById(id);
    }
}
