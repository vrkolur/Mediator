package SocksExample;

public class TestStockMediator {

    public static void main(String[] args) {
        StockMediator nyse = new StockMediator();
        ColleagueVarun broker1 = new ColleagueVarun(nyse);
        ColleagueVishal broker2 = new ColleagueVishal(nyse);

        broker1.saleOffer("Google", 100);
        broker1.saleOffer("Microsoft", 23);

        broker2.buyOffer("Google", 100);
        broker2.saleOffer("Amazon",56);

        broker1.buyOffer("Amazon", 56);

        nyse.getStockOffering();
    }
}
