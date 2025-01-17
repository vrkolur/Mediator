package StockExamples;

import java.util.ArrayList;
import java.util.Objects;

public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSellOffers;


    private int colleagueCodes = 0;

    public StockMediator() {
        colleagues = new ArrayList<Colleague>();
        stockBuyOffers = new ArrayList<StockOffer>();
        stockSellOffers = new ArrayList<StockOffer>();
    }

    public void addColleague(Colleague newColleague, String name) {
        colleagues.add(newColleague);
        colleagueCodes++;
        newColleague.setColleagueCode(colleagueCodes);
        newColleague.setColleaugename(name);
    }

    public void saleOffer(String stock, int shares, int colleagueCode, String colleagueName) {
        boolean stockSold = false;

        for (StockOffer offer : stockBuyOffers) {
            if ((offer.getStockShare() >= shares) && (Objects.equals(offer.getStockSymbol(), stock))) {
                int currentStocks = offer.getStockShare();
                int remainingStocks = currentStocks - shares;
                offer.setStockShare(remainingStocks);
                System.out.println(shares + " shares of " + stock + " sold to colleague " + offer.getColleagueName());
                if(offer.getStockShare()==0)
                    stockBuyOffers.remove(offer);
                stockSold = true;
            }

            if (stockSold) break;

        }

        if (!stockSold) {
            System.out.println(shares + " share of " + stock + " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, colleagueCode, colleagueName );
            stockSellOffers.add(newOffering);

        }

    }

    public void buyOffer(String stock, int shares, int colleagueCode, String colleagueName) {

        boolean stockBought = false;
        for (StockOffer offer : stockSellOffers) {
            if ((Objects.equals(offer.getStockSymbol(), stock)) && (offer.getStockShare() >= shares)) {
                int currentStocks = offer.getStockShare();
                int remainingStocks = currentStocks - shares;
                offer.setStockShare(remainingStocks);
                System.out.println(shares + " shares of " + stock + " has been bought by " + offer.getColleagueName());
                if(offer.getStockShare()==0)
                    stockSellOffers.remove(offer);
                stockBought = true;
            }
            if (stockBought) {
                break;
            }
        }
        if(!stockBought){
            System.out.println(shares+ " shares of "+ stock+ " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, colleagueCode, colleagueName);
            stockBuyOffers.add(newOffering);
        }
    }



    public void getStockOffering(){
        System.out.println("\nStocks for sale are:\n");
        for(StockOffer offer: stockSellOffers) {
            System.out.println(offer.getStockShare() + " shares of " + offer.getStockSymbol());

        }
//        for(StockOffer offer: stockBuyOffers){
//            System.out.println(offer.getStockShare()+ " shares of "+ offer.getStockSymbol());
//        }

    }


}
