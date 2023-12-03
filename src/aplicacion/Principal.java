package aplicacion;


import dominio.Articulo; 
import dominio.Proyecto; 
import dominio.Catedratico;

import dominio.ProfesorTitular; 


public class Principal {   
public static void main(String[] args){  

//El primer parámetro del constructor es el título y, el

//segundo, el índice de impacto.

Articulo articulo1 = new Articulo("El gran invento",

1.367);

Articulo articulo2 = new Articulo("Lo nunca visto",

2.765);

Articulo articulo3 = new Articulo("Pasen y vean",1.987);

Articulo articulo4 = new Articulo("El no va más del " +"qué se yo", 2.134);





Proyecto proyecto1 = new Proyecto("El puente de " +"Villar del Río",1000000);

Proyecto proyecto2 = new Proyecto("El acueducto de " +"Villar del Campo", 2000000);

Proyecto proyecto3 = new Proyecto("El sistema de " +"información de " + "Villar del Río", 1200000);



ProfesorTitular pt1 = new ProfesorTitular();



System.out.println("La valoración de profesor titular "+ "pt1 es " + pt1.calcularValoracion());

System.out.println("La valoración del catedrático ct1es "+ ct1.calcularValoracion());

}

@Override
public String toString() {
    return "Principal []";
}
}
