import LinkedList.DobleLinkedList;
import LinkedList.DoubleLinkedCircularList;
import LinkedList.SimpleLinkedCircularList;
import LinkedList.SimpleLinkedList;

class Main{
    public static void main(String[] args) {
        //SimpleLinkedList newList = new SimpleLinkedList();
        //DobleLinkedList newDobleList = new DobleLinkedList();
        //SimpleLinkedCircularList newCircularList = new SimpleLinkedCircularList();
        DoubleLinkedCircularList newCircularDoubleList = new DoubleLinkedCircularList();

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

        //newDobleList.insertInVoidList();
        //newDobleList.insertPrepend();
        //newDobleList.insertPrepend();
        //newDobleList.insertPrepend();
        //newDobleList.insertAppend();
        //newDobleList.getValues();
        //newDobleList.deletePrepend();
        //newDobleList.deleteAppend();
        //newDobleList.getValues();
        //newCircularList.insertInVoidList();
        //newCircularList.insertAppend();
        //newCircularList.insertPrepend();

        //newCircularList.deletePrepend();
        //newCircularList.deleteAppend();
        //newCircularList.getValues();

        newCircularDoubleList.insertInVoidList();
        newCircularDoubleList.insertPrepend();
        newCircularDoubleList.insertPrepend();
        newCircularDoubleList.insertAppend();
        //newCircularDoubleList.getValues();
        newCircularDoubleList.deletePrepend();
        newCircularDoubleList.deleteAppend();
        newCircularDoubleList.getValues();
        System.out.println("Hola mundo, quiero una hamburguesa");
    }
}