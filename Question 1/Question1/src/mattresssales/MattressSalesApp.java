
package mattresssales;

/**
 *
 * @author jeandrevisagie
 */
public class MattressSalesApp {
    public static void main(String[] args) {
        String [] mattressName = {"Cozy Nights Monarch","Restonic Barbados","Sealy Phuket"};//mattress names
        String [] months = {"Month 1", "Month 2", "Month 3"};//month number
        int [][] mattressSales = {
            {25,18,20},//cozy nights monarch
            {15,10,12},//restonic barbados
            {18,15,20}//sealy phuket
        };
        Product mattresses = new Product();
        int[] totalSales = new int [mattressName.length];
        
        System.out.println("Mattress Sales Report - 2026");
        System.out.println();
        System.out.printf ("%-22s", "");
        for (String month : months) {
            System.out.printf ("%-10s", month);
        }
        System.out.println();
        System.out.println ("-".repeat (52));
        
        for (int i = 0; i < mattressName.length; i++) {
            System.out.printf ("%-22s", mattressName [i]);
            for (int j = 0; j < months.length; j++) {
                System.out.printf ("%-10d", mattressSales[i][j]);
            mattresses = new Product (mattressName, mattressSales[i]);
            totalSales [i] = mattresses.GetTotalProductsSold();
            System.out.println();
            }
            
            }
        System.out.println();
        mattresses = new Product(mattressName, totalSales);
            for (int i=0; i< mattressName.length; i++) {
                System.out.println ("Total mattress sales for "+ mattressName [i] + " " + totalSales [i]);
        }
            System.out.println();
            System.out.println("Top performing mattress: "+ mattresses.GetMostPopularProduct());
    }
}
//in accordance with communication from the lecturer, permissible AI use was used to troubleshoot difficult to solve errors. code remains human written and not AI generated