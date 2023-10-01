package com.crudMysql.Crud.domains.entitys;


import  com.crudMysql.Crud.domains.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
public class Car  extends BaseEntity  {


   private String modelo;
   private String marca;
   private int Ano;
   private String Cor;
   private  int quantidadeCarros;
   private int preco;
   private String  status;


   public Car() {
      super();
   }
}
