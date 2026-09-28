package ar.com.centro8.java.curso.poo_tp1;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString (callSuper = true)
public class ClienteIndividuo extends Cliente {

    private String nombre;
    private String apellido;
    private int dni;

    public ClienteIndividuo(int numeroCliente, String nombre, String apellido, int dni) {
        super(numeroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

}
