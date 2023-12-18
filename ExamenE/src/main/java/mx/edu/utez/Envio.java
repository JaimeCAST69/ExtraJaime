package mx.edu.utez;

import java.util.ArrayList;
import java.util.List;

public class Envio extends  Mercancia{

    List<Mercancia> mercancias = new ArrayList<>();



    public String distancia(int disntancia){
        String a= "";
        if(disntancia<0){
            a= "ingresa un valor positivo";
        }else{
            a ="Distancia Guardada";
        }
        return a;
    }

    public String peso(int peso1){
        String b="";
        if(peso1<0){
            b= "ingresa un valor positivo";
        }else{
            b ="Peso Guardado";
        }
        return b;
    }

    public Double costo(int peso1, String transporte){
        double costo3=0.0;
        switch (transporte){
            case "Terrestre":
                if (peso1<100 || peso1 == 100){
                    costo3= peso1*50;
                }else{
                    costo3 = peso1*40;
                }
                break;
            case "Maritimo":
                if (peso1<500 || peso1 == 500){
                    costo3= peso1*100;
                }else{
                    costo3 = peso1*80;
                }
                break;
            case  "Aereo":
                costo3= peso1*200;
                break;

        }
    return costo3;
    }


    public void enviarmercancia(int peso1, int distncia1, String numero1, String transporte, String fecha){
        double costo=0.0;
        switch (transporte){
            case "Terrestre":
                       if (peso1<100 || peso1 == 100){
                           costo= peso1*50;
                       }else{
                           costo = peso1*40;
                       }
                break;
            case "Maritimo":
                if (peso1<500 || peso1 == 500){
                    costo= peso1*100;
                }else{
                    costo = peso1*80;
                }
                break;
            case  "Aereo":
                costo= peso1*200;
                break;



        }

        Mercancia mer = new Mercancia(peso1,distncia1,numero1,transporte,fecha,costo);
        mercancias.add(mer);

    }

    public void verenvios(){
        for (Mercancia merca : mercancias ){
            System.out.printf("Peso"+ merca.getPeso() + "Numerodeenvio" +merca.getNumEnv() + "Distancia" + merca.getDistancia()+
                    "Trasnporte " + merca.getTransporte() + "fecha " + merca.getFecha() + "costo" + merca.getCosto());
        }
    }
}
