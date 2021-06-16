/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.strategy;

/**
 *
 * @author agata
 */
public class Context {
    private ISortStrategy strategy;
    
    public void StrategyContext(ISortStrategy strategy){
        this.strategy = strategy;
    }
    
    public void perform(double[] array){
        strategy.Sortuj(array);
    }
}
