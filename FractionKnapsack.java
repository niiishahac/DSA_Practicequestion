import java.util.Arrays;

public class FractionKnapsack {
    static class Item{
        int value;
        int weight;
        Item(int value,int weight){
            this.value=value;
            this.weight=weight;
        }
    }
    public static double getMaxValue(Item[] arr,int W){
        // SORT BY VALUE/WIGHT RATIO IN DESC ORDER
        Arrays.sort(arr, (a,b) -> Double.compare((double)b.value/b.weight, (double)a.value/a.weight));
        double total=0.0;
        for(Item item:arr){
            if(W>=item.weight){
                total+=item.value;
                W-=item.weight;
            }
            else{
                total+=(double)item.value*W/item.weight;
                break;
            }
        }
        return total;
    }
    public static void main(String[] args){
        Item[] arr={
            new Item(60,10),
            new Item(100,20),
            new Item(120,30)
        };
        int W=50;
        double maxValue=getMaxValue(arr,W);
        System.out.println("Maximum value in Knapsack = "+maxValue);

    }
}
