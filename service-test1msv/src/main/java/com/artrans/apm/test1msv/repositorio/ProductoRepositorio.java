package com.artrans.apm.test1msv.repositorio;

import com.artrans.apm.test1msv.entidad.Category;
import com.artrans.apm.test1msv.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto,String> {

    public List<Producto> findByCategory(Category category);

}
