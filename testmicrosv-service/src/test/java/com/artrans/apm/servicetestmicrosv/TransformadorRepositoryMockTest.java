package com.artrans.apm.servicetestmicrosv;

import com.artrans.apm.servicetestmicrosv.entity.Categoria;
import com.artrans.apm.servicetestmicrosv.entity.Transformador;
import com.artrans.apm.servicetestmicrosv.repository.TransformadorRepository;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class TransformadorRepositoryMockTest {

    @Autowired
    private TransformadorRepository transformadorRepository;

    public void whenFindById_thenReturnListTransformador(){
        /*
        Transformador transformador1 = Transformador.builder()
                .nombre("Trafo Potencia")
                .categoria(Categoria.builder().id("1").build())
                .potencia("100 KVA")
                .cantidad(Double.parseDouble("10"))
                .createAt(new Date()).build();

        transformadorRepository.save(transformador1);

        List<Transformador> buscar = transformadorRepository.findByCategoria(transformador1.getCategoria());

        //Assertions.assertThat(founds.size().isEqualTo(3));
        */
    }


}
