package com.crudMysql.Crud.domains.entitys;


import  com.crudMysql.Crud.domains.base.BaseEntity;
import com.crudMysql.Crud.domains.interfaces.Addressin;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Address  extends BaseEntity  implements Addressin {


     public  String rua;
     public  int número;
     public  int cep;
     public  String bairro;
     public String cidade;
     public String estado;

     public Address() {
          super();
     }
}
