package ar.com.centro8.java.curso.poo_tp1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public abstract class Cuenta {
    private final int numeroCuenta;
    protected double saldo;
    @Setter
    private Cliente clienteAsociado;

    public Cuenta(int numeroCuenta, Cliente clienteAsociado) {
        this.numeroCuenta = numeroCuenta;
        this.clienteAsociado = clienteAsociado;
    }

    public void depositar(double monto) {
        if (monto > 0)
            this.saldo += monto;
        else
            System.out.println("No se puede depositar en negativo.");
    }

    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo)
            this.saldo -= monto;
        else
            System.out.println("El monto es negativo o excede el saldo disponible");
    }

}
