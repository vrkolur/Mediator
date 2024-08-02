package StockExamples;

public class TestStockMediator {

    public static void main(String[] args) {
        StockMediator nyse = new StockMediator();
        ColleagueVarun broker1 = new ColleagueVarun(nyse, "Varun");
        ColleagueJohn broker2 = new ColleagueJohn(nyse, "John");


        broker1.saleOffer("Google", 100);
        broker1.saleOffer("Microsoft", 23);
        broker2.saleOffer("test1",12);

        broker2.buyOffer("Google", 50);

        broker2.buyOffer("Microsoft", 22);
        broker1.buyOffer("test1",12);

        nyse.getStockOffering();
    }
}
