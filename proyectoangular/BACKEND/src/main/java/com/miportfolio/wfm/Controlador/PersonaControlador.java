package com.miportfolio.wfm.Controlador;

import com.miportfolio.wfm.Entidad.Persona;
import com.miportfolio.wfm.Interfaz.IPersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonaControlador {
    @Autowired IPersonaServicio ipersonaservicio;
    @GetMapping("personas/traer")
    public List<Persona>getPersona(){
    return ipersonaservicio.getPersona();}

    @PostMapping("personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaservicio.savePersona(persona);
        return "se creo satisfactoriamente la persona";
    }
    
    @DeleteMapping("personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaservicio.deletePersona(id);
        return "la persona fue eliminada con exito";
    }

    @PutMapping("personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre")String nuevoNombre,
                                @RequestParam("apellido")String nuevoApellido,
                                @RequestParam("img")String nuevoImg){
        Persona persona=ipersonaservicio.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        ipersonaservicio.savePersona(persona);
        return persona ;
    
    }
    

}



