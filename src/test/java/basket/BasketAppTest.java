package basket;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class BasketAppTest {

    @Mock
    private ProductsRepo repo;

    @Test
    public void addProductsToBasket() {
        //Given
        BasketApp basket= new BasketApp(repo);
        Product p= new Product(123, "Mleko");
        Mockito.when(repo.isProductInBasket(p)).thenReturn(false);
        //When
            basket.addProductsToBasket(p);
        //Then
        Mockito.verify(repo).addProductsToBasket(p);

    }
}