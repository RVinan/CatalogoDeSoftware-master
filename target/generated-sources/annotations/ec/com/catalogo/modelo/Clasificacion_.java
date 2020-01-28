package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Software;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Clasificacion.class)
public class Clasificacion_ { 

    public static volatile ListAttribute<Clasificacion, Software> softwareList;
    public static volatile SingularAttribute<Clasificacion, Integer> idClasificacion;
    public static volatile SingularAttribute<Clasificacion, String> nombre;

}