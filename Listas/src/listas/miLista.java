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
public class miLista {
    private Node head;
    private int n;
    public miLista() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(int n) {
        Node newNode = new Node(n);
        newNode.setNextNode(head);
        head = newNode;
        this.n++;
    }
    
    public void addAtEnd(int n)
    {
        Node newNode = new Node(n);
        if(isEmpty())
        {
            newNode.setNextNode(head);
            head = newNode;
            this.n++;
        } 
        else if(ThatElementExist(newNode))
            {
                System.out.print("El número: "+n+" ya se encuentra en la lista ");
            }
        else
        {
            int count = 0;
            Node current = head;
            while(this.n > count)
            {
                if(count == getSize() - 1)
                {
                    current.setNextNode(newNode);
                }
                count++;
                current = current.getNextNode();
            }
            this.n++;
        }
                
    }
    
    public boolean ThatElementExist(Node nod)
    {
        Node current = head;
        boolean value = false;
        while(current != null)
        {
            if(current.getData() == nod.getData())
            {
                value = true;
                break;
            }
            current = current.getNextNode();
        }
        return value;
    }

    public String showData() {
        String data = "";
        if (isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            Node current = head;
            while (current != null) {
                data += current.getData() + " - ";
                current = current.getNextNode();
            }
        }
        return data;
    }
    /*
    Retorna el tamaño de la lista.
    */
    public int getSize()
    {
        return n;
    }

    public void addOrdered(int d) {
        //Crear un nodo para el nuevo dato.
        Node newNode = new Node(d);
        /*
            Si la lista esta vacía, o el valor del primer elemento 
            de la lista es mayor que el nuevo, 
            insertar el nuevo nodo en la primera posición de la lista 
            y modificar la cabecera respectivamente.
         */
        if (isEmpty() || head.getData() > newNode.getData()) {
            newNode.setNextNode(head);
            head = newNode;
            n++;
        } else {
            /*
        Si no se cumple el caso anterior,
        buscar el lugar adecuado para la inserción: 
        recorrer la lista conservando el nodo actual. 
        Inicializar nodo actual con el valor de primera posición, 
        y avanzar mientras el siguiente nodo no sea nulo 
        y el dato que contiene la siguiente posición 
        sea menor o igual que el dato a insertar(nuevo nodo).
        Con esto se seña al nodo adecuado, 
        a continuación insertar el nuevo nodo a continuación de él.
             */
            Node current = head;

            while (current.getNextNode() != null 
                    && current.getNextNode().getData()<=newNode.getData()) {
                //avanzar
                current = current.getNextNode();
            }
            
            //El nuevo dato debe ir a continuación del actual (current)
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
            n++;
        }
    }
    
    //borrar el primer dato de la lista
    public void delete(){
        if(isEmpty()){
            System.out.println("No existen datos a borrar");
        }else{
            head = head.getNextNode();
            n--;
        }
    }
    
    //borrar el último elemento
    public Node deleteLast(){
        if(isEmpty()){
            System.out.println("No existen datos a borrar");
            return null;
        //validar si existe un solo dato
        }else if(head.getNextNode()==null){
            Node temp = head;
            head = null;
            n--;
            return temp;
        }else{
            Node temp = head;
            Node current = head;
            while(current.getNextNode().getNextNode()!=null){
                current = current.getNextNode();
                temp = current;
            }
            current.setNextNode(null);
            n--;
            return temp;
        }
    
    }
    
    public int getBiggest()
    {
        Node current = head;
        int numMayor = current.getData();
        if (isEmpty()) {
            return numMayor;
        }
        else if(getSize() == 1)
        {
            return current.getData();
        }
        else {
            int count = 1;
            Node next = current.getNextNode();
            while (n > count) {
                if(current.getData()< next.getData())
                {
                    numMayor = next.getData();
                }
                count++;
                if(count == n)
                {
                    break;
                }
                current = current.getNextNode();
                next = current.getNextNode();
            }
            return numMayor;
        }
    }
    
    public int getSmallest()
    {
        Node current = head;
        int numMenor = current.getData();
        if (isEmpty()) {
            return numMenor;
        }
        else if(getSize() == 1)
        {
            return current.getData();
        }
        else {
            int count = 1;
            Node next = current.getNextNode();
            while (n > count) {
                if(current.getData()> next.getData())
                {
                    numMenor = next.getData();
                }
                count++;
                if(count == n)
                {
                    break;
                }
                current = current.getNextNode();
                next = current.getNextNode();
            }
            return numMenor;
        }
    }
    
    public int getPromedio()
    {
        Node current = head;
        int promReal = current.getData();
        if (isEmpty()) {
            return promReal;
        } else {
            int promedio = 0;
            int count = 0;
            while (n > count)
            {
                promedio += current.getData();
                current = current.getNextNode();
                count++;
            }
            promReal = promedio/n;
            return promReal;
        }
    }
}
