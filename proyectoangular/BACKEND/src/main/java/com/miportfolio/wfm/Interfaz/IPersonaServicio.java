
package com.miportfolio.wfm.Interfaz;

import com.miportfolio.wfm.Entidad.Persona;
import java.util.List;


public interface IPersonaServicio {
    //traer lista persona
    public List<Persona>getPersona();
    
    //guadar objeto tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto
    public void deletePersona(Long id);
    
    //buscar una persona
    public Persona findPersona(Long id);
}
