
import java.util.NoSuchElementException;
import listas.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class ColaEnlazada {
    private Node cabeza;
    private Node ultimo;

    public ColaEnlazada() {
        cabeza = ultimo = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregar(int d) {
        Node nuevoNodo = new Node(d);
        if (estaVacia()) {
            cabeza = ultimo = nuevoNodo;
        } else {
            ultimo.setNextNode(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public void remover() {
        if (estaVacia()) {
            System.out.println("Cola sin datos");
        }else if (cabeza==ultimo){
            cabeza = ultimo = null;
        }else{
            cabeza= cabeza.getNextNode();
        }

    }
    
    //Implementar método element y peek
    
    public Node element() throws Exception
    {
        if(estaVacia())
        {
            throw new NoSuchElementException ("Cola vacía");
        }
        else
        {
            return cabeza;
        }
    }
    
    public Node peek()
    {
        return cabeza;
    }

}
