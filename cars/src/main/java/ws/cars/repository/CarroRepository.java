package ws.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ws.cars.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
