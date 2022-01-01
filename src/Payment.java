import java.text.NumberFormat;
import java.util.Locale;

public class Payment {

    public static void main(String[] args) {
        // payment number Format
        double payment = 13245.24;
        String us = NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(payment);
        String france = NumberFormat.getCurrencyInstance(new Locale("fr", "FR")).format(payment);
        System.out.println(us);
        System.out.println(india);
        System.out.println(china);
        System.out.println(france);
        // $13,245.24
        // ₹ 13,245.24
        // ￥13,245.24
        // 13 245,24 €
    }
}
