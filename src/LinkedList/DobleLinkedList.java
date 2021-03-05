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

        getInformation(newNode);
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

        getInformation(beginning);
        length++;
    }

    public void insertAppend(){
        Nodo newNodo = new Nodo();
        Nodo aux = end;
        newNodo.setFirstName("JUAN");
        newNodo.setLastName("HERNANDEZ");
        newNodo.setAge(90);
        newNodo.setNext(null);
        newNodo.setBehind(aux);
        end = newNodo;
        aux.setNext(end);
        length++;

        getInformation(newNodo);

        return;
    }

    public void getValues(){

        int i = 0;
        Nodo newNodo;
        newNodo = beginning;

        if(length >= 0 && newNodo.getNext() != null){

            while(i != length){
                System.out.println(newNodo.getBehind() + " ⇄ " + newNodo  + " ⇄ " +  newNodo.getNext());
                newNodo = newNodo.getNext();
                i++;
            }

        }else{
            System.out.println(newNodo.getAge());
        }

    }

    public void deletePrepend(){

        Nodo aux = beginning;

        aux.setFirstName(null);
        aux.setLastName(null);
        aux.setAge(null);
        getInformation(aux);
        beginning = beginning.getNext();
        beginning.setBehind(null);

        length--;

    }

    public void deleteAppend(){
        Nodo aux;
        aux = end.getBehind();
        getInformation(aux);
        end = aux;
        end.setNext(null);
        length--;
    }

    public void getInformation(Nodo nodo){
        System.out.print(" Direccion del nodo: " + nodo + " Primer nombre: " + nodo.getFirstName() + " Primer apellido: " + nodo.getLastName() + " Edad: " + nodo.getAge());
        System.out.println();
    }

}
