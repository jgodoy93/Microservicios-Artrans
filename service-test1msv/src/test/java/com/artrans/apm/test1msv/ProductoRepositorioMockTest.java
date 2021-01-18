package com.artrans.apm.test1msv;

import com.artrans.apm.test1msv.entidad.Category;
import com.artrans.apm.test1msv.entidad.Producto;
import com.artrans.apm.test1msv.repositorio.ProductoRepositorio;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class ProductoRepositorioMockTest {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Test
    public void cuandoBusquemosPorCategoriaReturnListaProductos(){

        Producto producto1 = Producto.builder()
                .name("Computadora")
                .category(Category.builder().id(1L).build())
                .descripcion("")
                .build();

        productoRepositorio.save(producto1);

        List<Producto> founds = productoRepositorio.findByCategory(producto1.getCategory());

        Assertions.assertThat(founds.size()).isEqualTo(3);

    }


}
