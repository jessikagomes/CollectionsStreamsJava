package one.digitalInovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        campeoesMundialFifa.put("Brasil",6);
        System.out.println(campeoesMundialFifa);

        System.out.println("Busca por valor da Argentina:"+campeoesMundialFifa.get("Argentina"));
        System.out.println("Busca se contem França: " + campeoesMundialFifa.containsKey("França"));
        System.out.println("Removendo França : "+campeoesMundialFifa.remove("França"));
        System.out.println("Após remover França: "+campeoesMundialFifa);
        System.out.println("Contem o Valor 6? "+ campeoesMundialFifa.containsValue(6));
        System.out.println("Retorna o tamanho do Mapa: "+campeoesMundialFifa.size());

        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("-------");
        for (String key : campeoesMundialFifa.keySet()){
            System.out.println(key + campeoesMundialFifa.get(key));
        }

        campeoesMundialFifa.clear();
        System.out.println(campeoesMundialFifa);
    }



}
