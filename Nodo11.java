
package nodo1.pkg1;

import java.util.Scanner; 

public class Nodo11 {
    Scanner sc= new Scanner (System.in);

    static class Nodo{
        String Nombre;
        Nodo sig;
    }
    
    Nodo inicial, temporal, next; String name; 
        
    public static void main(String[] args) { //Metodo donde agregamos nuestro Menu
        Scanner sc= new Scanner (System.in);
        Nodo11 n= new Nodo11(); //Se manda a llamar a la clase 
        int opc; //se declara variable para el menu
        do{ //se abre un do while para nuestro menu
           
            System.out.println ("Menu:" //menu
                    + "\n 1-Agregar \n"  //menu
                    + "\n 2-Mostrar \n"  //menu
                    + "\n 3-Salir \n");  //menu
            
            switch (opc = sc.nextInt()){ //Se abre un switch para evaluar lo que elija el usuario de a cuerdo al menu
                case 1:  //caso uno Agregar
                    n.Agregar ();  //se manda a traer el metodo agregar de la case Nodo11
                    break; //cierra caso uno
                case 2: //caso dos Mostrar
                    n.Mostrar (); //se manda a traer el metodo mostrar de la clase Nodo11
                    break; //cierra caso dos
            }   
        } while (opc != 3);   // se ejecutara mientras opc sea diferente de 3
    } 
    
    public void Agregar (){ //Se crea el metodo Agregar 
        if (inicial == null) { //Se abre un condicional para saber si hay datos en la lista
            inicial = new Nodo (); 
            System.out.println ("Ingrese el nodo: "); // se le pide al usuario que ingrese un nodo
            inicial.Nombre = sc.nextLine(); //se almacena en inicial Nombre ya que en Nombre van los datos
        } else { //si no
            temporal = new Nodo (); //va a ver un nuevo nodo temporañ
            System.out.print ("Ingrese el nodo: "); //se pedira al usuario que ingrese un nodo
            temporal.Nombre = sc.nextLine(); //se almacena en temporal Nombre ya que en Nombre van los datos
        }
    }
   
    public void Mostrar(){ //se crea el metodo Mostrar
 
        if(inicial != null){ //Si inicial es diferente de null
        System.out.println(temporal +" "); //imprimir el dato que se encuentra en temporal
        while(next != null){ // hacer esto mientras next sea diferente de null
            System.out.print(next.Nombre + " "); 
            next = next.sig; //ira aumentando en lista
        }
    } else{
            System.out.println ("La lista esta vacia"); //mostrar que no hay datos en la lista
        }
    }
} //JESSICA VIRIDIANA GARCIA SILVA
    
    
