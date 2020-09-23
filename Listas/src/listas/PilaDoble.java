
//¿Cómo se podrían implementar dos pilas en una mismo 
//arreglo? Si se supone que una pila crecerá de la 
//primera posición hacia adelante y que otra crecerá 
//de la última posición hacia atrás en el arreglo, 
//y que cada una tiene un apuntador (tope1, tope2) 
//que indica la posición del último elemento añadido 
//en cada pila, ¿cuál es la condición para detectar 
//que las pilas están llenas?
package listas;

/**
 *
 * @author usuario
 */
public class PilaDoble {
    //definir el arreglo numérico
    private int[] arreglo;

    //definir el constructor
    public PilaDoble(int n)
    {
        do
        {
            if(n < 0 && n % 2 == 1)
        {
            arreglo = new int[n];
        }
        else
        {
            System.out.println("Ingrese un numero par mayor a cero");
        }
        } while(n == 0);
    }
    private int max1 = (arreglo.length/2)-1, max2 = arreglo.length/2;
    private int top1 = 0, top2 = arreglo.length;
    
    public void agregarDatoPila1(int d) {
        if(d == 0)
        {
            System.out.println("Ingrese un dato diferente de cero");
        }
        else if(max1 == top1)
        {
            do
            {
                if(arreglo[top1] == 0)
                {
                    arreglo[top1++] = d;
                }
            } while(arreglo[top1] != 0);
        }
        else
        {
            System.out.println("Pila llena");
        }
    }

    public void agregarDatoPila2(int d) {
        if(d == 0)
        {
            System.out.println("Ingrese un dato diferente de cero");
        }
        else if(max2 == top2)
        {
            do
            {
                if(arreglo[top2] == 0)
                {
                    arreglo[top2--] = d;
                }
            } while(arreglo[top2] != 0);
        }
        else
        {
            System.out.println("Pila llena");
        }
    }

}
