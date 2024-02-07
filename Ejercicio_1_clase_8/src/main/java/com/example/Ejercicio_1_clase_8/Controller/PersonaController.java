package com.example.Ejercicio_1_clase_8.Controller;

import com.example.Ejercicio_1_clase_8.Model.Persona;
import com.example.Ejercicio_1_clase_8.Service.IPersonaService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private IPersonaService personaServ;

    @GetMapping("/traer")
    public List<Persona> getPersonas() {
        return personaServ.getPersonas();
    }

    @PostMapping("/crear")
    public String savePersona(@RequestBody Persona perso) {
        personaServ.savePersona(perso);
        return "Persona creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        personaServ.deletePersona(id);
        return "Persona eliminadacorrectamente";
    }

    // para hacer un "update" (edición) Hibernate no cuenta con un método específico
    // (como si lo hacía Eclipselink). Por lo que es necesario, buscar la persona
    // a editar, setear sus nuevos valores a nivel lógico y luego enviarlos a la BD
    // mediante el método Save. Recordemos que save es "guardar" por lo que sirve
    // tanto para altas como para modificaciones ya que "guarda" los datos.

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Persona actualizada correctamente"),
            @ApiResponse(responseCode = "204", description = "La persona no existe"),
            @ApiResponse(responseCode = "400", description = "Petición incorrecta"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @PutMapping("/editar/{id}")
    public ResponseEntity<Persona> editPersona(@PathVariable Long id,
                                               @RequestParam("nombre") String nombreModif,
                                               @RequestParam("apellido") String apellidoModif,
                                               @RequestParam("edad") int edadModif) {

        Persona perso = personaServ.findPersona(id);

        if (perso == null) {
            return ResponseEntity.noContent().build();
        }

        perso.setNombre(nombreModif);
        perso.setApellido(apellidoModif);
        perso.setEdad(edadModif);

        personaServ.savePersona(perso);

        return ResponseEntity.ok(perso);
    }

    @GetMapping("/traer/{nombre}")
    public Persona getPersona(@PathVariable String nombre){
        return personaServ.findByNombre(nombre);
    }


}
