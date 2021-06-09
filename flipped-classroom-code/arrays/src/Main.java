public class Main {
    public static void main(String[] args) {
        int[] prices = {1,4,8,9};
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        for (int price: prices) {
            System.out.println(price);
        }
    }
}
