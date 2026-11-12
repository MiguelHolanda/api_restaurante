package seduc.dest1.restaurantes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import seduc.dest1.restaurantes.entities.Restaurante;

public interface RestauranteRepository  extends JpaRepository<Restaurante, Integer> {



}
