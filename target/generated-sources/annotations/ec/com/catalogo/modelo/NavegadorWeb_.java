package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Fabricante;
import ec.com.catalogo.modelo.SoftwareXNavegadorWeb;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(NavegadorWeb.class)
public class NavegadorWeb_ { 

    public static volatile SingularAttribute<NavegadorWeb, Fabricante> idFabricante;
    public static volatile SingularAttribute<NavegadorWeb, Integer> idNavegadorWeb;
    public static volatile ListAttribute<NavegadorWeb, SoftwareXNavegadorWeb> softwareXNavegadorWebList;
    public static volatile SingularAttribute<NavegadorWeb, String> nombre;
    public static volatile SingularAttribute<NavegadorWeb, String> version;

}