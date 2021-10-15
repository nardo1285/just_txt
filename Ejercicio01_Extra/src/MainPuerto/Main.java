/*
En un puerto se alquilan amarres para barcos de distinto tipo. 

Para cada Alquiler se guarda: 
- El nombre del cliente, 
- Documento del cliente, 
- La fecha de alquiler, 
- Fecha de devolución, 
- La posición del amarre y 
- El barco que lo ocupará.

Un Barco se caracteriza por: 
- Su matrícula, 
- Su eslora en metros y 
- Año de fabricación.

Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco:
_En los veleros se suma el número de mástiles, 
_En los barcos a motor se le suma la potencia en CV y 
_En los yates se suma la potencia en CV y el número de camarotes.


Utilizando la herencia de forma apropiada, deberemos programar en Java, las
clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler.
*/
package MainPuerto;

import Atributos.Alquiler;
import Atributos.Barco;
import Atributos.Motorizado;
import Atributos.Velero;
import Atributos.Yate;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Este programa, tendrá un listado (base de datos) de barcos ya precargados
        //y al momento de alquilar, se cargarán los datos del alquiler y se pedirá 
        //seleccionar el barco a alquilar (ya precargado).
        //No se hará menú de carga de datos
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int menu;
        
        //CARGA DE BARCOS
        Velero nuevoV1 = new Velero(3, "HFI-755", 30, 1990, 300);
        Velero nuevoV2 = new Velero(2, "HWR-345", 16, 2000, 160);
        
        Motorizado nuevoM1 = new Motorizado(60, "URT-152", 18, 2010, 180);
        Motorizado nuevoM2 = new Motorizado(40, "QSA-222", 10, 2009, 100);
        
        Yate nuevoY1 = new Yate(90, 4, "SW-15", 42, 1999, 420);
        Yate nuevoY2 = new Yate(80, 2, "VB-34", 35, 2019, 350);
        
        //CARGO EL LISTADO 
        ArrayList<Barco> listadoBarcos = new ArrayList();
        
        listadoBarcos.add(nuevoV1);
        listadoBarcos.add(nuevoV2);
        listadoBarcos.add(nuevoM1);
        listadoBarcos.add(nuevoM2);
        listadoBarcos.add(nuevoY1);
        listadoBarcos.add(nuevoY2);
                
        //Se crea una colección para almacenar los usuarios con sus alquileres
        ArrayList<Alquiler> listadoAlq = new ArrayList();    

        do{
            System.out.println("|------------ SISTEMA PARA ALQUILAR BARCOS ------------|");
            System.out.println("1-Nuevo alquiler");
            System.out.println("2-Listado de usuarios");
            System.out.println("3-Listado de barcos");
            System.out.println("4-Precio a pagar por el alquiler");
            System.out.println("5-Fin.-");
            System.out.println("|-------------------------****-------------------------|");
            menu = leer.nextInt();
            
           
            
            switch (menu){
                case 1:
                    //Salteo la carga de datos y genero un nuevoAlq con los datos ya cargados
                    //mas abajo
                    
                    //Alquiler nuevoAlq = new Alquiler();
                    /*
                    System.out.print("Ingrese el Nombre del usuario ->");
                    String nombre = leer.next();
                    
                    System.out.print("DNI ->");
                    Double dni = leer.nextDouble();
                    
                    System.out.print("Fecha de INICIO del alquiler [DD/MM/AAAA]-> ");
                    Integer dia = leer.nextInt();
                    System.out.print("/");
                    Integer mes = leer.nextInt();
                    System.out.print("/");
                    Integer anio = leer.nextInt();
                    System.out.print(".-");
                    
                    System.out.print("Fecha de FIN del alquiler [DD/MM/AAAA]-> ");
                    Integer diaF = leer.nextInt();
                    System.out.print("/");
                    Integer mesF = leer.nextInt();
                    System.out.print("/");
                    Integer anioF = leer.nextInt();
                    System.out.print(".-");
                    
                    System.out.print("Posición del amarre [1 al 10]->");
                    Integer posicion = leer.nextInt();
                    */
                    
                    System.out.println("Elija el barco de la siguiente lista:");
                    int count = 1;
                    for (Barco listadoBarco : listadoBarcos) {
                        System.out.print("- "+ count++ +" ");
                        listadoBarco.resumenBoat();
                    }
                    
                    int bar = leer.nextInt();
                    //Cargo las fechas en 'LocalDate' y devuelvo un período
                    //LocalDate fechaI = LocalDate.of(anio, mes, dia);
                    //LocalDate fechaF = LocalDate.of(anioF, mesF, diaF);
                    LocalDate fechaI = LocalDate.of(2021, 12, 10);
                    LocalDate fechaF = LocalDate.of(2021, 12, 16);
                    
                    //Aquí con 'Double.valueOf' convierto el paréntesis en Double para 
                    //poder continuar con el cálculo
                    Double periodo = Double.valueOf(Period.between(fechaI, fechaF).getDays());
                    
                    //Aquí cargo todos los datos relevados del Alquiler, junto con la selección del Barco
//                    nuevoAlq.setNombre(nombre);
//                    nuevoAlq.setDni(dni);
//                    nuevoAlq.setDiaAlq(dia);
//                    nuevoAlq.setMesAlq(mes);
//                    nuevoAlq.setAnioAlq(anio);
//                    nuevoAlq.setDiaDev(diaF);
//                    nuevoAlq.setMesDev(mesF);
//                    nuevoAlq.setAnioDev(anioF);
//                    nuevoAlq.setPosicionAma(posicion);
//                    nuevoAlq.setBarco(listadoBarcos.get(bar-1));
//                    nuevoAlq.setPeriodo(periodo);
                    
                    //public Alquiler(Double precio, String nombre, Double dni, Integer diaAlq, Integer mesAlq, 
                    //Integer anioAlq, Integer diaDev, Integer mesDev, Integer anioDev, Integer posicionAma, 
                    //Barco barco, Double periodo) {                    
                    

                    //Calculo el costo del Alquiler
                    Double precio = (periodo * listadoBarcos.get(bar-1).moduloTotal());
                    
                    
                    Alquiler nuevoAlq = new Alquiler(precio, "Leo", 32323232d,10,12,2021,16,12,2021,4,listadoBarcos.get(bar-1),periodo);
                    
                    //Cargo todos los datos en la Colección de alquileres
                    listadoAlq.add(nuevoAlq);
                    
                    break;
                    
                case 2:
                    for (Alquiler arg : listadoAlq) {
                        System.out.println(arg.usuario());
                        
                    }
 
                    break;
                
                case 3:
                    for (Barco arg : listadoBarcos) {
                        System.out.println(arg.toString());
                        System.out.println("------------");
                    }
                    break;
                    
                case 4:
                    for (Alquiler alquiler : listadoAlq) {
                        System.out.println(alquiler.toString());
                        System.out.println("------------");
                    }
                    break;
            }
                    
        }while(menu != 5);
        
        
        
        
        
                  
    }
    
}
