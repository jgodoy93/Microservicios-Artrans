package com.artrans.apm.test1msv.FeignClients;


import com.artrans.apm.test1msv.model.Empleado;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "margarita-service", fallback = EmpleadoHystrixFallBackFactory.class)
public interface EmpleadoClient {

    //Hay que agregar esas dos decoraciones para que balance la carga del micro sv y no corte la transaccion


    @Bean
    @LoadBalanced
    @GetMapping("/Empleados/{id}")
    public ResponseEntity<Empleado> getEmpleado(@PathVariable("id") String id);

}
