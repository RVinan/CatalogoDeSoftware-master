package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Software;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Dominio.class)
public class Dominio_ { 

    public static volatile ListAttribute<Dominio, Software> softwareList;
    public static volatile SingularAttribute<Dominio, Integer> idDominio;
    public static volatile SingularAttribute<Dominio, String> nombre;

}