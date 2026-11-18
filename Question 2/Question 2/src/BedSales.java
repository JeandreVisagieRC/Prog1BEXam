
/**
 *
 * @author jeandrevisagie
 */
public class BedSales implements IMattress{
    private static final double VAT = 0.14;
    
    @Override 
    public double CalculateTotalSale (int numberOfBeds, double bedPrice){
        double total = numberOfBeds *bedPrice* (1+VAT);
        return Math.round(total*100.0/100.0);//2 decimal places
    }
    @Override
    public boolean ValidateData (MattressData mattressData){
        String name = mattressData.getBedName();
        return name != null && !name.trim().isEmpty()
            && mattressData.getBedPrice()>0
            && mattressData.getNumberOfBeds()>0;
    }
    public String CreateReport (MattressData data) {
        String stars = "*".repeat(36);
        return "Sales report\n" + stars +"\n"
                +"Mattress name " + data.getBedName() +"\n"
                +"Mattress price " + data.getNumberOfBeds() +"\n"
                + "Total cost: R" + CalculateTotalSale(data.getNumberOfBeds(),data.getBedPrice()) + "\n";
    }
}
