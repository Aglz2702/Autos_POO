/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utbis
 */
public class Auto {
    
    private String color;
    private boolean status;
    private String marca;
    private String placas;
    private int personas;
    private float precio;
    
    public Auto(String color,boolean status,String marca,String placas,int personas,float precio)
    {
        this.color=color;
        this.status=status;
        this.marca=marca;
        this.placas=placas;
        this.personas=personas;
        this.precio=precio;
    }
    
    public void encender(boolean a)
    {
        this.status=a;
    }
    
    public String getColor()
    {
        System.out.println("Color:"+color);
        return color;
    }
    
    public void setColor(String ncolor)
    {
        this.color=ncolor;
    }
    public boolean getPrender()
    {
        if(status)
        {
            System.out.println("Prendido");
        }
        else
        {
            System.out.println("Apagado");
        }
        return status;
    }
    public String getMarca()
    {
        return marca;
    }
    public String getPlacas()
    {
        System.out.println("Numero de placa:"+placas);
        return placas;
    }
    public float getPrecio()
    {
        return precio;
    }
     public void setPlacas(String nplacas)
    {
        this.placas=nplacas;
    }
    public int getPersonas()
    {
        System.out.println("Hay:"+" "+personas+" "+"personas");
        return personas;
    }
     public void setPersonas(int npersonas)
    {
        this.personas=npersonas;
    }
     public void setPrecio(float nprecio)
     {
         this.precio=nprecio;
     }
    
     @Override
     public String toString(){
    String aux="";
    aux="Color de vehiculo:"+" "+color+"\n"+"La marca es: "+" "+marca+"\n"+"Numero de placas"+" "+placas+"\n"+"Hay"+" "+personas+" "+"personas\n"+"El auto esta ";
        if(status){
       aux=aux+"Encendido"+"\nPrecio:"+precio;
       
        }else{
       aux=aux+"Apagado"+"\nPrecio:"+precio;
        }
   return aux;
}
    
    
}
    

