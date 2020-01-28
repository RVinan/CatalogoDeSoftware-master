package ec.com.catalogo.modelo;

import ec.com.catalogo.modelo.Equipo;
import ec.com.catalogo.modelo.Fabricante;
import ec.com.catalogo.modelo.Funcionario;
import ec.com.catalogo.modelo.InstanciaBaseDeDatos;
import ec.com.catalogo.modelo.Respaldo;
import ec.com.catalogo.modelo.ServidorDeAplicaciones;
import ec.com.catalogo.modelo.Software;
import ec.com.catalogo.modelo.TipoPlataforma;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-01-28T17:09:21")
@StaticMetamodel(Plataforma.class)
public class Plataforma_ { 

    public static volatile SingularAttribute<Plataforma, Funcionario> idAdmin;
    public static volatile SingularAttribute<Plataforma, Boolean> estado;
    public static volatile SingularAttribute<Plataforma, Equipo> idEquipo;
    public static volatile SingularAttribute<Plataforma, Fabricante> idFabricante;
    public static volatile ListAttribute<Plataforma, ServidorDeAplicaciones> servidorDeAplicacionesList;
    public static volatile SingularAttribute<Plataforma, BigDecimal> usoDisco;
    public static volatile SingularAttribute<Plataforma, Integer> idPlataforma;
    public static volatile SingularAttribute<Plataforma, TipoPlataforma> idTipoPlataforma;
    public static volatile ListAttribute<Plataforma, InstanciaBaseDeDatos> instanciaBaseDeDatosList;
    public static volatile SingularAttribute<Plataforma, String> nombre;
    public static volatile SingularAttribute<Plataforma, Funcionario> idOperador;
    public static volatile SingularAttribute<Plataforma, BigDecimal> tamanio;
    public static volatile ListAttribute<Plataforma, Respaldo> respaldoList;
    public static volatile SingularAttribute<Plataforma, Software> idSoftware;

}