package com.artrans.apm.test1msv.service;

import com.artrans.apm.test1msv.FeignClients.EmpleadoClient;
import com.artrans.apm.test1msv.entidad.Category;
import com.artrans.apm.test1msv.entidad.Producto;
import com.artrans.apm.test1msv.model.Empleado;
import com.artrans.apm.test1msv.repositorio.ProductoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.spec.ECParameterSpec;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductoRepositorio productoRepositorio;

    private final EmpleadoClient empleadoClient;

    @Override
    public List<Producto> ListAllProductos() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto getProducto(String id) {
        return null;
    }

    public Producto getProductoyEmpleado(String id, String idCliente){
        Producto producto = productoRepositorio.findById(id).orElse(null);
        Empleado empleado = empleadoClient.getEmpleado(idCliente).getBody();
        producto.setEmpleado(empleado);
        productoRepositorio.save(producto);
        return producto;
    }

    public Empleado getEmpleado(String id){
        System.out.println("Id empleado Ingresado"+id);
        Empleado empleado = empleadoClient.getEmpleado(id).getBody();
        System.out.println("Empleado: \n"+ empleado.toString());
        return empleado;
    }



    @Override
    public Producto createProducto(Producto producto) {

        return productoRepositorio.save(producto);
    }

    @Override
    public Producto updateProducto(Producto producto) {

        Producto productoDB = getProducto(producto.getId());
        if (null == productoDB){
            return null;
        }
        productoDB.setName(producto.getName());
        productoDB.setDescripcion(producto.getDescripcion());
        productoDB.setCategory(producto.getCategory());

        return productoRepositorio.save(productoDB);
    }

    @Override
    public Producto deleteProducto(String id) {
        return null;
    }


    @Override
    public List<Producto> findByCategory(Category category) {
        return productoRepositorio.findByCategory(category);
    }
}
