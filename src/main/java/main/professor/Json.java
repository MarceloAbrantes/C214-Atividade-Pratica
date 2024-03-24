package main.professor;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class Json {
    public static String createJson(int id, String nome, String atendimento, String periodo, int sala) {

        Professor prof = new Professor(0,null,null,null,null,null);
        prof.setNome(nome);
        prof.setHorario(atendimento);
        prof.setPeriodo(periodo);
        prof.setSala(String.valueOf(sala));

        int numeroPredio = ((sala - 1) / 5) + 1;
        prof.setPredio( Integer.toString(numeroPredio));

        Gson gson = new Gson();
        String json = gson.toJson(prof);
        return json;
    }

    public static void save(String prof){
        Gson gson = new Gson();

        // Converter o objeto JSON em uma string JSON
        String json = gson.toJson(prof);

        // Especificar o caminho do arquivo onde você deseja salvar o JSON
        String caminhoArquivo = "jsons";

        try {
            // Criar um FileWriter para escrever o JSON no arquivo
            FileWriter writer = new FileWriter(caminhoArquivo);

            // Escrever a string JSON no arquivo
            writer.write(json);

            // Fechar o FileWriter
            writer.close();

            System.out.println("JSON salvo com sucesso em " + caminhoArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
