package one.digitalInovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");


        System.out.println(nomes);
        nomes.set(2,"Larissa");
        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);
        nomes.set(2,"Wesley");
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Wesley");
        System.out.println(nomes);

        String nome1 = nomes.get(1);
        System.out.println(nome1);

        int posicao = nomes.indexOf("Carlos");
        System.out.println("Index do elemento Carlos na lista: " + posicao);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println("Tem Anderson? " + temAnderson);

        boolean temfernando = nomes.contains("Fernando");
        System.out.println("Tem Fernando? " + temfernando);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println("Lista está vazia? " + listaEstaVazia);

        for (String nomeDoItem :nomes){
            System.out.println("-->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("->" + iterator.next());
        }

        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println("Lista está vazia? " + listaEstaVazia);


    }
}
