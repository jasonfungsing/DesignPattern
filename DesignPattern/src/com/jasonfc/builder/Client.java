package com.jasonfc.builder;

public class Client {
	
	public static void main(String[] args) {
		Director director = new Director();
		Builder builder = new ConcreteBuilder();

		director.Contruct(builder);
		Product product = builder.getResult();
		product.showProduct();
	}
}
