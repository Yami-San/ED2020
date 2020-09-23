/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author usuario
 */
public class ListaCircularSimple {
    private Node head, tail;

    public ListaCircularSimple() {
        head = tail = null;
        
    }
    
    
    private boolean isEmpty() {
        return head == null;
    }
    /**
     * Agregar un dato al inicio de la lista circular
     * @param d Información del nodo
     */
    public void add(int d){
        Node newNode = new Node(d);
        if(isEmpty()){           
            head = tail = newNode;
            newNode.setNextNode(newNode);
        }else{
            newNode.setNextNode(head);
            head = newNode;
            tail.setNextNode(head);
        }
    }
    /**
     * Mostrar los datos de la lista desde el primero al último
     * @return 
     */
    public String showData() {
        String data = "";
        if (isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            Node current = head;
            do{
                data += current.getData() + " - ";
                current = current.getNextNode();
            }while (current != head);
        }
        return data;
    }
    
    public void delete()
    {
        if(isEmpty())
        {
            System.out.println("Lista vacia");
        }
        else if(head == tail)
        {
            head = tail = null;
        }
        else
        {
            head = head.getNextNode();
            tail.setNextNode(head);
        }
    }
    
    public void LinkedList(ListaCircularSimple list)
    {
        if(list.isEmpty() && isEmpty())
        {
            System.out.println("Listas vacias");
        }
        else if(list.isEmpty())
        {
            System.out.println("La lista de parametro esta vacia");
        }
        else if(isEmpty())
        {
            Node current = list.head;
            Node current2 = head;
            do
            {
                if(current == list.head)
                {
                    head = current;
                }
                else
                {
                    current2 = current;
                }
                current2 = current2.getNextNode();
                current = current.getNextNode();
            } while(current != list.head);
        }
        else
        {
            Node current = head;
            do
            {
                if(current.getNextNode() == head)
                {
                    break;
                }
                current = current.getNextNode();
            } while(current != head);
            Node current2 = list.head;
            do
            {
                if(current2.getNextNode() == list.head)
                {
                    break;
                }
                current2 = current2.getNextNode();
            } while(current2 != list.head);
            current.setNextNode(list.head);
            current2.setNextNode(head);
        }
    }
}
