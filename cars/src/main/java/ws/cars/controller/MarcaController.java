package ws.cars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ws.cars.entity.Carro;
import ws.cars.entity.Marca;
import ws.cars.service.MarcaService;

import java.util.List;

@RestController
@RequestMapping("/marca")
@CrossOrigin(origins = "*")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public List<Marca> getAllMarca() {
        return marcaService.findAll();
    }

    @GetMapping("/{id}")
    public Marca getMarcaById(@PathVariable Long id) {
        return marcaService.findById(id).orElse(null);
    }

    @PostMapping
    public Marca createMarca(@RequestBody Marca marca) {
        return marcaService.save(marca);
    }

    @PutMapping("/{id}")
    public Marca updateMarca(@PathVariable Long id, @RequestBody Marca marca) {
        return marcaService.updateMarca(id, marca);
    }

    @DeleteMapping("/{id}")
    public void deleteMarca(@PathVariable Long id) {
        marcaService.deleteById(id);
    }
}
