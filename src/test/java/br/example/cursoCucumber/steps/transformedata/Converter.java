package br.example.cursoCucumber.steps.transformedata;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

import io.cucumber.java.ParameterType;

public class Converter {

    @ParameterType(".*")
    public LocalDate data(String data) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {

            return dateFormat.parse(data).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (ParseException e) {
            throw new RuntimeException();
        }
    }

}
