package ar.com.centro8.java.curso.poo_tp1;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString (callSuper = true)
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
