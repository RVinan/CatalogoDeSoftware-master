package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.MotorBaseDeDatos;
import ec.com.catalogo.modelo.Plataforma;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(InstanciaBaseDeDatos.class)
public class InstanciaBaseDeDatos_ { 

    public static volatile SingularAttribute<InstanciaBaseDeDatos, MotorBaseDeDatos> idMotorBaseDeDatos;
    public static volatile SingularAttribute<InstanciaBaseDeDatos, Plataforma> idPlataforma;
    public static volatile SingularAttribute<InstanciaBaseDeDatos, Integer> idInstanciaBaseDeDatos;
    public static volatile SingularAttribute<InstanciaBaseDeDatos, String> nombre;

}