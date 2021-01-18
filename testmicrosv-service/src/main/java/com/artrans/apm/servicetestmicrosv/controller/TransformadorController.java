package com.artrans.apm.servicetestmicrosv.controller;

import com.artrans.apm.servicetestmicrosv.entity.Transformador;
import com.artrans.apm.servicetestmicrosv.service.TransformadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/transformador")
public class TransformadorController {

    @Autowired
    private TransformadorService transformadorService;

    @GetMapping
    public ResponseEntity<List<Transformador>> listTransformador(){
        List<Transformador> transformadores = transformadorService.listarTodosTrafos();
        if(transformadores.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(transformadores);
    }



}
