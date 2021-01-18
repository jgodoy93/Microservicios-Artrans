package com.artrans.apm.test1msv.entidad;

import com.artrans.apm.test1msv.model.Empleado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_productos")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @Transient
    private Empleado empleado;

}
