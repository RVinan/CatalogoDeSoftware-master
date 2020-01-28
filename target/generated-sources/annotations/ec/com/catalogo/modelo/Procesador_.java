package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Equipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Procesador.class)
public class Procesador_ { 

    public static volatile SingularAttribute<Procesador, String> cache;
    public static volatile SingularAttribute<Procesador, Integer> idProcesador;
    public static volatile SingularAttribute<Procesador, String> tipoTecnologia;
    public static volatile SingularAttribute<Procesador, String> memoria;
    public static volatile ListAttribute<Procesador, Equipo> equipoList;
    public static volatile SingularAttribute<Procesador, String> nucleo;
    public static volatile SingularAttribute<Procesador, String> velocidad;

}