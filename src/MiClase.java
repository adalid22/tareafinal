

/*TAREA EN GRUPO 
 * Junior Zelaya
 * Kevin Lanza
 * Maynor Morales 
 * y Adalid solis
 */
public class MiClase
{
    //devuelve la suma de a y b
    static int sumarNumeros(int a, int b)
    {
        return a + b;
    }
    
    //devuelve la resta de a y b
    static int restarNumeros(int a, int b)
    {
        return a-b;
    }
    
    //devuelve la multiplicacion de a y b
    static int multiplicarNumeros(int a, int b)
    {
        return a*b;
    }
    
    //devuelve true si num es par, de lo contrario, devuelve false
    static boolean esPar(int num)
    {
        //aqui comparo el resultado y lo comparo a 0 para comprobar si es numero par, de lo contrario es falso
        int test=num%2;
        
        if(test==0)
        {
            return true;
        }
             return false;
    }

    //devuelve el numero mayor entre a, b o c
    //PRIMERO CREAMOA UNA VARIABLE PARA ALMACENAR EL RESULTADO
    
    static int getMayor(int a, int b, int c)
    {
        //aqui comparo cada varible, una con otra y devuelvo asi el numero mayor
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>a && b>c)
        {
            return b;
        }
            return c;    
    }
    
    //devuelve num elevado a la potencia
    //creamos 2 variables para luego poder hacer la funcion de encontrar el resultado//
    static int potencia(int num, int potencia)
    {
        //primero declaro la vairable resultado, utilizando el for multiplico la base por la numeracion en el exponente, luego retornar el resultado
        int resultado = num;
        
        for(int x=1; x<potencia; x++)
        {
            resultado=resultado*num;
        }
            return resultado;
    }
    
    //devuelve el numero mayor del arreglo
    //creamos la variable para luego realizar la funcion de encontrar la variable mayor//
    static int sumarArreglo(int arreglo[])
    {
        //primero declaro la variable suma, luego uso for para ir sumando cada posicion del arreglo y asi retornar el resultado
        int suma=0;
        
        for(int x=0; x<arreglo.length; x++)
        {
            suma=suma+arreglo[x];
        }
            return suma;
    }
    
    //devuelve el numero mayor de un arreglo
    //insertamos la variable con la que demostraremos el numero mayor//
    static int getMayorArreglo(int arreglo[])
    {
        //declaro la varible resultado, utilizo for para que compare segun el tamaño, siguiente obtengo el mayor, del cual saldra el resultado que sera retornado al final
        int resultado = arreglo[0]; 
        
        for(int x=0; x<arreglo.length; x++) 
        { 
            if(arreglo[x] > resultado) 
        { 
                resultado = arreglo[x]; 
        } 
        } 
            return resultado; 
    }
    
    //devuelve el numero menor de un arreglo
    //una variable para encontrar el numero menor que qeremos buscar
    static int getMenorArreglo(int arreglo[])
    {
        //declaro la varible resultado, utilizo for para que compare segun el tamaño, siguiente obtengo el menor, del cual saldra el resultado que sera retornado al final 
        int resultado = arreglo[0]; 
        
        for(int x=0; x<arreglo.length; x++) 
        { 
            if(arreglo[x] < resultado) 
        { 
                resultado = arreglo[x]; 
        } 
        } 
            return resultado; 
    }
    
    //devuelve true si encuentra cadena dentro arreglo
    
    //insertamos un string para poder insertar la cadena y trabajamos con un boolean para saber si es falso o es verdadero
    static boolean existe(String arreglo[],String cadena)
    {
        //aqui el for se ira verificando, el if compara la posicion del arreglo, si cumple es retornara true, sino false.
        for(int x=0; x<arreglo.length; x++)
        {
            if(arreglo[x].equals(cadena))
        {
                return true;
        }
        }
            return false;
    }
    
    public static void main(String args[])
    {
        
    }
}
/*Esta tarea la relizamos 
 * Junior Zelaya
 * Kevin Lanza
 * Maynor Morales 
 * y Adalid solis
 */