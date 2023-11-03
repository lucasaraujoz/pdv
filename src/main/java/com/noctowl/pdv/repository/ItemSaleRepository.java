package com.noctowl.pdv.repository;

import com.noctowl.pdv.entity.ItemSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemSaleRepository extends JpaRepository<ItemSale, Long> {
}
