package ws.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ws.cars.entity.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}
