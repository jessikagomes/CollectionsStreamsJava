package one.digitalInovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        estudantes.add("PedWro");
        estudantes.add("ThaWyse");
        estudantes.add("MarWcelo");
        estudantes.add("CarWla");
        estudantes.add("JulWiana");
        estudantes.add("ThiWago");
        estudantes.add("RafWael");

        System.out.println("Contagem: "+ estudantes.stream().count());
        System.out.println("Maior nº de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Menor nº de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
        System.out.printf("Com a letrar R n  nome: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

    }
}
