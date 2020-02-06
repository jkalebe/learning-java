package learningjava.wio.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
        // File diretorio = new File("folder");
        // boolean mkdir = diretorio.mkdir();
        // System.out.println("Diretorio criado: "+mkdir);
        // File arquivo = new File(diretorio, "arquivo.txt");
        // boolean newFile = arquivo.createNewFile();
        // System.out.println("Arquivo criado: " + newFile);
        // File arquivoNovoNome = new File(diretorio, "arquivoRenomeado.txt");
        // boolean renamed = arquivo.renameTo(arquivoNovoNome);
        // System.out.println("Renomeado "+renamed);
        // File diretorioRenomeado = new File("folder2");
        // boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
        // System.out.println("Diretorio renomeado: "+diretorioRenamed);
        buscarArquivo();
    }

    public static void buscarArquivo(){
        File file = new File("/home/kalebe/Documents/java/learningjava/collections/test");
        String[] list = file.list();
        for (String string : list) {
            System.out.println(string);
        }
    }
}