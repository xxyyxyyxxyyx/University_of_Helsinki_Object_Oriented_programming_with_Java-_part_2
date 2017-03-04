/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author user
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory productHistory;
    
    public ProductContainerRecorder(String name, double capacity,double initialVolume) {
        super(name, capacity);
        super.setVolume(initialVolume);
        productHistory = new ContainerHistory();
        productHistory.add(initialVolume);
    }
    
    public String history(){
        return this.productHistory.toString();
    }
    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        productHistory.add(super.getVolume());
    }
    @Override
    public double takeFromTheContainer(double amount){
        double output = super.takeFromTheContainer(amount);
        productHistory.add(super.getVolume());
        
        return output;
      
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+this.history());
        System.out.println("Greatest product amount: "+productHistory.maxValue());
        System.out.println("Smallest product amount: "+productHistory.minValue());
        System.out.println("Average: "+productHistory.average());
        System.out.println("Greatest change: "+productHistory.greatestFluctuation());
        System.out.println("Variance: "+productHistory.variance());
    }
}
