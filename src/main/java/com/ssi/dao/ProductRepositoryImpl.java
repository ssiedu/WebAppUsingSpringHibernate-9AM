package com.ssi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ssi.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	private SessionFactory sessionFactory;
	
	public ProductRepositoryImpl() {
		Configuration config=new Configuration().configure();
		sessionFactory=config.buildSessionFactory();
	}
	
	public Product searchProduct(int code) {
		Session session=sessionFactory.openSession();
		Product product=session.get(Product.class, code);
		session.close();
		return product;
	}

}
