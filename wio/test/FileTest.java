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
            System.out.println("path "+file.getAbsolutePath());
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