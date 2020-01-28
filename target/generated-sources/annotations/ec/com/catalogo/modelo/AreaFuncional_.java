package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Funcionario;
import ec.com.catalogo.modelo.Software;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(AreaFuncional.class)
public class AreaFuncional_ { 

    public static volatile ListAttribute<AreaFuncional, Funcionario> funcionarioList;
    public static volatile ListAttribute<AreaFuncional, Software> softwareList;
    public static volatile SingularAttribute<AreaFuncional, String> nombre;
    public static volatile SingularAttribute<AreaFuncional, Integer> idAreaFuncional;

}