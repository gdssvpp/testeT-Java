package ws.cars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ws.cars.entity.Marca;
import ws.cars.entity.Modelo;
import ws.cars.service.ModeloService;

import java.util.List;

@RestController
@RequestMapping("/modelo")
@CrossOrigin(origins = "*")
public class ModeloController {

    @Autowired
    private ModeloService modeloService;

    @GetMapping
    public List<Modelo> getAllModelo() {
        return modeloService.findAll();
    }

    @GetMapping("/{id}")
    public Modelo getModeloById(@PathVariable Long id) {
        return modeloService.findById(id).orElse(null);
    }

    @PostMapping
    public Modelo createModelo(@RequestBody Modelo modelo) {
        return modeloService.save(modelo);
    }

    @PutMapping("/{id}")
    public Modelo updateModelo(@PathVariable Long id, @RequestBody Modelo modelo) {
        return modeloService.updateModelo(id, modelo);
    }

    @DeleteMapping("/{id}")
    public void deleteModelo(@PathVariable Long id) {
        modeloService.deleteById(id);
    }
}
