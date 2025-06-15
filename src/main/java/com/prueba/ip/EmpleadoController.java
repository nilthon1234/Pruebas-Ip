package com.prueba.ip;

import com.prueba.ip.models.Empleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    private List<Empleado> listaEmpleados = Arrays.asList(
            new Empleado(1, "Juan Perez", "Desarrollador"),
            new Empleado(2, "Maria Lopez", "Analista"),
            new Empleado(3, "Carlos Ruiz", "Gerente")
    );

    @GetMapping
    public List<Empleado> obtenerEmpleados() {
        return listaEmpleados;
    }

    @GetMapping("/{id}")
    public Empleado obtenerEmpleadoPorId(@PathVariable int id) {
        return listaEmpleados.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
