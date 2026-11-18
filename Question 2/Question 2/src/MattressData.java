/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeandrevisagie
 */
public class MattressData {
    
    private final String bedName;
    private final int numberOfBeds;

    public String getBedName() {
        return bedName;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getBedPrice() {
        return bedPrice;
    }

    public MattressData(String bedName, int numberOfBeds, double bedPrice) {
        this.bedName = bedName;
        this.numberOfBeds = numberOfBeds;
        this.bedPrice = bedPrice;
    }
    private final double bedPrice;
}
