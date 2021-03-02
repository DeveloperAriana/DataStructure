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
        length++;

    }

    public void getValues(){

        Nodo aux = beginning;
        int i = 0;

        if(length > 0){
            System.out.println(aux.getAge()+" " + aux);
            while (i != length){
                System.out.println("nodo anterior " + aux.getBehind() + " nodo actual " + aux + " nodo siguiente " + aux.getNext());
                aux = aux.getNext();
                System.out.println(aux.getAge()+" " + aux);
                i++;
            }
        }else{
            System.out.println(aux);
        }
    }

    public void deletePrepend(){

        Nodo aux;
        aux = beginning;
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
        if(length > 0){
            while (i != length  && aux.getNext() != end){
                //System.out.println(aux);
                aux = aux.getNext();
                //System.out.println(aux);
                i++;
            }

            aux.setNext(beginning);
            end = aux;
            auxEnd.setNext(null);
            length--;
        }

      //  System.out.println(end.getNext());
    }
}
