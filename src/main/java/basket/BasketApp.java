package basket;

public class BasketApp {

    private ProductsRepo repo;

    public BasketApp(ProductsRepo repo) {
        this.repo = repo;
    }

    public void addProductsToBasket(Product product) {
        if (!repo.isProductInBasket(product)){
            repo.addProductsToBasket(product);
        }else{
            throw new IllegalArgumentException();
        }
    }
}


