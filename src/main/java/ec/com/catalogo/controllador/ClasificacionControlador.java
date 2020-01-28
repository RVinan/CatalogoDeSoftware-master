/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.catalogo.controllador;

import ec.com.cataloglo.servicio.ClasificacionFacadeLocal;
import ec.com.catalogo.modelo.Clasificacion;
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
@Named("ClasificacionControlador")
@ViewScoped
public class ClasificacionControlador implements Serializable{
  @EJB
  private ClasificacionFacadeLocal clasificacionEJB;
  private Clasificacion clasificacion;
  List<Clasificacion> clasificaciones;

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public List<Clasificacion> getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(List<Clasificacion> clasificaciones) {
        this.clasificaciones = clasificaciones;
    }
@PostConstruct
    private void init(){
        clasificacion= new Clasificacion();
        clasificaciones=clasificacionEJB.findAll();
    }
    private void crear(){
        clasificacionEJB.create(clasificacion);
        init();
    }
    private void eliminar(){
        clasificacionEJB.remove(clasificacion);
    }
    private void editar(){
        clasificacionEJB.edit(clasificacion);
    }
    
}
