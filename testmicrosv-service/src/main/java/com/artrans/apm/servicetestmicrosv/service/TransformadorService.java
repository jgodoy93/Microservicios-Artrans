package com.artrans.apm.servicetestmicrosv.service;

import com.artrans.apm.servicetestmicrosv.entity.Categoria;
import com.artrans.apm.servicetestmicrosv.entity.Transformador;

import java.util.List;

public interface TransformadorService {

    public List<Transformador> listarTodosTrafos();
    public Transformador getTransformador(Long id);
    public Transformador crearTransformador(Transformador transformador);
    public Transformador modificarTransformador(Transformador transformador);
    public Transformador eliminarTranformador(Transformador transformador);
    public List<Transformador> findByCategoria(Categoria categoria);
    public Transformador modificarCantidad(Long id, Double cantidad);



}
