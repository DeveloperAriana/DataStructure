import LinkedList.DobleLinkedList;
import LinkedList.DoubleLinkedCircularList;
import LinkedList.SimpleLinkedCircularList;
import LinkedList.SimpleLinkedList;

class Main{
    public static void main(String[] args) {
        SimpleLinkedList newList = new SimpleLinkedList();
        DobleLinkedList newDobleList = new DobleLinkedList();
        SimpleLinkedCircularList newCircularList = new SimpleLinkedCircularList();
        DoubleLinkedCircularList newCircularDoubleList = new DoubleLinkedCircularList();

        //Lista simplemente enlazadas
        System.out.println("------------------------------------------------------------");
        System.out.println("|                    Simplemente Enlazada                  |");
        System.out.println("------------------------------------------------------------");
        System.out.println(":----:Insercion en lista vacia:----:");
        newList.insertInLinkedVoid();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al inicio de lista:----:");
        newList.insertPrepend();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al final de lista:----:");
        newList.insertAppend();
        System.out.println(":----:Fin:----:");
        System.out.println(":--------------: CORRESPONDENCIA ENTRE NODOS LUEGO DE INSERCIONES:-------------:");
        System.out.println();
        newList.getValue();
        System.out.println();
        System.out.println(":---------------------------------: Fin :--------------------------------------:");
        System.out.println(":----: Primer elemento eliminado:----:");
        newList.deletePrepend();
        System.out.println(":----:Fin:----:");
        System.out.println(":----: Ultimo elemento eliminado:----:");
        newList.deleteAppend();
        System.out.println(":----:Fin:----:");
        System.out.println(":------------: CORRESPONDENCIA ENTRE NODOS LUEGO DE ELIMINACIONES :------------:");
        newList.getValue();
        System.out.println(":---------------------------------: Fin :--------------------------------------:");

        //Lista doblemente enlazada
        System.out.println("------------------------------------------------------------");
        System.out.println("|                    Doblemente Enlazada                   |");
        System.out.println("------------------------------------------------------------");
        System.out.println(":----:Insercion en lista vacia:----:");
        newDobleList.insertInVoidList();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al inicio de lista:----:");
        newDobleList.insertPrepend();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al inicio de lista:----:");
        newDobleList.insertPrepend();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al inicio de lista:----:");
        newDobleList.insertPrepend();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al final de lista:----:");
        newDobleList.insertAppend();
        System.out.println(":----:Fin:----:");
        System.out.println();
        System.out.println(":--------------: CORRESPONDENCIA ENTRE NODOS LUEGO DE INSERCIONES:-------------:");
        System.out.println();
        newDobleList.getValues();
        System.out.println();
        System.out.println(":---------------------------------: Fin :--------------------------------------:");
        System.out.println(":----: Primer elemento eliminado:----:");
        newDobleList.deletePrepend();
        System.out.println(":----:Fin:----:");
        System.out.println(":----: Ultimo elemento eliminado:----:");
        newDobleList.deleteAppend();
        System.out.println(":----:Fin:----:");
        System.out.println(":------------: CORRESPONDENCIA ENTRE NODOS LUEGO DE ELIMINACIONES :------------:");
        System.out.println();
        newDobleList.getValues();
        System.out.println();
        System.out.println(":---------------------------------: Fin :--------------------------------------:");

        //Lista circular simplemente enlazada
        System.out.println("------------------------------------------------------------");
        System.out.println("|                 Circular Simplemente Enlazada            |");
        System.out.println("------------------------------------------------------------");
        System.out.println(":----:Insercion en lista vacia:----:");
        newCircularList.insertInVoidList();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al final de lista:----:");
        newCircularList.insertAppend();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al inicio de lista:----:");
        newCircularList.insertPrepend();
        System.out.println(":----:Fin:----:");
        System.out.println();
        System.out.println(":--------------: CORRESPONDENCIA ENTRE NODOS LUEGO DE INSERCIONES:-------------:");
        System.out.println();
        newCircularList.getValues();
        System.out.println();
        System.out.println(":---------------------------------: Fin :--------------------------------------:");
        System.out.println();
        System.out.println(":----: Primer elemento eliminado:----:");
        newCircularList.deletePrepend();
        System.out.println(":----:Fin:----:");
        System.out.println(":----: Ultimo elemento eliminado:----:");
        newCircularList.deleteAppend();
        System.out.println(":----:Fin:----:");
        System.out.println();
        System.out.println(":------------: CORRESPONDENCIA ENTRE NODOS LUEGO DE ELIMINACIONES :------------:");
        System.out.println();
        newCircularList.getValues();
        System.out.println();
        System.out.println(":---------------------------------: Fin :--------------------------------------:");
        System.out.println();
        //Lista circular doblemente enlazada
        System.out.println("------------------------------------------------------------");
        System.out.println("|                Circular Doblemente Enlazada              |");
        System.out.println("------------------------------------------------------------");

        System.out.println(":----:Insercion en lista vacia:----:");
        newCircularDoubleList.insertInVoidList();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al inicio de lista:----:");
        newCircularDoubleList.insertPrepend();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al inicio de lista:----:");
        newCircularDoubleList.insertPrepend();
        System.out.println(":----:Fin:----:");
        System.out.println(":----:Insercion al final de lista:----:");
        newCircularDoubleList.insertAppend();
        System.out.println(":----:Fin:----:");
        System.out.println();
        System.out.println(":-------------: CORRESPONDENCIA ENTRE NODOS LUEGO DE INSERCIONES :-------------:");
        System.out.println();
        newCircularDoubleList.getValues();
        System.out.println();
        System.out.println(":---------------------------------: Fin :--------------------------------------:");
        System.out.println();
        System.out.println(":----: Primer elemento eliminado:----:");
        newCircularDoubleList.deletePrepend();
        System.out.println(":----:Fin:----:");
        System.out.println();
        System.out.println(":----: Ultimo elemento eliminado:----:");
        newCircularDoubleList.deleteAppend();
        System.out.println(":----:Fin:----:");
        System.out.println();
        System.out.println(":-------------: CORRESPONDENCIA ENTRE NODOS LUEGO DE ELIMINACION :-------------:");
        System.out.println();
        newCircularDoubleList.getValues();
        System.out.println();
        System.out.println(":---------------------------------: Fin :--------------------------------------:");
        System.out.println();
        System.out.println("Hola mundo, quiero una hamburguesa");
    }
}