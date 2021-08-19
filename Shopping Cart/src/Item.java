public class Item {
    String name;
    float price;

    public Item(String ref, float cost){
        price = cost;
        name = ref;}
    }
    class StockRoom {
        final com.company.Item apple = new com.company.Item("Apple", 0.10f);
        final com.company.Item plumb = new com.company.Item("Plumb", 0.15f);
        final com.company.Item pear = new com.company.Item("Pear", 0.20f);
        final com.company.Item banana = new com.company.Item("Banana", 0.30f);
        final com.company.Item mango = new com.company.Item("Mango", 0.50f);
}
