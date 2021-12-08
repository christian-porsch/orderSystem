package orderSystem.repository;

import orderSystem.model.Product;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ProductRepo {

    private List<Product> products;

    public ProductRepo(List<Product> products) {
        this.products = Collections.unmodifiableList(products);
    }

    public List<Product> listAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return Optional.ofNullable(product);
            }
        }
        return Optional.empty();
    }
}
