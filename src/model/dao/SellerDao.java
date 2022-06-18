package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller sellerObj);
    void update(Seller sellerObj);
    void deleteById(Integer Id);
    Seller findById(Integer Id);
    List<Seller> findAll();
}
