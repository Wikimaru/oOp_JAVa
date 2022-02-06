package javaapplication1;

public class Stock {
    private String symbol,name;
    private double previousClosingPrice,currentPrice;
    
    public Stock(String symbol,String name)
    {
        this.symbol = symbol;
        this.name = name;
    }
    
    public void getChangePercent()
    {
        double Percent;
        Percent = (1-(currentPrice/previousClosingPrice))*100;
        if(currentPrice<previousClosingPrice)
        {
            Percent *= -1;
        }
        System.out.println("Price Change:"+ Percent);
        
    }
    public String getSymbol()
    {
        return symbol;
    }
    public String getName()
    {
        return  name;
    }
    public double getPreviousClosingPrice()
    {
        return previousClosingPrice;
    }
    public double getCurrentPrice()
    {
        return currentPrice;
    }
    public void setPreviousClosingPrice(double price)
    {
        previousClosingPrice = price;
    }
    public void setCurrentPrice(double price)
    {
        currentPrice = price;
    }
    
}
