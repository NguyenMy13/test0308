import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // 追加のクエリメソッドをここに定義することが可能です（例：ユーザーIDによる注文の検索）
}