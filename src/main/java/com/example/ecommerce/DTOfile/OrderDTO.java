import java.util.List;

public class OrderDTO {
    private Long id;
    private List<CartItemDTO> items;

    // Constructors, Getters, and Setters
    public OrderDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CartItemDTO> getItems() {
        return items;
    }

    public void setItems(List<CartItemDTO> items) {
        this.items = items;
    }
}