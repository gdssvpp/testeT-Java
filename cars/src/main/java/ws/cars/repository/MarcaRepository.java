package ws.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ws.cars.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
