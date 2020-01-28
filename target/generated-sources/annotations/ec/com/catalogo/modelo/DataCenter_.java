package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Equipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(DataCenter.class)
public class DataCenter_ { 

    public static volatile SingularAttribute<DataCenter, String> area;
    public static volatile SingularAttribute<DataCenter, String> descripcion;
    public static volatile SingularAttribute<DataCenter, String> numero;
    public static volatile SingularAttribute<DataCenter, Integer> idDataCenter;
    public static volatile SingularAttribute<DataCenter, String> callePrincipal;
    public static volatile ListAttribute<DataCenter, Equipo> equipoList;
    public static volatile SingularAttribute<DataCenter, String> sector;
    public static volatile SingularAttribute<DataCenter, String> calleSecundaria;

}