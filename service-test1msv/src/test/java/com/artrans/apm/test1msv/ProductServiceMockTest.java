package com.artrans.apm.test1msv;

import com.artrans.apm.test1msv.entidad.Category;
import com.artrans.apm.test1msv.entidad.Producto;
import com.artrans.apm.test1msv.repositorio.ProductoRepositorio;
import com.artrans.apm.test1msv.service.ProductService;
import com.artrans.apm.test1msv.service.ProductServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class ProductServiceMockTest {

    @Mock
    private ProductoRepositorio productoRepositorio;

    private ProductService productService;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
        productService = new ProductServiceImpl(productoRepositorio);

        Producto computer = Producto.builder()
                .id("1")
                .name("computer")
                .category(Category.builder().id(1L).build())
                .descripcion("")
                .build();

        Mockito.when(productoRepositorio.findById(1L))
                .thenReturn(Optional.of(computer));

    }

    @Test
    public void wherValidGetID_ThenReturnProducto(){

        Producto found = productService.getProducto("1");
        Assertions.assertThat(found.getName()).isEqualTo("computer");

    }


}
