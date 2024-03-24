package main.professor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Autenticador {

    public static boolean autenticaID(int id){
        return id > 0;
    }
    public static boolean validaNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            return false;
        }
        return !nome.matches(".*\\d.*");
    }

    public static boolean autenticaDia(String entrada) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
            Date data = sdf.parse(entrada);
            return data != null;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean autenticaHora(String entrada) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            sdf.setLenient(false); // Para garantir uma validação estrita
            Date hora = sdf.parse(entrada);
            return hora != null;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean autenticaPeriodo(String periodo){
        return "integral".equals(periodo) || "noturno".equals(periodo);
    }

    public static boolean autenticaSala(int sala){
        return sala >= 1 && sala <= 30;
    }

    public static boolean autenticaPredio(int numeroPredio, int minimo, int maximo) {
        return numeroPredio >= minimo && numeroPredio <= maximo;
    }

}
