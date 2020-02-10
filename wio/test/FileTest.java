package learningjava.wio.test;

import java.io.File;
import java.sql.Date;

public class FileTest{
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try{
            System.out.println(file.createNewFile());
            boolean exist = file.exists();
            System.out.println("Permissão de leitura: "+file.canRead());
            System.out.println("path "+file.getPath());
            String string_dir = file.getAbsolutePath();
            string_dir = string_dir.substring(0, string_dir.indexOf("."))+"_new.txt";
            System.out.println("path "+string_dir);
            System.out.println("Directory? "+file.isDirectory());
            System.out.println("Hidden? "+file.isHidden());
            System.out.println("LastModified? "+new Date(file.lastModified()));
            if(exist){
                System.out.println("deletado?: "+file.delete());
            }
        }catch(Exception e){
            System.out.println("Erro: "+e);
        }
        
    }
}