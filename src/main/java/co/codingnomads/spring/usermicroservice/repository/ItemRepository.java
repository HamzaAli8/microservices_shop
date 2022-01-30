package co.codingnomads.spring.usermicroservice.repository;

import co.codingnomads.spring.usermicroservice.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByName(String name);
}
