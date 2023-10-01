package com.crudMysql.Crud.domains.entitys;

import  com.crudMysql.Crud.domains.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class RentalCompany  extends BaseEntity  {

    public  String nomeUnidade;
    @ManyToOne
    @JoinColumn(nullable = false,name = "address_id")
    public  Address address;
    public Date  dataLocacao;
    @ManyToOne
    @JoinColumn(nullable = false,name = "use_id")
    public User user;


    public RentalCompany() {
        super();
    }




}
