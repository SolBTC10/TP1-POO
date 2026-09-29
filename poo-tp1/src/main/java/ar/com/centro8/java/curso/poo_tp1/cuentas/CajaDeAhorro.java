package ar.com.centro8.java.curso.poo_tp1.cuentas;

import ar.com.centro8.java.curso.poo_tp1.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter 
public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(int numeroCuenta, Cliente clienteAsociado, double tasaDeInteres) {
        super(numeroCuenta, clienteAsociado);
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres() {
        depositar(saldo * tasaDeInteres);
    }

}
