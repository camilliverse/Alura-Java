package br.edu.alura.datahora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcerla = LocalDate.of(2026 , 4 ,22);
        LocalDate segundaParcerla = dataPrimeiraParcerla.plusDays(30);

        //verificação
        if(segundaParcerla.isBefore(LocalDate.now())){
            System.out.println("Anterior dia do vencimento");
        }else {
            System.out.println("Superior ao dia do vencimento");
        }

        System.out.println("Data de compra: " + dataCompra);
        System.out.println("Data de primeira parcerla: " + dataPrimeiraParcerla);
        System.out.println("Data de segunda parcerla: " + segundaParcerla);

        //formatação brasileira (ou qual eu quiser isso é um formatador de data e hora)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data compra formatada: " + dataCompra.format(formatter));

        ZonedDateTime dataComplusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclução compra: " + dataComplusaoCompra);
        ZonedDateTime dataCompraNy = dataComplusaoCompra.withZoneSameInstant(ZoneId.of
                ("America/New_York"));
        System.out.println("Data conclução compra NY: " + dataCompraNy);

        LocalTime inicio = LocalTime.of(10,0);
        LocalTime fim = LocalTime.of(11,0);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duracao.toMinutes() + "horas e " +
                duracao.toMinutesPart() + "minutos.");

        LocalDate dataPagamento = LocalDate.parse("2026-10-30");
        Period periodo = Period.between(dataCompra , dataPagamento);
        System.out.println("Diferença em dias: " + periodo.getDays());

    }
}
