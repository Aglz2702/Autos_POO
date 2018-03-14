/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utbis
 */
import java.util.ArrayList;
import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
         
        boolean flag=true;
        boolean flag2=false;
        
        Auto camioneta = new Auto("Rojo",false,"Ford Lobo","txt-45-21",5,356000);
        Auto  coche = new Auto("Azul",false,"Versa","sxl3334",8,450);
        Auto camioneta2 = new Auto("Amarillo",false,"Q5","jhs32-45",4,950451);
        Auto coche2 = new Auto("Verde",false,"Focus","15-67-ffgg",4,120410);
        Auto camion = new Auto("Negro",false,"Peterbit","plw-45-22",5,1200657);
        
        
        ArrayList<Auto>Almacen=new ArrayList();
        
        Almacen.add(camioneta);
        Almacen.add(coche);
        Almacen.add(camioneta2);
        Almacen.add(coche2);
        Almacen.add(camion);
        
        

        
        do{
         try{
             System.out.println("***** MENU PRINCIPAL *****");
        System.out.println("1.- Mostrar vehiculos disponibles");
        System.out.println("2.- Modificar vehiculo");
        System.out.println("3.- Agregar un vehiculo");
        System.out.println("4.- Borrar un vehiculo");
        System.out.println("5.- Salir");
        System.out.println("->");
        int des=Entrada.nextInt();
        
        //Muestra informacion de los vehiculos disponibles
        
        
        switch(des){
            case 1:
                
                
                ////
                 System.out.println("\n");
                System.out.println("Vehiculos en Almacen");
                int index=1;
                
                for (Auto auto : Almacen) {
                    System.out.println("id.-"+index+" "+auto.getMarca());
                    System.out.println("/////////////////////////");
                    index++;
                }
                /////
                int res=0;
                System.out.println("\n");
                System.out.println("Introduce el numero de vehiculo para ver mas detalles");
                res=Entrada.nextInt();
                int total=res-1;
                System.out.println("+++++++++++++++++++++++++++++++++");
                System.out.println(Almacen.get(total).toString());
                System.out.println("+++++++++++++++++++++++++++++++++");
                
                flag2=true;
            break;
                
            //Modifica un vehiculo dentro de la lista 
            case 2:
                System.out.println("\n");
                System.out.println("-INGRESA EL NUMERO DE VEHICULO A MOFIDICAR-");
                int j=1;
                for(Auto temp:Almacen)
                    {
                        System.out.println("id.-"+j+" "+temp.getMarca());
                        j++;
                    }
                int aux2=0;
                System.out.println("introduce el id que deseas modificar: ");
                aux2=Entrada.nextInt();
                int tot=aux2-1;
                System.out.println("+++++++++++++++++++++++++++++++++");
                System.out.println("Coche a modificar:\n "+Almacen.get(tot).toString());
                System.out.println("+++++++++++++++++++++++++++++++++");
                            
                            System.out.println("Cual sera el nuevo color?");
                            String ncolorco2=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplacaco2=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int npersonco2=Entrada.nextInt();
                            Almacen.get(tot).setColor(ncolorco2);
                            Almacen.get(tot).setPlacas(nplacaco2);
                            Almacen.get(tot).setPersonas(npersonco2);
                            System.out.println("\n");
                            flag2 = true;
                            System.out.println("\n");
                break; 
            
            //Resistra un vehiculo dentro de la lista 
            case 3:
                    System.out.println("+++ REGISTRO DE VEHICULO +++");
                    System.out.println("Ingresa el color del vehiculo?");
                    String colorR=Entrada.next();
                    System.out.println("Ingresa la marca del vehiculo?");
                    String marcaR=Entrada.next();
                    System.out.println("Ingresa el numero de placas del vehiculo?");
                    String placasR=Entrada.next();
                    System.out.println("Ingresa el numero de pasajeros que soporta del vehiculo?");
                    int pasajerosR=Entrada.nextInt();
                    System.out.println("Ingresa el precio");
                    float precioR=Entrada.nextFloat();
                    Auto aux = new Auto(colorR,false,marcaR,placasR,pasajerosR,precioR);
                    Almacen.add(aux);
                    
                    flag2=true;
                    System.out.println("\n");
            break;
            
            //Borra un vehiculo de la lista
            case 4:
                    System.out.println("\n");
                System.out.println("-Vehiculos en Almacen-");
                int k=1;
                for(Auto temp:Almacen)
                    {
                        System.out.println("id.-"+k+" "+temp.getMarca());
                        k=k+1;
                    }
                System.out.println("\n");
                System.out.println("Numero de vehiculo a eliminar");
                int var=Entrada.nextInt();
                int resu=var-1;
                
                Almacen.remove(resu);
                System.err.println("VEHICULO BORRADO!");
            break;
            
            //Cierra el programa
            case 5:
                    flag2 = false;
                    flag = false;
            break;
        }//end of switch
         if(des>5 || des<1){
                         System.err.println("OPCION INCORRECTA!");
                         flag2 = true;
                    }
                } catch (Exception ex) {
                    System.err.println("Vehiculo no encontrado!");
                    flag2 = true;
                }
            System.out.println("\n");
            } while(flag2);
        
        
        
        
        
    }
    
    
}
