package com.intranet.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Format {
    public static LocalDate stringToLocalDate(String fechaStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fecha = LocalDate.parse(fechaStr, formatter);
            return fecha;
        } catch (Exception e) {
            AlertUtils.showWarning("Hubo un error al parsear la fecha");
            return null;
        }
    }
    
    public static String numGradoToStrGrado(int num_grado){
        switch(num_grado){
            case 1: return "1er Grado";
            case 2: return "2do Grado";
            case 3: return "3er Grado";
            case 4: return "4to Grado";
            case 5: return "5to Grado";
            case 6: return "6to Grado";
            default: return num_grado+"° Grado";
        }
    }
}
