/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.catalogo.controllador;

import ec.com.cataloglo.servicio.AmbitoFacadeLocal;
import ec.com.catalogo.modelo.Ambito;
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
@Named("AmbitoControlador")
@ViewScoped
public class AmbitoControlador implements Serializable{
    @EJB
    private AmbitoFacadeLocal ambitoEJB;
    private Ambito ambito;
    List<Ambito> ambitos;

    public Ambito getAmbito() {
        return ambito;
    }

    public void setAmbito(Ambito ambito) {
        this.ambito = ambito;
    }

    public List<Ambito> getAmbitos() {
        return ambitos;
    }

    public void setAmbitos(List<Ambito> ambitos) {
        this.ambitos = ambitos;
    }
    
    @PostConstruct
    public void init(){
        ambito=new Ambito();
        ambitos=ambitoEJB.findAll();
    }
    public void crear(){
        ambitoEJB.create(ambito);
    }
    public void editar() {
        ambitoEJB.edit(ambito);
    }
    public void eliminar() {
        ambitoEJB.remove(ambito);
    }
}
