package one.digitalInovation.set;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Sao paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);
        System.out.println("Primeiro Elemento no topo: " + treeCapitais.first());
        System.out.println("Último Elemento no topo: " + treeCapitais.last());
        System.out.println("Elemento abaixo do que estou parametrizando: " + treeCapitais.lower("Florianopolis"));
        System.out.println("Elemento acima do que estou parametrizando: " + treeCapitais.higher("Florianopolis"));
        System.out.println("Remove o primeiro Elemento no topo: " + treeCapitais.pollFirst());
        System.out.println(treeCapitais);


    }
}
