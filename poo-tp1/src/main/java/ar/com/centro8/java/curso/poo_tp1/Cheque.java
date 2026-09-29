package ar.com.centro8.java.curso.poo_tp1;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor 
public class Cheque {
    private double monto;
    private final String bancoEmisor;
    private LocalDate fecha;
    

}
