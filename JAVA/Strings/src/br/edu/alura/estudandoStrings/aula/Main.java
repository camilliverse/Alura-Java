package br.edu.alura.estudandoStrings.aula;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.Files.find;

public class Main {
    public static void main(String[] args) {
        //validando email (icloud e etc...)
        String texto = "Meu email é camilli.santos2015@gmail.com";
        Pattern padrao = Pattern.compile("\\w+\\w+.\\w+@\\w+.\\w+");
        Matcher aplicandoPadrao = padrao.matcher(texto);

        if (aplicandoPadrao.find()){
            System.out.println(aplicandoPadrao.group());
        }
        System.out.println(formatarTelefone("1983992220"));

    }
    //formatando e validando numeros
    public static String formatarTelefone(String telefone) {
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if (matcher.matches()) {
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return "Número de telefone inválido!";
    }


}
