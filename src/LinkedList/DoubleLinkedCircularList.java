package LinkedList;

public class DoubleLinkedCircularList {
    Nodo beginnig;
    Nodo end;
    int length;

    public Nodo insertInVoidList(){
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

        length++;

        getInformation(beginnig);
        return beginnig;
    }

    public Nodo insertPrepend(){

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

        getInformation(beginnig);

        return beginnig;
    }

    public Nodo insertAppend(){

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

        getInformation(end);
        return end;

    }

    public void getValues(){
        Nodo aux;
        aux = beginnig;
        int i = 0;

        if(length > 0){
            while (i != length){
                System.out.println(aux.getBehind() + " ⇄ " + aux  + " ⇄ " +  aux.getNext());
                aux = aux.getNext();
                i++;
            }
        }else{
            System.out.println(aux);
        }
    }

    public Nodo deletePrepend(){
        Nodo aux;
        aux = beginnig;

        getInformation(aux);

        beginnig = aux.getNext();
        aux.setFirstName(null);
        aux.setLastName(null);
        aux.setAge(null);
        aux.setNext(null);
        end.setNext(beginnig);
        beginnig.setBehind(end);
        length--;

        return aux;
    }

    public Nodo deleteAppend(){
        Nodo aux = end;
        getInformation(aux);
        end = end.getBehind();
        end.setNext(beginnig);
        aux.setBehind(null);
        aux.setNext(null);
        beginnig.setBehind(end);
        length--;

        return aux;
    }

    public void getInformation(Nodo nodo){
        System.out.print(" Direccion del nodo: " + nodo + " Primer nombre: " + nodo.getFirstName() + " Primer apellido: " + nodo.getLastName() + " Edad: " + nodo.getAge());
        System.out.println();
    }

}
