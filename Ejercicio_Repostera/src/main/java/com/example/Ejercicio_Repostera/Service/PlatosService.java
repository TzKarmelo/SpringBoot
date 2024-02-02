package com.example.Ejercicio_Repostera.Service;

import com.example.Ejercicio_Repostera.DTO.PlatosDTO;
import com.example.Ejercicio_Repostera.Model.Ingredientes;
import com.example.Ejercicio_Repostera.Model.Platos;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PlatosService implements IPlatosService{

    @Override
    public PlatosDTO devolverPlato(Long id) {

        Ingredientes ingrediente = new Ingredientes(1L,"Harina","Si");
        Ingredientes ingrediente2 = new Ingredientes(2L,"Huevo","Si");
        Ingredientes ingrediente3 = new Ingredientes(3L,"Salsa soja","No");
        Ingredientes ingrediente4 = new Ingredientes(4L,"Aceite","Si");
        Ingredientes ingrediente5 = new Ingredientes(5L,"Trigo","No");
        Ingredientes ingrediente6 = new Ingredientes(6L,"Carne","Si");
        Ingredientes ingrediente7 = new Ingredientes(7L,"Patata","Si");

        Platos plato1 = new Platos(1L,"Tortilla de patatas",9.5, List.of(ingrediente4,ingrediente7), null);
        Platos plato2 = new Platos(2L,"Carne con patatas",12.5,List.of(ingrediente3,ingrediente6,ingrediente7),null);

        plato1.setApto_celiaco(
                plato1.getIngredientes().stream()
                        .allMatch(ingred -> ingred.getApto_celiaco().equals("Si")) ? "Si" : "No"
        );

        plato2.setApto_celiaco(
                plato2.getIngredientes().stream()
                        .allMatch(ingred -> ingred.getApto_celiaco().equals("Si")) ? "Si" : "No"
        );
        PlatosDTO platoDTO = new PlatosDTO();
        PlatosDTO platoDTO2 = new PlatosDTO();

        platoDTO.setId_plato(plato1.getId_plato());
        platoDTO.setNombre_plato(plato1.getNombre_plato());
        platoDTO.setApto_celiaco(plato1.getApto_celiaco());

        platoDTO2.setId_plato(plato2.getId_plato());
        platoDTO2.setNombre_plato(plato2.getNombre_plato());
        platoDTO2.setApto_celiaco(plato2.getApto_celiaco());

        if (id == 1L) {
            return platoDTO;
        } else {
            return platoDTO2;
        }
    }
}
