package ar.com.centro8.java.curso.poo_tp1;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cheque {
    private double monto;
    private String bancoEmisor;
    private LocalDate fecha;
    
    public Cheque(double monto, String bancoEmisor, LocalDate fecha) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fecha = fecha;
    }

}
