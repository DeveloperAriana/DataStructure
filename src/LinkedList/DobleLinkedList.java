package LinkedList;

public class DobleLinkedList {
    int length;
    Nodo beginning;
    Nodo end;


    public int insertInVoidList(){
        Nodo newNode = new Nodo();
        newNode.setFirstName("Ramon");
        newNode.setLastName("Perez");
        newNode.setAge(30);

        if(length <= 0 ){
            newNode.setNext(beginning);
            newNode.setBehind(end);
            beginning = newNode;
            end = newNode;
            length++;
        }

        return 1;
    }

    public void insertPrepend(){

        Nodo newNodo = new Nodo();
        Nodo aux;
        aux = beginning;
        newNodo.setFirstName("Josefina");
        newNodo.setLastName("Torres");
        newNodo.setAge(60);
        newNodo.setBehind(null);
        aux.setBehind(newNodo);
        newNodo.setNext(aux);

        beginning = newNodo;

        length++;
    }

    public void insertAppend(){
        Nodo newNodo = new Nodo();
        Nodo aux;
        aux = end;
        newNodo.setFirstName("JUAN");
        newNodo.setLastName("HERNANDEZ");
        newNodo.setAge(90);
        newNodo.setBehind(aux);
        newNodo.setNext(null);
        aux.setNext(newNodo);
        length++;

        System.out.println("Nuevo nodo");
        System.out.println(aux);
        System.out.println(newNodo);

        return;
    }

    public void getValues(){

        int i = 0;
        Nodo newNodo;
        newNodo = beginning;

        if(length >= 0 && newNodo.getNext() != null){

            while(i != length){
                System.out.println("nodo anterior " + newNodo.getBehind() + " nodo actual " + newNodo + " nodo siguiente " + newNodo.getNext());
                System.out.println(newNodo.getAge());
                newNodo = newNodo.getNext();
                i++;
            }
        }else{
            System.out.println(newNodo.getAge());
        }

    }

}
