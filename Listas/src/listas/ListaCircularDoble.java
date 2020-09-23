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
public class ListaCircularDoble {
    private DoubleNode head;

    public ListaCircularDoble() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    /**
     * Agregar un dato al inicio de la lista
     *
     * @param d Dato
     */
    public void add(int d) {
        DoubleNode newNode = new DoubleNode(d);

        if (isEmpty()) {
            newNode.setPreviosNode(newNode);
            newNode.setNextNode(newNode);
            head = newNode;
        } else {
            newNode.setPreviosNode(head.getPreviosNode());
            newNode.setNextNode(head);
            //configuración último elemento de la lista
            head.getPreviosNode().setNextNode(newNode);
            head.setPreviosNode(newNode);            
            head = newNode;
        }
}
    
    public String showData() {
        String data = "";
        if (isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            DoubleNode current = head;
            do{
                data += current.getData() + " - ";
                current = current.getNextNode();
            }while (current != head);
        }
        return data;
    }
    
    public void deleteLast()
    {
        if(isEmpty())
        {
            System.out.print("Lista vacia");
        }
        else if(head.getNextNode() == head)
        {
            head = null;
        }
        else if(head.getPreviosNode().getPreviosNode() == head)
        {
            head.setNextNode(head);
        }
        else
        {
            head.getPreviosNode().getPreviosNode().setNextNode(head);
            head.setPreviosNode(head.getPreviosNode().getPreviosNode());
        }
    }
    
    public String showDataDes()
    {
        String data = "";
        if (isEmpty()) {
            System.out.println("Lista vacia");
        } 
        else 
        {
            DoubleNode current = head.getPreviosNode();
            do
            {
                data += current.getData() + " - ";
                current = current.getPreviosNode();
                if(current == head)
                {
                    data += current.getData() + " - ";
                }
            } while(current != head);
        }
        return data;
    }
    
    public int size()
    {
        int size = 0;
        DoubleNode current = head;
        if(isEmpty())
        {
            size = 0;
        }
        else
        {
            do
            {
                size++;
                current = current.getNextNode();
            } while (current != head);
        }
        return size;
    }
    
    public String showDataAsc()
    {
        String data = "";
        if (isEmpty()) {
            System.out.println("Lista vacia");
        } 
        else 
        {
            DoubleNode current = head;
            do
            {
                data += current.getData() + " - ";
                current = current.getNextNode();
            } while(current != head);
        }
        return data;
    }
}
