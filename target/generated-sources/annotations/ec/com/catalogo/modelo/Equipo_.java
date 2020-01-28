package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.DataCenter;
import ec.com.catalogo.modelo.EquipoFisico;
import ec.com.catalogo.modelo.EquipoVirtual;
import ec.com.catalogo.modelo.MotorBaseDeDatos;
import ec.com.catalogo.modelo.Plataforma;
import ec.com.catalogo.modelo.Procesador;
import ec.com.catalogo.modelo.SistemaOperativo;
import ec.com.catalogo.modelo.SoftwareXEquipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile SingularAttribute<Equipo, String> direccionMAC;
    public static volatile SingularAttribute<Equipo, String> descripcion;
    public static volatile ListAttribute<Equipo, EquipoVirtual> equipoVirtualList;
    public static volatile SingularAttribute<Equipo, Integer> idEquipo;
    public static volatile SingularAttribute<Equipo, Procesador> idProcesador;
    public static volatile SingularAttribute<Equipo, String> memoria;
    public static volatile SingularAttribute<Equipo, DataCenter> idDataCenter;
    public static volatile SingularAttribute<Equipo, String> ip;
    public static volatile ListAttribute<Equipo, MotorBaseDeDatos> motorBaseDeDatosList;
    public static volatile SingularAttribute<Equipo, SistemaOperativo> idSistemaOperativo;
    public static volatile SingularAttribute<Equipo, String> nombre;
    public static volatile ListAttribute<Equipo, EquipoFisico> equipoFisicoList;
    public static volatile SingularAttribute<Equipo, String> tipoEquipo;
    public static volatile ListAttribute<Equipo, Plataforma> plataformaList;
    public static volatile ListAttribute<Equipo, SoftwareXEquipo> softwareXEquipoList;
    public static volatile SingularAttribute<Equipo, String> host;
    public static volatile SingularAttribute<Equipo, String> capacidad;

}