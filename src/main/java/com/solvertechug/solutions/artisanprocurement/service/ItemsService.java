package com.solvertechug.solutions.artisanprocurement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solvertechug.solutions.artisanprocurement.domain.InventoryItem;
import com.solvertechug.solutions.artisanprocurement.repository.ItemsRepository;

@Service
public class ItemsService {
	
	@Autowired
	private ItemsRepository repo;
	
	public List<InventoryItem> listAll() {
        return repo.findAll();
    }
     
    public void save(InventoryItem item) {
        repo.save(item);
    }
     
    public InventoryItem get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
	

}
