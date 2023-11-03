package com.noctowl.pdv.repository;

import com.noctowl.pdv.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Long> {
}
