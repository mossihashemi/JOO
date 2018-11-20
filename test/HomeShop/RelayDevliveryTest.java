package HomeShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayDevliveryTest {
    @Test
    public void Given_FreeRelay_WhenGettingDeliveryPrice_ThenGet0e(){
        Delivery delivery = new RelayDevlivery(5);
        assertEquals(0.0, delivery.getPrice(),0.01);
    }

    @Test
    public void Given_LowPriceRelay_WhenGettingDeliveryPrice_ThenGet2e99(){
        Delivery delivery = new RelayDevlivery(27);
        assertEquals(2.99 , delivery.getPrice(),0.01);
    }

    @Test
    public void Given_HighPriceRelay_WhenGettingDeliveryPrice_ThenGet4e99(){
        Delivery delivery = new RelayDevlivery(52);
        assertEquals(4.99, delivery.getPrice(),0.01);
    }

}