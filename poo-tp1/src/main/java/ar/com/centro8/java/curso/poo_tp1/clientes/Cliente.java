package ar.com.centro8.java.curso.poo_tp1.clientes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor 

public abstract class Cliente {
    private final int numeroCliente;

}
