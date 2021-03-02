package LinkedList;

public class DoubleLinkedCircularList {
    Nodo beginnig;
    Nodo end;
    int length;

    public void insertInVoidList(){
        Nodo newNodo = new Nodo();
        newNodo.setFirstName("JODA");
        newNodo.setLastName("ORION");
        newNodo.setAge(70);

        if(length == 0){
            beginnig = newNodo;
            end = newNodo;
        }

        end.setNext(beginnig);
        beginnig.setBehind(end);

        System.out.println(newNodo);

        length++;
    }

    public void insertPrepend(){

        Nodo newNodo = new Nodo();
        newNodo.setFirstName("Alexandra");
        newNodo.setLastName("Sosa");
        newNodo.setAge(77);
        newNodo.setNext(beginnig);
        beginnig = newNodo;
        end.setNext(beginnig);

        if(length == 1) {
            end.setBehind(beginnig);
        }else{
            beginnig.getNext().setBehind(beginnig);
            end.setNext(beginnig);
            beginnig.setBehind(end);
        }

        length++;
    }

    public void insertAppend(){

        Nodo aux;
        aux = end;
        Nodo newNodo = new Nodo();
        newNodo.setFirstName("Williams");
        newNodo.setLastName("Pharrel");
        newNodo.setAge(23);
        aux.setNext(newNodo);
        end = newNodo;
        end.setBehind(aux);
        end.setNext(beginnig);
        beginnig.setBehind(end);

        length++;

    }

    public void getValues(){
        Nodo aux;
        aux = beginnig;
        int i = 0;

        if(length > 0){
            while (i != length){
                System.out.println(aux.getAge());
                System.out.println("nodo anterior " + aux.getBehind() + " nodo actual " + aux + " nodo siguiente " + aux.getNext());
                aux = aux.getNext();
                i++;
            }
        }else{
            System.out.println(aux);
        }
    }

    public void deletePrepend(){
        Nodo aux;
        aux = beginnig;
        beginnig = aux.getNext();
        aux.setFirstName(null);
        aux.setLastName(null);
        aux.setAge(null);
        aux.setNext(null);
        end.setNext(beginnig);
        beginnig.setBehind(end);
        length--;
    }

    public void deleteAppend(){
        Nodo aux = end;
        end = end.getBehind();
        end.setNext(beginnig);
        aux.setBehind(null);
        aux.setNext(null);
        beginnig.setBehind(end);
        length--;
    }

}
