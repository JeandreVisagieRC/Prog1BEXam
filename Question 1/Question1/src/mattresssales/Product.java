
package mattresssales;

/**
 *
 * @author jeandrevisagie
 */
public class Product implements IProduct {
    @Override
    public int TotalMattressSales (int[] mattressSales) {
        int total = 0;
        for (int sale : mattressSales) {
            total += sale;
        }
        return total;
    }
    @Override
    public String PopMattress (String [] mattress, int [] totalSales) {
        int topIndex = 0;
        for (int i = 1; i<totalSales.length; i++) {
            if (totalSales [i] > totalSales [topIndex]) {
                topIndex = i;
            }
        }
        return mattress [topIndex];
    }
}
