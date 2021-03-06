/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.methods.Bubblesort;
import sort.methods.Insertionsort;
import sort.methods.Quicksort;
import sort.methods.Selectionsort;
import sort.strategy.Context;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        double[] dataNonSort = DataGenerator.generate(100000);
        
       /* Wzorzec Stratega */
        //...
        Context bubble = new  Context(new Bubblesort());
        long bubblestart = System.currentTimeMillis();
        double[] tab = bubble.perform(dataNonSort);
	long bubblestop = System.currentTimeMillis();
	System.out.println("Bubblesort: " + (bubblestop - bubblestart) + " ms");
        //for (int i=0; i<tab.length; i++)
        //{
        //    System.out.println(tab[i]);
        //}
        
        
        Context insertion = new  Context(new Insertionsort());
        long insertstart = System.currentTimeMillis();
        double[] tab2 = insertion.perform(dataNonSort);
	long insertstop = System.currentTimeMillis();
	System.out.println("Insertionsort: " + (insertstop - insertstart) + " ms");
        //for (int i=0; i<tab.length; i++)
        //{
        //    System.out.println(tab2[i]);
        //}
       
        Context quicksort = new  Context(new Quicksort());
        long quickstart = System.currentTimeMillis();
        double[] tab3 = quicksort.perform(dataNonSort);
	long quickstop = System.currentTimeMillis();
	System.out.println("Quicksort: " + (quickstop - quickstart) + " ms");
        
        Context selection = new  Context(new Selectionsort());
        long selectionstart = System.currentTimeMillis();
        double[] tab4 = selection.perform(dataNonSort);
	long selectionstop = System.currentTimeMillis();
	System.out.println("Selectionsort: " + (selectionstop - selectionstart) + " ms");
       
        
        /* odpowiedzi na pytania:
        1. Mo??na w ??atwy spos??b dodawa?? kolejne metody np. sortowania jak w 
        przypadku laboratorium bez integrowania w ca??y kod. Umo??liwia tym samym 
        wyb??r implementacji tzn algorytmy mog?? rozwi??zywa?? ten sam problem, lecz
        r????ni?? si?? uzyskanymi korzy??ciami.
        2. Tak, wzorzec strategii zapewnia mo??liwo???? zmiany algorytmu w trakcie 
        uruchomionego programu.
        3. Enkapsulacja poszczeg??lnych algorytm??w zrealizowana jest poprzez 
        utworzenie interfejsu, zawieraj??cego deklaracj?? metody np. Sortuj. 
        4. Stosowa?? ten wzorzec nale??y w sytuacji potrzeby wyboru z kilku 
        algorytm??w r????ni??cych si?? w??a??ciwo??ciami. U??ytkownik wybiera strategi?? 
        najlepiej dopasowan?? do jego potrzeb.
        */
        
    }
}
