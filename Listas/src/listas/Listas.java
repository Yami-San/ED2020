/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        // TODO code application logic here
          miLista listica = new miLista();
          System.out.println("Lista inicial(lista simple): ");
          listica.add(10);
          listica.add(20);
          listica.add(30);
          System.out.println(listica.showData());
          System.out.println("Cantidad de datos: "+listica.getSize());
          System.out.println("El dato mayor: "+listica.getBiggest());
          System.out.println("El dato menor: "+listica.getSmallest());
          System.out.println("El promedio: "+listica.getPromedio());
          listica.addAtEnd(40);
          System.out.println("Despues de insertar al final el 40 :"+listica.showData());
          System.out.println("Advertencia de insertar uno que ya esta en la lista: ");
          listica.addAtEnd(30);
          System.out.println("");
          ListaDoble lista2 = new ListaDoble();
          lista2.add(33);
          lista2.add(30);
          lista2.add(31);
          lista2.add(32);
          lista2.add(66);
          System.out.println("Lita inicial(lista doble) : " + lista2.showData());
          System.out.println("Probar si un dato ya esta...");
          System.out.print("Ingrese un numero que este en la lista: ");
          numero = input.nextInt();
          System.out.println(lista2.search(numero));
          System.out.println("Eliminando el ultimo numero: ");
          lista2.DeleteLast();
          
          System.out.println(lista2.showData());
          
          ListaCircularSimple CirSim = new ListaCircularSimple();
          CirSim.add(10);
          CirSim.add(20);
          CirSim.add(30);
          CirSim.add(40);
          System.out.println("Lista Inicial(lista circular simple): "+CirSim.showData());
          CirSim.delete();
          System.out.println("Después de eliminar el primer dato: "+CirSim.showData());
          ListaCircularSimple CirSim2 = new ListaCircularSimple();
          CirSim2.add(50);
          CirSim2.add(60);
          CirSim2.add(70);
          System.out.println("Lista 2 inicial(Circular simple)" + CirSim2.showData());
          CirSim.LinkedList(CirSim2);
          System.out.println("Después de unir las dos listas: " + CirSim.showData());
          ListaCircularDoble sir = new ListaCircularDoble();
          sir.add(70);
          sir.add(60);
          sir.add(50);
          sir.add(40);
          sir.add(30);
          sir.add(20);
          System.out.println("Lista inicial (Circular doble): "+sir.showData());
          sir.deleteLast();
          System.out.println("Desués de eliminar el ultimo dato: "+sir.showData());
          System.out.println("Descendentemente : "+sir.showDataDes());
          System.out.println("Ascendentemente : "+sir.showDataAsc());
//       listica.add(55);
//       listica.add(66);
//       listica.add(77);
//       listica.add(88);
//       listica.add(99);
//       listica.add(101);
//       listica.add(111);
//       listica.add(121);
//       listica.add(131);
//       listica.add(8);
//        listica.addOrdered(11);
//        listica.addOrdered(8);
//        listica.addOrdered(6);
//        listica.addOrdered(13);
//        listica.addOrdered(9);
//
//        System.out.println(listica.showData());
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        System.out.println("");
//
//        System.out.println(listica.showData());
    }
    
}
