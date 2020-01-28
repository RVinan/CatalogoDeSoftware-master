package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Plataforma;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Respaldo.class)
public class Respaldo_ { 

    public static volatile SingularAttribute<Respaldo, String> tipo;
    public static volatile SingularAttribute<Respaldo, String> periodicidad;
    public static volatile SingularAttribute<Respaldo, Integer> idRespaldo;
    public static volatile SingularAttribute<Respaldo, String> lugar;
    public static volatile SingularAttribute<Respaldo, Plataforma> idPlataforma;
    public static volatile SingularAttribute<Respaldo, String> tiempoHistorico;
    public static volatile SingularAttribute<Respaldo, String> observacion;

}