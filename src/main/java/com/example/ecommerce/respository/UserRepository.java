import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // ここにカスタムクエリメソッドを定義することができます（例：ユーザー名での検索）
}