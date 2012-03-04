package com.jasonfc.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

	List<String> parts = new ArrayList<String>();

	public void add(String part) {
		parts.add(part);
	}

	public void showProduct() {
		for (String part : parts) {
			System.out.println(part);
		}
	}
}
