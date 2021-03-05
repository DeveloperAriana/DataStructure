package LinkedList;

public class SimpleLinkedList {

     int length;
     Nodo beginning;
     Nodo end;

     public Nodo insertInLinkedVoid(){
         Nodo newNode = new Nodo();
         newNode.setFirstName("Ariana");
         newNode.setLastName("Toro");
         newNode.setAge(21);
         newNode.setNext(beginning);

         getInformation(newNode);

         if(beginning == null){
             beginning = newNode;
             end = newNode;
             length++;
         }

         return beginning;
     };

     public Nodo insertPrepend(){

         Nodo newNode = new Nodo();
         newNode.setFirstName("Freddy");
         newNode.setLastName("Paquian");
         newNode.setAge(25);
         newNode.setNext(beginning);
         beginning = newNode;

         getInformation(beginning);

         length++;

         return beginning;
     }

     public Nodo insertAppend(){

         Nodo newNode = new Nodo();
         newNode.setFirstName("Juanita");
         newNode.setLastName("Perez");
         newNode.setAge(50);

         newNode.setNext(null);
         end.setNext(newNode);
         end = newNode;
         getInformation(end);
         length++;

         return end;
     }

     public int getValue(){

         Nodo nodeAux;
         nodeAux = beginning;
         int i = 0;

         if(beginning != null){
             while (i != length){
                 System.out.println(nodeAux  + " ⇄ " +  nodeAux.getNext());
                 nodeAux = nodeAux.getNext();
                 i++;
             }
         }

         return 1;
     };

     public int deletePrepend(){
         if(length > 0) {
             beginning = beginning.getNext();
             getInformation(beginning);
             length--;
         }

         return 1;
     }

     public int deleteAppend(){

         int i = 0;
         Nodo newNode;
         newNode = beginning;
         getInformation(end);
         while(i != length && newNode.getNext().getNext() != null){
             newNode = newNode.getNext();
             i++;
         }

         newNode.setNext(null);
         end = newNode;
         length--;

         return 1;
     }

    public void getInformation(Nodo nodo){
        System.out.print(" Direccion del nodo: " + nodo + " Primer nombre: " + nodo.getFirstName() + " Primer apellido: " + nodo.getLastName() + " Edad: " + nodo.getAge());
        System.out.println();
    }

}
