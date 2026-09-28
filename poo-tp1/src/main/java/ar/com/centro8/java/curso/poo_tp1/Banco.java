package ar.com.centro8.java.curso.poo_tp1;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter 
@ToString 
public class Banco {
    private List<Cuenta> cuentas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
}
