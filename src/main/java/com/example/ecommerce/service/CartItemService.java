import com.example.ecommerce.model.CartItem;
import java.util.List;

public interface CartItemService {
    CartItem addCartItem(CartItem cartItem);
    List<CartItem> getAllCartItems();
    CartItem getCartItemById(Long id);
    CartItem updateCartItem(CartItem cartItem, Long id);
    void deleteCartItem(Long id);
}