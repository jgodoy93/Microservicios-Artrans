package com.artrans.apm.test1msv.controller;

import com.artrans.apm.test1msv.entidad.Producto;
import com.artrans.apm.test1msv.model.Empleado;
import com.artrans.apm.test1msv.repositorio.ProductoRepositorio;
import com.artrans.apm.test1msv.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@RequestMapping("/test1")
public class portalController {

    @Autowired
    private ProductServiceImpl productService;
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping("/todos")
    public ResponseEntity<List<Producto>> todos(){
        List<Producto> productos = productoRepositorio.findAll();
        if (productos.isEmpty()) {
            System.out.println("Productos Vacios");
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/productoyEmpleado/{id}/{idEmpleado}")
    public ResponseEntity<Producto> getProductoyEmpleado(@PathVariable("id") String id, @PathVariable("idEmpleado") String idEmleado){
        Producto producto = productService.getProductoyEmpleado(id,idEmleado);
        if (null == producto) {
            System.out.println("Productos Vacios");
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(producto);

    }

    @GetMapping("/Empleados/{id}")
    public ResponseEntity<Empleado> getEmpleado(@PathVariable("id") String id){
        Empleado empleado = productService.getEmpleado(id);
        if (null == empleado) {
            System.out.println("Da Null");
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(empleado);
    }


    @GetMapping("/respuestaServidorTest1")
    public String respuesta(){
        return "Servidor Test1 conectado Correctamente.";
    }



}
