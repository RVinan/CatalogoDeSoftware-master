package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Equipo;
import ec.com.catalogo.modelo.Fabricante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(SistemaOperativo.class)
public class SistemaOperativo_ { 

    public static volatile SingularAttribute<SistemaOperativo, String> tipo;
    public static volatile SingularAttribute<SistemaOperativo, Fabricante> idFabricante;
    public static volatile SingularAttribute<SistemaOperativo, String> licencia;
    public static volatile SingularAttribute<SistemaOperativo, String> arquitectura;
    public static volatile SingularAttribute<SistemaOperativo, String> plataforma;
    public static volatile ListAttribute<SistemaOperativo, Equipo> equipoList;
    public static volatile SingularAttribute<SistemaOperativo, Integer> idSistemaOperativo;
    public static volatile SingularAttribute<SistemaOperativo, String> version;

}