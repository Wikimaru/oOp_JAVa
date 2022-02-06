package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
    Stock stock = new Stock("ORCL","Oracle Coperation");
    stock.setPreviousClosingPrice(34.5);
    stock.setCurrentPrice(34.35);
    System.out.println("Symbol:"+ stock.getSymbol());
    System.out.println("Name:"+ stock.getName());
    System.out.println("Previous Closing Price:"+ stock.getPreviousClosingPrice());
    System.out.println("Current Price:"+ stock.getCurrentPrice());
    stock.getChangePercent();
    }
    
}
