package abc.wio.test;

import java.io.Console;

public class ConsoleTest{
    public static void main(String[] args) {
        Console c =  System.console();
        char [] pw = c.readPassword("%s", "pw: ");
        for (char d : pw) {
            c.format("%c", d);
        }
        c.format("\n");
        String texto;
        while(true){
            texto = c.readLine("%s", "Digite: ");
            c.format("esse texto %s foi digitado\n", retorno(texto));
        }
    }

    public static String retorno(String arg1){
        return "entada de dados"+arg1;
    }
}