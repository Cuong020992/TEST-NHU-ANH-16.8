package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.model.Type;
import com.codegym.service.product.IProductService;
import com.codegym.service.type.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/types")
public class TypeController {
    @Autowired
    private ITypeService typeService;
    @GetMapping("")
    public ResponseEntity<Iterable<Type>> getListType(){
        return new ResponseEntity<>(typeService.findAll(), HttpStatus.OK);
    }
}

