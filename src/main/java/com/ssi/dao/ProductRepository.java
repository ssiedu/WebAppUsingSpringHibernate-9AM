package com.ssi.dao;

import com.ssi.model.Product;

public interface ProductRepository {
	public Product searchProduct(int code);
}
