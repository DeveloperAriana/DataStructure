package LinkedList;

public class SimpleLinkedCircularList {
    Nodo beginning;
    Nodo end;
    int length;

    public void insertInVoidList(){
        Nodo newNodo = new Nodo();
        newNodo.setFirstName("LORETA");
        newNodo.setLastName("YAN");
        newNodo.setAge(60);

        if(length == 0){
            beginning = newNodo;
            end = newNodo;
        }

        newNodo.setNext(beginning);
        getInformation(newNodo);
        length++;
    }

    public void insertPrepend(){

        Nodo newNodo = new Nodo();
        newNodo.setFirstName("ANA");
        newNodo.setLastName("MOYA");
        newNodo.setAge(87);
        newNodo.setNext(beginning);
        beginning = newNodo;
        end.setNext(beginning);
        getInformation(beginning);
        length++;

    }

    public void insertAppend(){

        Nodo newNodo = new Nodo();
        Nodo aux = end;
        newNodo.setFirstName("PETRO");
        newNodo.setLastName("RAMIRZE");
        newNodo.setAge(9);
        newNodo.setNext(beginning);
        aux.setNext(newNodo);
        end = newNodo;
        getInformation(end);
        length++;

    }

    public void getValues(){

        Nodo aux = beginning;
        int i = 0;

        if(length > 0){
            while (i != length){
                System.out.println(aux  + " ⇄ " +  aux.getNext());
                aux = aux.getNext();
                i++;
            }
        }else{
            System.out.println(aux);
        }
    }

    public void deletePrepend(){

        Nodo aux;
        aux = beginning;
        getInformation(aux);
        aux.setFirstName(null);
        aux.setLastName(null);
        aux.setAge(null);
        beginning = aux.getNext();
        aux.setNext(null);
        end.setNext(beginning);
        length--;

    }

    public void deleteAppend(){
        int i = 0;
        Nodo aux = beginning;
        Nodo auxEnd = end;
        getInformation(auxEnd);
        if(length > 0){
            while (i != length  && aux.getNext() != end){
                aux = aux.getNext();
                i++;
            }

            aux.setNext(beginning);
            end = aux;
            auxEnd.setNext(null);
            length--;
        }
    }
    public void getInformation(Nodo nodo){
        System.out.print(" Direccion del nodo: " + nodo + " Primer nombre: " + nodo.getFirstName() + " Primer apellido: " + nodo.getLastName() + " Edad: " + nodo.getAge());
        System.out.println();
    }
}
