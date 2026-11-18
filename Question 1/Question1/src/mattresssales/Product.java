
package mattresssales;

/**
 *
 * @author jeandrevisagie
 */
public class Product implements IProduct {
    private String mattress [];
    private int  totalSales[];
    public Product() {};
    
    public Product(String [] mattress, int[] totalSales) {
        this.mattress = mattress;
        this.totalSales = totalSales;
    }
    @Override
    public int GetTotalProductsSold () {
        int total = 0;
        for (int sale : this.totalSales) {
            total += sale;
        }
        return total;
    }
    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        return (double) total/this.totalSales.length;
        
    }   
    @Override
    public String GetMostPopularProduct () {
        int topIndex = 0;
        for (int i = 1; i<this.totalSales.length; i++) {
            if (this.totalSales [i] > this.totalSales [topIndex]) {
                topIndex = i;
            }
        }
        return this.mattress [topIndex];
    }
}
