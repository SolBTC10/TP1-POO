package ar.com.centro8.java.curso.poo_tp1;

import java.time.LocalDate;

public class TestBanco {
    public static void main(String[] args) {

        Banco banco1 = new Banco();

        ClienteIndividuo clienteIndividuo1 = new ClienteIndividuo(1, "Sol", "Garcia", 36000000);
        ClienteEmpresa clienteEmpresa1 = new ClienteEmpresa(2, "SolRadiante10", "27-36000000-1");
        ClienteIndividuo clienteIndividuo2 = new ClienteIndividuo(3, "Leonel", "Messi", 20000000);

        banco1.registrarCliente(clienteIndividuo1);
        banco1.registrarCliente(clienteEmpresa1);
        banco1.registrarCliente(clienteIndividuo2);

        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(123, clienteIndividuo1, 0.10);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(655, clienteIndividuo2, 2000);
        CuentaConvertibilidad cuentaConvertibilidad1 = new CuentaConvertibilidad(845, clienteEmpresa1, 50000);

        banco1.registrarCuenta(cajaDeAhorro1);
        banco1.registrarCuenta(cuentaCorriente1);
        banco1.registrarCuenta(cuentaConvertibilidad1);

        cajaDeAhorro1.depositar(150000);
        cajaDeAhorro1.cobrarInteres();
        cajaDeAhorro1.extraer(250000);
        System.out.println(cajaDeAhorro1.getSaldo());

        Cheque cheque1 = new Cheque(50000, "Banco Galicia", LocalDate.now());

        cuentaCorriente1.depositar(20000);
        cuentaCorriente1.extraer(21000);
        cuentaCorriente1.extraer(5000);
        cuentaCorriente1.depositarCheque(cheque1);
        System.out.println(cuentaCorriente1.getSaldo());

        cuentaConvertibilidad1.depositar(300000);
        cuentaConvertibilidad1.depositarDolares(500);
        cuentaConvertibilidad1.convertirPesosADolares(200000, 1550);
        cuentaConvertibilidad1.extraer(250000);
        cuentaConvertibilidad1.extraer(20000);
        cuentaConvertibilidad1.extraerDolares(150);
        cuentaConvertibilidad1.convertirDolaresAPesos(100, 1500);
        System.out.println(cuentaConvertibilidad1.getSaldo());
        System.out.println(cuentaConvertibilidad1.getSaldoDolares());

        System.out.println(banco1.getClientes());
        System.out.println(banco1.getCuentas());

    }

}
