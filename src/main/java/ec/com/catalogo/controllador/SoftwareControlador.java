/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.catalogo.controllador;

import ec.com.cataloglo.servicio.SoftwareFacadeLocal;
import ec.com.catalogo.modelo.Software;
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
@Named("SoftwareControlador")
@ViewScoped
public class SoftwareControlador implements Serializable{
    @EJB
    private SoftwareFacadeLocal softwareEJB;
    private Software software;
    List<Software> softwares;

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(List<Software> softwares) {
        this.softwares = softwares;
    }
    
    @PostConstruct
public void init(){
    software= new Software();
    softwares=softwareEJB.findAll();
}
public void crear(){
    softwareEJB.create(software);
    init();
}
public void editar(){
    softwareEJB.edit(software);
    init();
}
public void eliminar(){
    softwareEJB.remove(software);
    init();
}
}
