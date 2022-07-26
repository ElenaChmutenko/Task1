public class Main {
    public static void main(String[] args) {
        long[] sales = { 2,5,7,9,18,0 };
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}
