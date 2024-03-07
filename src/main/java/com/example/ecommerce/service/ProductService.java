import java.util.List;
import com.example.ecommerce.model.Product;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Product product, Long id);
    void deleteProduct(Long id);
    List<Product> searchProductsByName(String name);
}