package com.crudMysql.Crud.controllers.controller;


import com.crudMysql.Crud.domains.entitys.Address;
import com.crudMysql.Crud.services.generic.generic.Servicer;
import com.crudMysql.Crud.services.interfaces.IServicer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController    {




    @Autowired
    private IServicer servicer;






    @GetMapping
    public  List<Address> a(){
        return servicer.a();
    }






















}
