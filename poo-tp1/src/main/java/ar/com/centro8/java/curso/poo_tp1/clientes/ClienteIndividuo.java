package ar.com.centro8.java.curso.poo_tp1.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@ToString (callSuper = true)

public class ClienteIndividuo extends Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteIndividuo(int numeroCliente, String nombre, String apellido, String dni) {
        super(numeroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

}
