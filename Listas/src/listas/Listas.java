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
//          miLista listica = new miLista();
//          System.out.println("Lista inicial(lista simple): ");
//          listica.add(10);
//          listica.add(20);
//          listica.add(30);
//          System.out.println(listica.showData());
//          System.out.println("Cantidad de datos: "+listica.getSize());
//          System.out.println("El dato mayor: "+listica.getBiggest());
//          System.out.println("El dato menor: "+listica.getSmallest());
//          System.out.println("El promedio: "+listica.getPromedio());
//          listica.addAtEnd(40);
//          System.out.println("Despues de insertar al final el 40 :"+listica.showData());
//          System.out.println("Advertencia de insertar uno que ya esta en la lista: ");
//          listica.addAtEnd(30);
//          System.out.println("");
//          ListaDoble lista2 = new ListaDoble();
//          lista2.add(33);
//          lista2.add(30);
//          lista2.add(31);
//          lista2.add(32);
//          lista2.add(66);
//          System.out.println("Lita inicial(lista doble) : " + lista2.showData());
//          System.out.println("Probar si un dato ya esta...");
//          System.out.print("Ingrese un numero que este en la lista: ");
//          numero = input.nextInt();
//          System.out.println(lista2.search(numero));
//          System.out.println("Eliminando el ultimo numero: ");
//          lista2.DeleteLast();
//          
//          System.out.println(lista2.showData());
//          
//          ListaCircularSimple CirSim = new ListaCircularSimple();
//          CirSim.add(10);
//          CirSim.add(20);
//          CirSim.add(30);
//          CirSim.add(40);
//          System.out.println("Lista Inicial(lista circular simple): "+CirSim.showData());
//          CirSim.delete();
//          System.out.println("Después de eliminar el primer dato: "+CirSim.showData());
//          ListaCircularSimple CirSim2 = new ListaCircularSimple();
//          CirSim2.add(50);
//          CirSim2.add(60);
//          CirSim2.add(70);
//          System.out.println("Lista 2 inicial(Circular simple)" + CirSim2.showData());
//          CirSim.LinkedList(CirSim2);
//          System.out.println("Después de unir las dos listas: " + CirSim.showData());
//          ListaCircularDoble sir = new ListaCircularDoble();
//          sir.add(70);
//          sir.add(60);
//          sir.add(50);
//          sir.add(40);
//          sir.add(30);
//          sir.add(20);
//          System.out.println("Lista inicial (Circular doble): "+sir.showData());
//          sir.deleteLast();
//          System.out.println("Desués de eliminar el ultimo dato: "+sir.showData());
//          System.out.println("Descendentemente : "+sir.showDataDes());
//          System.out.println("Ascendentemente : "+sir.showDataAsc());
            System.out.println("esta balanceada? {32-[5322-23(232 + 123)]} : "+validarExpresionMatematica("{32-[5322-23(232 + 123)]}"));
            System.out.println("Pruebas de conversion");
            try {
            System.out.println("Conversión numérica de 14 en octal: " + convertirBasesNumericas(14, 8));//resultado: 16
            }
            catch (Exception e) {
            System.out.println("Eror:" + e.getMessage());
            }
            try
            {
                System.out.println("Conversión numérica de 14 base 10 a base 7" + convertirBasesNumericas(14, 7));//mostrar el error
            }
            catch (Exception e) {
            System.out.println("Eror:" + e.getMessage());
            }
            try
            {
                System.out.println("Conversión numérica de 14 en hexadecimal: " + convertirBasesNumericas(14, 16));//E
            }
            catch (Exception e) {
            System.out.println("Eror:" + e.getMessage());
            }
            try
            {
                System.out.println("Conversión numérica de 14 en binario: " + convertirBasesNumericas(14, 2));//1110
            }
            catch (Exception e) {
            System.out.println("Eror:" + e.getMessage());
            }
            
    }
     public static String convetirDecimalBinario(int n) {
        LinkedStack<Integer> residuos = new LinkedStack<>();
        String binario = "";
        while (n > 0) {
            residuos.push(n % 2);
            n /= 2;
        }
        while (!residuos.empty()) {
            try {
                binario += residuos.pop();
            } catch (Exception e) {
                System.out.println("Error interno");
            }

        }
        return binario;

    }
    
    public static String convertirBasesNumericas(int n, int base) throws Exception
    {
        LinkedStack<Integer> residuos = new LinkedStack<>();
        LinkedStack<String> residuos2 = new LinkedStack<>();
        String resultado = "";
        if(base == 2 || base == 8)
        {
            while (n > 0) {
            residuos.push(n % base);
            n /= base;
            
        }
            while (!residuos.empty()) {
            try {
                resultado += residuos.pop();
            } catch (Exception e) {
                System.out.println("Error interno");
            }
        }
            return resultado;
        }
        else if(base == 16)
        {
            while (n > 0) {
            if(n % base > 9)
            {
                int temp = n % base;
                if(temp == 10)
                {
                    residuos2.push("A");
                }
                else if(temp == 11)
                {
                    residuos2.push("B");
                }
                else if(temp == 12)
                {
                    residuos2.push("C");
                }
                else if(temp == 13)
                {
                    residuos2.push("D");
                }
                else if(temp == 14)
                {
                    residuos2.push("E");
                }
                else if(temp == 15)
                {
                    residuos2.push("F");
                }
            }
            n /= base;
            
        }
            while (!residuos2.empty()) {
            try {
                resultado += residuos2.pop();
            } catch (Exception e) {
                System.out.println("Error interno");
            }
        }
            return resultado;
        }
        else
        {
            throw new IllegalArgumentException("La base no es valida");
        }
    }
     
    public static boolean validarBalanceParentesis(String expresion) {
        LinkedStack<String> parentesis = new LinkedStack<>();
        char[] expresionEnArreglo = expresion.toCharArray();
        for (int i = 0; i < expresionEnArreglo.length; i++) {
            if (expresionEnArreglo[i] == '(') {
                parentesis.push("(");
            } else if (expresionEnArreglo[i] == ')') {
                if (parentesis.empty()) {
                    return false;
                } else {
                    try {
                        parentesis.pop();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                }

            }

        }

        return parentesis.empty();

    }
    public static boolean validarExpresionMatematica(String expresion)
    {
        LinkedStack<String> llaves = new LinkedStack<>();
        LinkedStack<String> corchetes = new LinkedStack<>();
        LinkedStack<String> parentesis = new LinkedStack<>();
        char[] expresionEnArreglo = expresion.toCharArray();
        for (int i = 0; i < expresionEnArreglo.length; i++) {
            if(expresionEnArreglo[i] == '{')
            {
                if(llaves.empty())
                {
                    if(corchetes.empty() == false || parentesis.empty() == false)
                    {
                        return false;
                    }
                    else
                    {
                        llaves.push("{");
                    }
                }
                else
                {
                    return false;
                }
            }
            else if(expresionEnArreglo[i] == '[')
            {
                if(corchetes.empty())
                {
                    if(llaves.empty() == true || llaves.size() == 1)
                    {
                        if(parentesis.empty())
                        {
                            corchetes.push("[");
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else if(expresionEnArreglo[i] == '(')
            {
                parentesis.push("(");
            }
            
            if(expresionEnArreglo[i] == '}')
            {
                if(llaves.empty())
                {
                    return false;
                }
                else
                {
                    try {
                        llaves.pop();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            else if(expresionEnArreglo[i] == ']')
            {
                if(corchetes.empty())
                {
                    return false;
                }
                else
                {
                    try {
                        corchetes.pop();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            else if(expresionEnArreglo[i] == ')')
            {
                if(parentesis.empty())
                {
                    return false;
                }
                else
                {
                    try {
                        parentesis.pop();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

        }
        return llaves.empty() == true && corchetes.empty() == true && parentesis.empty() == true;
    }
}
