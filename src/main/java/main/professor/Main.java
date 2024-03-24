package main.professor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Autenticador();

        String jsonFile = null;
        int id;
        String nome;
        String dia;
        String horario;
        String atendimento = null;
        String periodo;
        int sala;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Id do professor: ");
        id = scanner.nextInt();
        scanner.nextLine();
        if(!Autenticador.autenticaID(id)){
            System.out.println("Nome invalido");
            return;
        }

        System.out.print("Nome do Professor: ");
        nome = scanner.nextLine();
        if(!Autenticador.validaNome(nome)){
            System.out.println("Nome invalido");
            return;
        }

        System.out.println("Dia da semana (ex: segunda-feira):");
        dia = scanner.nextLine();
        if(!Autenticador.autenticaDia(dia)){
            System.out.println("Data Invalida");
            return;
        }

        System.out.print("Horário de Atendimento: ");
        horario = scanner.nextLine();
        if(!Autenticador.autenticaHora(horario)){
            System.out.println("Horario Invalido");
            return;
        }

        atendimento = dia +" "+ horario;

        System.out.print("Período (integral/noturno): ");
        periodo = scanner.nextLine();
        if(!Autenticador.autenticaPeriodo(periodo)){
            System.out.println("Periodo invalido");
            return;
        }


        System.out.print("Sala 1-30: ");
        sala = scanner.nextInt();
        scanner.nextLine();
        if(!Autenticador.autenticaSala(sala)){
            System.out.println("Sala invalida");
            return;
        }

        jsonFile = Json.createJson(id,nome, atendimento, periodo, sala);
        System.out.println(jsonFile);

        Json.save(jsonFile);
        scanner.close();
    }
}