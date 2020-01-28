package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.EquipoFisico;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Almacenamiento.class)
public class Almacenamiento_ { 

    public static volatile SingularAttribute<Almacenamiento, String> licencia;
    public static volatile SingularAttribute<Almacenamiento, Integer> idAlmacenamiento;
    public static volatile SingularAttribute<Almacenamiento, EquipoFisico> idEquipoFisico;

}