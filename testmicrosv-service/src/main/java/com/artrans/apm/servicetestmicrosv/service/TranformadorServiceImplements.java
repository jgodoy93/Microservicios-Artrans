package com.artrans.apm.servicetestmicrosv.service;

import com.artrans.apm.servicetestmicrosv.entity.Categoria;
import com.artrans.apm.servicetestmicrosv.entity.Transformador;
import com.artrans.apm.servicetestmicrosv.repository.TransformadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TranformadorServiceImplements implements TransformadorService {

    @Autowired
    private TransformadorRepository transformadorRepository;

    @Override
    public List<Transformador> listarTodosTrafos() {
        return transformadorRepository.findAll();
    }

    @Override
    public Transformador getTransformador(Long id) {
        return transformadorRepository.findById(id).orElse(null);
    }

    @Override
    public Transformador crearTransformador(Transformador transformador) {
        transformador.setEstado("CREADO");
        transformador.setCreateAt(new Date());

        return transformadorRepository.save(transformador);
    }

    @Override
    public Transformador modificarTransformador(Transformador transformador) {
        return null;
    }

    @Override
    public Transformador eliminarTranformador(Transformador transformador) {
        return null;
    }

    @Override
    public List<Transformador> findByCategoria(Categoria categoria) {
        return null;
    }

    @Override
    public Transformador modificarCantidad(Long id, Double cantidad) {
        return null;
    }
}
