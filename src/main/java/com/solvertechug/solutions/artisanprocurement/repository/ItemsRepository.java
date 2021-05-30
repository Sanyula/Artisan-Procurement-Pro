package com.solvertechug.solutions.artisanprocurement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solvertechug.solutions.artisanprocurement.domain.InventoryItem;

@Repository
public interface ItemsRepository extends JpaRepository<InventoryItem, Long>{

}
