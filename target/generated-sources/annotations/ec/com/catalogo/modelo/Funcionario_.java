package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.AreaFuncional;
import ec.com.catalogo.modelo.Persona;
import ec.com.catalogo.modelo.Plataforma;
import ec.com.catalogo.modelo.Requerimiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, String> password;
    public static volatile SingularAttribute<Funcionario, String> tipo;
    public static volatile ListAttribute<Funcionario, Plataforma> plataformaList;
    public static volatile ListAttribute<Funcionario, Requerimiento> requerimientoList;
    public static volatile ListAttribute<Funcionario, Plataforma> plataformaList1;
    public static volatile ListAttribute<Funcionario, Requerimiento> requerimientoList1;
    public static volatile SingularAttribute<Funcionario, String> nombreUsuario;
    public static volatile SingularAttribute<Funcionario, Integer> idFuncionario;
    public static volatile SingularAttribute<Funcionario, Persona> idPersona;
    public static volatile SingularAttribute<Funcionario, AreaFuncional> idAreaFuncional;

}