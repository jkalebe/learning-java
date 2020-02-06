package learningjava.wio.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file));){

            bw.write("Escrevendo uma mensagem no arquivo");
            bw.newLine();
            bw.write("Pulando outra linha");
            bw.flush();
            bw.close();

            String s = null;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        // try {
        //     FileWriter fw = new FileWriter(file);
        //     BufferedWriter bw = new BufferedWriter(fw);
        //     bw.write("Escrevendo uma mensagem no arquivo");
        //     bw.newLine();
        //     bw.write("Pulando outra linha");
        //     bw.flush();
        //     bw.close();

        //     FileReader fr = new FileReader(file);
        //     BufferedReader br = new BufferedReader(fr);
        //     String s = null;
        //     while((s = br.readLine()) != null){
        //         System.out.println(s);
        //     }
        //     br.close();

        // } catch (Exception e) {
        //     //TODO: handle exception
        // }
    }
}