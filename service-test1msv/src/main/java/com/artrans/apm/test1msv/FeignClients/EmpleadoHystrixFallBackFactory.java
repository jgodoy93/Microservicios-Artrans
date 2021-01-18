package com.artrans.apm.test1msv.FeignClients;

import com.artrans.apm.test1msv.model.Empleado;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class EmpleadoHystrixFallBackFactory implements EmpleadoClient{
    @Override
    public ResponseEntity<Empleado> getEmpleado(String id) {
        Empleado empleado = Empleado.builder()
                .nombre("Pepe")
                .apellido("Honguito")
                .dni("123456")
                .email("pepe@pepe").build();
        return  ResponseEntity.ok(empleado);
    }
}
