package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Funcionario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Requerimiento.class)
public class Requerimiento_ { 

    public static volatile SingularAttribute<Requerimiento, String> descripcion;
    public static volatile SingularAttribute<Requerimiento, String> estado;
    public static volatile SingularAttribute<Requerimiento, String> tipo;
    public static volatile SingularAttribute<Requerimiento, Integer> idRequerimiento;
    public static volatile SingularAttribute<Requerimiento, Funcionario> idAprobador;
    public static volatile SingularAttribute<Requerimiento, Funcionario> idSolicitante;
    public static volatile SingularAttribute<Requerimiento, String> prioridad;

}