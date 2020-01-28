package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Almacenamiento;
import ec.com.catalogo.modelo.Cuchilla;
import ec.com.catalogo.modelo.Equipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(EquipoFisico.class)
public class EquipoFisico_ { 

    public static volatile ListAttribute<EquipoFisico, Cuchilla> cuchillaList;
    public static volatile SingularAttribute<EquipoFisico, Equipo> idEquipo;
    public static volatile SingularAttribute<EquipoFisico, String> energia;
    public static volatile SingularAttribute<EquipoFisico, String> disco;
    public static volatile SingularAttribute<EquipoFisico, Integer> idEquipoFisico;
    public static volatile SingularAttribute<EquipoFisico, String> modelo;
    public static volatile ListAttribute<EquipoFisico, Almacenamiento> almacenamientoList;

}