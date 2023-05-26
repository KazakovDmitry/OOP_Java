package Seminar1;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.brand = "ООО Чистый Источник";
        product1.name = "Бутылка с водой";
        product1.price = 125.15;
        System.out.println(product1.displayInfo());
    }
}
