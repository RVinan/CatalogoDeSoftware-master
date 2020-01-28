/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.catalogo.controllador;


import ec.com.cataloglo.servicio.LenguajeFacadeLocal;
import ec.com.catalogo.modelo.Lenguaje;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Rodrigo
 */
@Named("LenguajeControllador")
@ViewScoped
public class LenguajeControllador implements Serializable{
@EJB
private LenguajeFacadeLocal lenguajeEJB;
private Lenguaje lenguaje;
List<Lenguaje> lenguajes;

    public Lenguaje getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(Lenguaje lenguaje) {
        this.lenguaje = lenguaje;
    }

    public List<Lenguaje> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(List<Lenguaje> lenguajes) {
        this.lenguajes = lenguajes;
    }

@PostConstruct
public void init(){
    lenguaje= new Lenguaje();
    lenguajes=lenguajeEJB.findAll();
}
public void crear(){
    lenguajeEJB.create(lenguaje);
    init();
}
public void editar(){
    lenguajeEJB.edit(lenguaje);
    init();
}
public void eliminar(){
    lenguajeEJB.remove(lenguaje);
    init();
}
}
