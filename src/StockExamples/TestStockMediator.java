package StockExamples;

public class TestStockMediator {

    public static void main(String[] args) {
        StockMediator nyse = new StockMediator();
        Colleague broker1 = new Colleague(nyse, "Varun");
        Colleague broker2 = new Colleague(nyse, "John");


        broker1.saleOffer("Google", 100);
        broker1.saleOffer("Microsoft", 23);

        broker2.buyOffer("Google", 50);
//        broker2.saleOffer("Amazon",56);

        broker2.buyOffer("Microsoft", 22);

        nyse.getStockOffering();
    }
}
