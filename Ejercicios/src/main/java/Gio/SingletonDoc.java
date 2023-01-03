package Gio;

import java.io.*;
import java.util.Scanner;

public class SingletonDoc {
    private static SingletonDoc docSingleton;

    private final File docShared = new File("docShare.txt");

    private SingletonDoc(){}

    public static SingletonDoc getInstance() {
        if (docSingleton == null) {
            docSingleton = new SingletonDoc();
        }else {
            System.out.println("Ya hay un archivo compartido, puedes escribir en este mismo");
        }
        return docSingleton;
    }


    public void writeDoc(String contenido){
        try {
            FileOutputStream doc = new FileOutputStream(docShared,true);
            contenido += "\n";
            doc.write(contenido.getBytes());
            doc.close();
        }catch (IOException e) {
            System.out.println("No se pude leer el archivo" + e.getMessage());
        }
    }

    public void printDoc(){
        try {
            Scanner sc = new Scanner(new FileInputStream(this.docShared));
            // Leemos y imprimimos el contenido del fichero
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            // Cerramos el Scanner
            sc.close();
        }catch (FileNotFoundException e) {
            System.out.println("No se pude leer el archivo" + e.getMessage());
        }
    }

    public void deleteDocShare(){
        try{
            boolean estatus = docShared.delete();

            if (!estatus) {
                System.out.println("Error no se ha podido eliminar el  archivo");
            }else{
                System.out.println("Se ha eliminado el archivo exitosamente");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
