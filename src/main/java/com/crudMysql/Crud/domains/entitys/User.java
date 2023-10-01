package com.crudMysql.Crud.domains.entitys;

import com.crudMysql.Crud.domains.Tipos.TipoCliente;
import com.crudMysql.Crud.domains.Tipos.TipoUsuario;
import  com.crudMysql.Crud.domains.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "users")
public class User  extends BaseEntity  {


    private String nome;
    @ManyToOne
    @JoinColumn(nullable = false,name = "addess_id")
    private  Address address;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    private Date dataCadastro;
    private TipoUsuario tipoUsuario;
    private TipoCliente tipoCliente;



    public User() {
        super();
    }

}
