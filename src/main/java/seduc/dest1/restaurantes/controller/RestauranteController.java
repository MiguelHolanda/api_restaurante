package seduc.dest1.restaurantes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seduc.dest1.restaurantes.entities.Restaurante;
import seduc.dest1.restaurantes.repositories.RestauranteRepository;

import java.util.List;

@RestController
@RequestMapping("api/restaurantes")
public class RestauranteController {

    @Autowired
        private RestauranteRepository restauranteRepository;

    @PostMapping
    public Restaurante mostrar(@RequestBody Restaurante r){
        return restauranteRepository.save(r);
    }

    @GetMapping
    public List<Restaurante> mostrar(){
        return restauranteRepository.findAll();
    }

}
