public class Main {
    public static void main(String[] args) {
        int[] sales = { 2, 5, 7, 9, 18, 10, 0 };
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
        int averSale = manager.trimAverage();
        System.out.println(averSale);
    }
}
