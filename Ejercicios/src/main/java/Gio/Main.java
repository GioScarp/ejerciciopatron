package Gio;


public class Main {
    public static void main(String[] args) {
        SingletonDoc docShare = SingletonDoc.getInstance();
        String contenido = "Mi primera información colocada en este archivo";
        docShare.writeDoc(contenido);
        docShare.printDoc();

        System.out.println("----------------");

        SingletonDoc docShare2 = SingletonDoc.getInstance();
        docShare2.writeDoc("Estoy agregando mas contenido al archivo compartido");
        docShare2.printDoc();

        docShare2.deleteDocShare();
    }
}