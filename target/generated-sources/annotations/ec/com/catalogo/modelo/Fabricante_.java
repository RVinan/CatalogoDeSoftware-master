package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.NavegadorWeb;
import ec.com.catalogo.modelo.Plataforma;
import ec.com.catalogo.modelo.SistemaOperativo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Fabricante.class)
public class Fabricante_ { 

    public static volatile SingularAttribute<Fabricante, Integer> idFabricante;
    public static volatile ListAttribute<Fabricante, Plataforma> plataformaList;
    public static volatile ListAttribute<Fabricante, SistemaOperativo> sistemaOperativoList;
    public static volatile ListAttribute<Fabricante, NavegadorWeb> navegadorWebList;
    public static volatile SingularAttribute<Fabricante, String> nombre;

}