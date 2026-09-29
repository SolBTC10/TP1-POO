package ar.com.centro8.java.curso.poo_tp1.cuentas;

import ar.com.centro8.java.curso.poo_tp1.Cheque;
import ar.com.centro8.java.curso.poo_tp1.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString (callSuper = true)
@Setter 
public class CuentaCorriente extends Cuenta {
    private int descubierto;

    public CuentaCorriente(int numeroCuenta, Cliente clienteAsociado, int descubierto) {
        super(numeroCuenta, clienteAsociado);
        this.descubierto = descubierto;
    }

    @Override
    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo + descubierto) {
            saldo -= monto;
        } else {
            System.out.println("El monto es negativo o excede el descubierto disponible");
        }
    }

    public void depositarCheque(Cheque cheque) {
        depositar(cheque.getMonto());

    }
}
