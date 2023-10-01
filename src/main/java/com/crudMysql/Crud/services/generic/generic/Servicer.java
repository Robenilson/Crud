package com.crudMysql.Crud.services.generic.generic;


import com.crudMysql.Crud.domains.entitys.Address;
import com.crudMysql.Crud.repositorys.interfaces.IAddressRepository;
import com.crudMysql.Crud.repositorys.interfaces.ICarRepository;
import com.crudMysql.Crud.repositorys.interfaces.IRentalCompanyRepository;
import com.crudMysql.Crud.repositorys.interfaces.IUserRepository;
import com.crudMysql.Crud.services.interfaces.IServicer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicer implements IServicer {

    private   IAddressRepository iaddressRepository;
    private  ICarRepository carRepository;
    private IUserRepository userRepository;
    private IRentalCompanyRepository rentalCompanyRepository;


    public Servicer(IAddressRepository iaddressRepository, ICarRepository carRepository, IUserRepository userRepository, IRentalCompanyRepository rentalCompanyRepository) {
        this.iaddressRepository = iaddressRepository;
        this.carRepository = carRepository;
        this.userRepository = userRepository;
        this.rentalCompanyRepository = rentalCompanyRepository;
    }



    public List<Address> a(){
        return this.iaddressRepository.findAll();
    }

}