package ar.com.centro8.java.curso.poo_tp1;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Cliente {
    private final int numeroCliente;

    public Cliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

}
