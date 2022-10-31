public class DiscountsOnShirts {

    public static void main(String args[]) {

        int  priceOfOneShirtWithoutDiscount = 2000;
        System.out.println("Цена одной рубашки без скидки - " + priceOfOneShirtWithoutDiscount + " руб.");

        int countOfShirtsSelected = 1;
        System.out.println("Количество уже выбранных рубашек - " + countOfShirtsSelected + " шт.");

        int  countOfShirtsToBuyToGetDiscount = 4;
        System.out.println("Количество рубашек, которые надо купить, чтобы получить скидку - " + countOfShirtsToBuyToGetDiscount + " шт.");

        int countOfShirtsToPurchasedOnesToGetDiscount = countOfShirtsToBuyToGetDiscount - countOfShirtsSelected;
        System.out.println("Количество рубашек, которые надо добавить к купленным, чтобы получить скидку - " + countOfShirtsToPurchasedOnesToGetDiscount + " шт.");

        int totalPriceOfSelectedShirtsWithoutDiscount = priceOfOneShirtWithoutDiscount * countOfShirtsSelected;
        System.out.println("Общая цена уже выбранных рубашек без скидки - " + totalPriceOfSelectedShirtsWithoutDiscount + " руб." );

        int totalPriceOfShirtsWithoutDiscountThatYouNeedToBuyToGetDiscount = countOfShirtsToPurchasedOnesToGetDiscount * priceOfOneShirtWithoutDiscount;
        System.out.println("Общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку - " + totalPriceOfShirtsWithoutDiscountThatYouNeedToBuyToGetDiscount + " руб.");

        float discountPercentage = 50;
        System.out.println("Размер скидки - " + discountPercentage + " %.");

        float priceOfAllShirtsWithDiscount = (priceOfOneShirtWithoutDiscount * countOfShirtsToBuyToGetDiscount) - (((priceOfOneShirtWithoutDiscount * countOfShirtsToBuyToGetDiscount)/100) * discountPercentage);
        System.out.println("Цена всех рубашек со скидкой - " + priceOfAllShirtsWithDiscount + " руб.");

        float priceOfOneShirtWithDiscount = priceOfAllShirtsWithDiscount / countOfShirtsToBuyToGetDiscount;
        System.out.println("Цена одной рубашки со скидкой - " + priceOfOneShirtWithDiscount + " руб." );

        float  amountOfMoneySavedWhenBuyingDiscountedShirts = ((priceOfOneShirtWithoutDiscount * countOfShirtsToBuyToGetDiscount)/100) * discountPercentage;
        System.out.println("Количество сэкономленных денег, если рубашки куплены со скидкой - " + amountOfMoneySavedWhenBuyingDiscountedShirts + " руб.");

        float  countOfShirtsThatAreReceivedForFreeDueToDiscount = amountOfMoneySavedWhenBuyingDiscountedShirts / priceOfOneShirtWithoutDiscount;
        System.out.println("Количество рубашек, которые из-за скидки получены бесплатно - " + countOfShirtsThatAreReceivedForFreeDueToDiscount + " шт." );

    }
}
