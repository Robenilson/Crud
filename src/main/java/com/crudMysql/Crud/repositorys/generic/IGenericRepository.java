package com.crudMysql.Crud.repositorys.generic;

import com.crudMysql.Crud.domains.base.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenericRepository<T extends BaseEntity> extends JpaRepository<T, Integer> {

}
