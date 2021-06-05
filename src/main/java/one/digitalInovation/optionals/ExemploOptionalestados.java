package one.digitalInovation.optionals;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Optional;

public class ExemploOptionalestados {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("<Valor presente> ");
        System.out.println("1 - Valor opcional que está presente: ");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("2 - Valor opcional que não está presente: ");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("3 - Valor opcional que não está presente:");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));
        /*
        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("4 - Valor opcional que lança erro NullPointException:");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
         */
    }

}
