package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.EquipoFisico;
import ec.com.catalogo.modelo.EquipoVirtual;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Cuchilla.class)
public class Cuchilla_ { 

    public static volatile ListAttribute<Cuchilla, EquipoVirtual> equipoVirtualList;
    public static volatile SingularAttribute<Cuchilla, Integer> idCuchilla;
    public static volatile SingularAttribute<Cuchilla, String> ip;
    public static volatile SingularAttribute<Cuchilla, EquipoFisico> idEquipoFisico;

}