/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.catalogo.controllador;


import ec.com.cataloglo.servicio.DominioFacadeLocal;
import ec.com.catalogo.modelo.Dominio;
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
@Named("DominioControlador")
@ViewScoped
public class DominioControlador implements Serializable{
    @EJB
    private DominioFacadeLocal dominioEJB;
    private Dominio dominio;
    List<Dominio> dominios;

    public Dominio getDominio() {
        return dominio;
    }

    public void setDominio(Dominio dominio) {
        this.dominio = dominio;
    }

    public List<Dominio> getDominios() {
        return dominios;
    }

    public void setDominios(List<Dominio> dominios) {
        this.dominios = dominios;
    }

    
    @PostConstruct
    public void init(){
        dominio = new Dominio();
        dominios = dominioEJB.findAll();
    }
    
    public void crear(){
        dominioEJB.create(dominio);
        init();
    }
    public void eliminar(){
        dominioEJB.remove(dominio);
        init();
    }
    public void editar(){
        dominioEJB.edit(dominio);
        init();
    }
}
