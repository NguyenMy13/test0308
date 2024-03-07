import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.ecommerce.model.CartItem;
import com.example.ecommerce.repository.CartItemRepository;

@Service
public class CartItemServiceImpl implements CartItemService {

    private final CartItemRepository cartItemRepository;

    @Autowired
    public CartItemServiceImpl(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    public CartItem addCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    @Override
    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    @Override
    public CartItem getCartItemById(Long id) {
        return cartItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("CartItem not found with id " + id));
    }

    @Override
    public CartItem updateCartItem(CartItem updatedCartItem, Long id) {
        CartItem existingCartItem = getCartItemById(id);
        existingCartItem.setProduct(updatedCartItem.getProduct());
        existingCartItem.setQuantity(updatedCartItem.getQuantity());
        // 他のフィールドも更新可能
        return cartItemRepository.save(existingCartItem);
    }

    @Override
    public void deleteCartItem(Long id) {
        cartItemRepository.deleteById(id);
    }
}