package com.crudMysql.Crud.controllers.controller;


import com.crudMysql.Crud.repositorys.interfaces.IAddressRepository;
import com.crudMysql.Crud.repositorys.interfaces.ICarRepository;
import com.crudMysql.Crud.repositorys.interfaces.IRentalCompanyRepository;
import com.crudMysql.Crud.repositorys.interfaces.IUserRepository;
import com.crudMysql.Crud.services.generic.generic.Servicer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rentalCompany")
public class RentalCampanyController  {

    @Autowired
    private IRentalCompanyRepository rentalCompanyRepository;

    @Autowired
    private ICarRepository carRepository;


    @Autowired
    private IUserRepository userRepository;

    @Autowired
    protected IAddressRepository addressRepository;



















}