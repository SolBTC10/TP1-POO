package ar.com.centro8.java.curso.poo_tp1;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString (callSuper = true)

public class ClienteEmpresa extends Cliente {

    private String nombreFantasia;
    private String cuit;

    public ClienteEmpresa(int numeroCliente, String nombreFantasia, String cuit) {
        super(numeroCliente);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }

}
