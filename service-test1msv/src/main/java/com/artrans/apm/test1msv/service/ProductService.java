package com.artrans.apm.test1msv.service;

import com.artrans.apm.test1msv.entidad.Category;
import com.artrans.apm.test1msv.entidad.Producto;

import java.util.List;

public interface ProductService {

    public List<Producto> ListAllProductos();
    public Producto getProducto(String id);
    public Producto createProducto(Producto producto);
    public Producto updateProducto(Producto producto);
    public Producto deleteProducto(String id);
    public List<Producto> findByCategory(Category category);

}
