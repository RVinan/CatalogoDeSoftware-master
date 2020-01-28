package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Ambito;
import ec.com.catalogo.modelo.AreaFuncional;
import ec.com.catalogo.modelo.Clasificacion;
import ec.com.catalogo.modelo.Dominio;
import ec.com.catalogo.modelo.Lenguaje;
import ec.com.catalogo.modelo.Plataforma;
import ec.com.catalogo.modelo.SoftwareXEquipo;
import ec.com.catalogo.modelo.SoftwareXNavegadorWeb;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Software.class)
public class Software_ { 

    public static volatile SingularAttribute<Software, String> descripcion;
    public static volatile ListAttribute<Software, SoftwareXNavegadorWeb> softwareXNavegadorWebList;
    public static volatile SingularAttribute<Software, Clasificacion> idClasificacion;
    public static volatile SingularAttribute<Software, Ambito> idAmbito;
    public static volatile SingularAttribute<Software, String> nombre;
    public static volatile SingularAttribute<Software, String> version;
    public static volatile SingularAttribute<Software, AreaFuncional> idAreaFuncional;
    public static volatile SingularAttribute<Software, String> path;
    public static volatile ListAttribute<Software, Plataforma> plataformaList;
    public static volatile ListAttribute<Software, SoftwareXEquipo> softwareXEquipoList;
    public static volatile SingularAttribute<Software, Lenguaje> idLenguaje;
    public static volatile SingularAttribute<Software, Boolean> web;
    public static volatile SingularAttribute<Software, Dominio> idDominio;
    public static volatile SingularAttribute<Software, Integer> idSoftware;
    public static volatile SingularAttribute<Software, Integer> numUsers;

}