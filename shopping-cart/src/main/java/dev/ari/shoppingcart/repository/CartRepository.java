package dev.ari.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import dev.ari.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
