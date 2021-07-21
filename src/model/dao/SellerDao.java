package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	// to add, delete, update and search information on the database. 
	void insert(Seller obj);
	void update (Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();

}
