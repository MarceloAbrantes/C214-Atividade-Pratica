package main.professor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ProfessorBusca {
    Service service;

    public ProfessorBusca(Service service){
        this.service = service;
    }

    public Professor professorBusca(int id){
        String jsonProf = service.buscaProf(id);

        //jsonObject é um objeto JSON feito a partir da string de retonro
        JsonObject jsonObject = JsonParser.parseString(jsonProf).getAsJsonObject();

        return new Professor(
                jsonObject.get("Id").getAsInt(),
                jsonObject.get("Nome").getAsString(),
                jsonObject.get("Horario").getAsString(),
                jsonObject.get("Periodo").getAsString(),
                jsonObject.get("Sala").getAsString(),
                jsonObject.get("Predio").getAsString()
        );

    }

    public boolean professorExiste(int id){
        boolean professorExiste = service.profExiste(id);

        return professorExiste;
    }
}
