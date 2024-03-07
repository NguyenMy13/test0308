import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    // 特定の注文に関連するカートアイテムを検索するメソッドなど、追加のクエリメソッドを定義できます
}