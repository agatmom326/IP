/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

import sort.strategy.ISortStrategy;

/**
 *
 * @author LeopardProMK
 */
public class Quicksort implements ISortStrategy {
    
   @Override
    public double[] Sortuj(double[] arr) {
        arr = quicksort(arr,0, arr.length-1);
        return arr;
    }
    
    private static double[] quicksort(double[] tab, int x, int y) {
        int i,j;
        double temp,v;
        i=x;
        j=y;
        v=tab[(x+y) / 2];
        do {
            while (tab[i]<v)
                i++;
            while (v<tab[j])
                j--;
            if (i<=j) {
                temp=tab[i];
                tab[i]=tab[j];
                tab[j]=temp;
                i++;
                j--;
            }
        }
        while (i<=j);
        if (x<j)
            quicksort(tab,x,j);
        if (i<y)
            quicksort(tab,i,y);
        
        return tab;
    }
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-szybkie-quicksort/quick-j.html */
}

