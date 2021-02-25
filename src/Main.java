import LinkedList.DobleLinkedList;
import LinkedList.SimpleLinkedList;

class Main{
    public static void main(String[] args) {
        SimpleLinkedList newList = new SimpleLinkedList();
        DobleLinkedList newDobleList = new DobleLinkedList();

        //Lista simplemente enlazada
        //newList.insertInLinkedVoid().getAge();
        //newList.insertPrepend().getAge();
        //newList.insertAppend().getAge();
        //newList.getValue();
        //newList.deletePrepend();
        //newList.getValue();
        //newList.deleteAppend();
        //newList.getValue();

        //Lista doblemente enlazada

        newDobleList.insertInVoidList();
        newDobleList.insertPrepend();
        newDobleList.insertPrepend();
        newDobleList.insertPrepend();
        newDobleList.insertAppend();
        newDobleList.getValues();
        System.out.println("Hola mundo, quiero una hamburguesa");
    }
}