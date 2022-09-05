public class Main{
    public static void main(String[] args) {
        Product product1=new Product(1,"Lenovo V14",15000,"16 GB Ram",10); //Referans Oluşturma
        Product product2=new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setUnitPrice(16000);
        product2.setDetail("32 GB Ram");
        product2.setDiscount(10);


        // Product[] products={product1,product2};
        // for(Product product:products){
        //     System.out.println(product.name);
        // }
        // System.out.println(products.length);
        
        Category category1=new Category();
        category1.setId(1);
        category1.setName("Bilgisayar");

        Category category2=new Category();
        category2.setId(2);
        category2.setName("Ev/Bahçe");

        System.out.println(category1.getName());
        System.out.println(category2.getName());

        ProductManager productManager=new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
    }
}