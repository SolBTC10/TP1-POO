package ar.com.centro8.java.curso.poo_tp1;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString (callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoDolares;

    public CuentaConvertibilidad(int numeroCuenta, ClienteEmpresa clienteAsociado, int descubierto) {
        super(numeroCuenta, clienteAsociado, descubierto);
    }

    public void depositarDolares(double monto) {
        if (monto > 0)
            this.saldoDolares += monto;
        else
            System.out.println("No se puede depositar en negativo.");
    }

    public void extraerDolares(double monto) {
        if (monto > 0 && monto <= saldoDolares)
            this.saldoDolares -= monto;
        else
            System.out.println("El monto es negativo o excede el saldo disponible");
    }

    public void convertirPesosADolares(double monto, int cotizacion) {
        if (monto > 0 && monto <= saldo) {
            extraer(monto);
            saldoDolares += monto / cotizacion;
        } else
            System.out.println("No hay pesos suficientes para la operación solicitada");
    }

    public void convertirDolaresAPesos(double monto, int cotizacion) {
        if (monto > 0 && monto <= saldoDolares) {
            depositar(monto * cotizacion);
            saldoDolares -= monto;
        } else
            System.out.println("No hay dólares suficientes para la operación solicitada");
    }

}
