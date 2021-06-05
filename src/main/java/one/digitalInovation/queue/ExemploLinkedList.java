package one.digitalInovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {
        //Fila: Primeiro que entra, primeiro que sai
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println("Fila inicial " + filaBanco);

        String aSerAtendido = filaBanco.poll();
        System.out.println("Próximo cliente a ser atendido: " + aSerAtendido);
        System.out.println("Fila após o primeiro atendimento: " + filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println("Consulta qual o primeiro elemento da Fila: " + primeiroCliente);
        System.out.println("Fila após consulta peek: " + filaBanco);

        String primeiroClienteouErro = filaBanco.element();
        System.out.println("Consulta qual o primeiro elemento da Fila ou Erro: " + primeiroClienteouErro);
        System.out.println("Fila após consulta element: " + filaBanco);

        for (String client : filaBanco){
            System.out.println("-->" + client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("->" + iteratorFilaBanco.next());
        }

        System.out.println("Tamanho da fila: "+ filaBanco.size());
        System.out.println("Fila Está vazia? "+ filaBanco.isEmpty());

        filaBanco.clear();
        System.out.println("Fila Está vazia? "+ filaBanco.isEmpty());

        primeiroCliente = filaBanco.peek();
        System.out.println("Consulta qual o primeiro elemento da Fila: " + primeiroCliente);
        System.out.println("Fila após clear: " + filaBanco);
      //  primeiroClienteouErro = filaBanco.element();
      //  System.out.println("Consulta qual o primeiro elemento da Fila ou Erro: " + primeiroClienteouErro);

    }

}
