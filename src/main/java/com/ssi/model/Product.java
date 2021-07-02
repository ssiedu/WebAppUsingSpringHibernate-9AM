package com.ssi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product {
	@Id
	private int pcode;
	private String pname;
	private int price;
	private int discount;
}
