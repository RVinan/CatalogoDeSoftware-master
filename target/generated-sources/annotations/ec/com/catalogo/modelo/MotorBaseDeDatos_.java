package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Equipo;
import ec.com.catalogo.modelo.InstanciaBaseDeDatos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(MotorBaseDeDatos.class)
public class MotorBaseDeDatos_ { 

    public static volatile SingularAttribute<MotorBaseDeDatos, Equipo> idEquipo;
    public static volatile SingularAttribute<MotorBaseDeDatos, Integer> idMotorBaseDeDatos;
    public static volatile ListAttribute<MotorBaseDeDatos, InstanciaBaseDeDatos> instanciaBaseDeDatosList;
    public static volatile SingularAttribute<MotorBaseDeDatos, String> nombre;
    public static volatile SingularAttribute<MotorBaseDeDatos, String> version;

}