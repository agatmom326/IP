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
public class Selectionsort implements ISortStrategy {
    
   @Override
    public double[] Sortuj(double[] numbers) {
        int n = numbers.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;
 
            double temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }
        double n1;
         n1 = numbers.length;
         
        return numbers;
    }
}

