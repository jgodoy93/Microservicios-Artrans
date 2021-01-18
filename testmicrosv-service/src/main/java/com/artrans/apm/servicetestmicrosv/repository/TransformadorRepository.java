package com.artrans.apm.servicetestmicrosv.repository;

import com.artrans.apm.servicetestmicrosv.entity.Categoria;
import com.artrans.apm.servicetestmicrosv.entity.Transformador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransformadorRepository extends JpaRepository<Transformador, Long> {

    public List<Transformador> findByCategoria(Categoria categoria);

}
