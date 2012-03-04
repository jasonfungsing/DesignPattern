package com.jasonfc.builder;

public class ConcreteBuilder extends Builder {

	Product product = new Product();

	@Override
	public Product getResult() {
		return product;
	}

	@Override
	public void buildPartA() {
		product.add("A part");
	}

	@Override
	public void buildPartB() {
		product.add("B part");
	}

}
