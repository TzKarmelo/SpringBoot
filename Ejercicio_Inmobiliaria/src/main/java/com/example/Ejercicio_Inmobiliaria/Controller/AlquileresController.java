package com.example.Ejercicio_Inmobiliaria.Controller;

import com.example.Ejercicio_Inmobiliaria.DTO.PropiedadDTO;
import com.example.Ejercicio_Inmobiliaria.Model.Inquilino;
import com.example.Ejercicio_Inmobiliaria.Model.Propiedad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquileresController {

    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable Long id) {

        Inquilino inqui = new Inquilino(1L,"12345678","Walter","White","Profesor");
        Propiedad prop = new Propiedad(152365L,"Casa"," 308 Negra Arroyo Lane", 200.0, 40000.0);

        PropiedadDTO propiDTO = new PropiedadDTO();

        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        propiDTO.setNombre_inquilino(inqui.getNombre());
        propiDTO.setApellido_inquilino(inqui.getApellido());

        return propiDTO;
    }
}
